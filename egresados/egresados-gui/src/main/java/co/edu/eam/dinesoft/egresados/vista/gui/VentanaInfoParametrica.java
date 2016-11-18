/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.dinesoft.egresados.vista.gui;

import co.edu.eam.dinesoft.egresados.vista.controladores.ControladorVentanaInfoParametrica;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Facultad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.engine.transaction.jta.platform.spi.JtaPlatformProvider;

/**
 *
 * @author Didier Narv�ez
 */
public class VentanaInfoParametrica extends javax.swing.JFrame implements ActionListener {

	private ControladorVentanaInfoParametrica controlador;
	private Programa programaBuscado;
	private Facultad facBuscada;
	private AreasInteres areaBuscada;

	/**
	 * Creates new form VentanaInfoParametrica
	 */
	public VentanaInfoParametrica() {
		controlador = new ControladorVentanaInfoParametrica();
		programaBuscado = null;
		facBuscada = null;
		areaBuscada = null;
		initComponents();
		setLocationRelativeTo(this);
		jpColor jpVista = new jpColor();
		jpVista.setSize(this.getSize());
		pintarPanelPrincipal();
		pintarPanelRegistro();
		refrescarComboFacultad();
		jBInicio.addActionListener(this);
		jBBuscar.addActionListener(this);
		jBEditar.addActionListener(this);
		jBRegistrar.addActionListener(this);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jTPestania = new javax.swing.JTabbedPane();
        jPGestionFacul = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTFNomFac = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFCodFac = new javax.swing.JTextField();
        jPGestionProgra = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTFNombrePro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFCreditos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFCodPro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCBFacultad = new javax.swing.JComboBox();
        jPGestionAreasIntre = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jTFNomArea = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFCodArea = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jBInicio = new javax.swing.JButton();
        jPOpciones = new javax.swing.JPanel();
        jBRegistrar = new javax.swing.JButton();
        jBEditar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTPestania.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N
        jTPestania.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTPestaniaStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Nombre Facultad :");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("C�digo Facultad :");

        javax.swing.GroupLayout jPGestionFaculLayout = new javax.swing.GroupLayout(jPGestionFacul);
        jPGestionFacul.setLayout(jPGestionFaculLayout);
        jPGestionFaculLayout.setHorizontalGroup(
            jPGestionFaculLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGestionFaculLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPGestionFaculLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCodFac, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTFNomFac, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPGestionFaculLayout.setVerticalGroup(
            jPGestionFaculLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGestionFaculLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFCodFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFNomFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jTPestania.addTab("Gesti�n Facultades", jPGestionFacul);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nombre del programa");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Cr�ditos del programa");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("C�digo Del Programa :");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Facultad");

        javax.swing.GroupLayout jPGestionPrograLayout = new javax.swing.GroupLayout(jPGestionProgra);
        jPGestionProgra.setLayout(jPGestionPrograLayout);
        jPGestionPrograLayout.setHorizontalGroup(
            jPGestionPrograLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGestionPrograLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPGestionPrograLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPGestionPrograLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jTFNombrePro)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jTFCreditos)
                        .addComponent(jTFCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPGestionPrograLayout.setVerticalGroup(
            jPGestionPrograLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPGestionPrograLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFCodPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCBFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jTPestania.addTab("Gesti�n De Programa", jPGestionProgra);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Nombre Del Area :");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("C�digo Del Area :");

        javax.swing.GroupLayout jPGestionAreasIntreLayout = new javax.swing.GroupLayout(jPGestionAreasIntre);
        jPGestionAreasIntre.setLayout(jPGestionAreasIntreLayout);
        jPGestionAreasIntreLayout.setHorizontalGroup(
            jPGestionAreasIntreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGestionAreasIntreLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPGestionAreasIntreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNomArea, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPGestionAreasIntreLayout.setVerticalGroup(
            jPGestionAreasIntreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPGestionAreasIntreLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFCodArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jTFNomArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTPestania.addTab("Gesti�n Areas De Interes", jPGestionAreasIntre);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel1.setText("Informaci�n Param�trica");

        jBInicio.setBackground(new java.awt.Color(255, 255, 255));
        jBInicio.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496349_home.png"))); // NOI18N
        jBInicio.setText("INICIO");

        jPOpciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "OPCIONES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jBRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        jBRegistrar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jBRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496828_Add-Male-User.png"))); // NOI18N
        jBRegistrar.setText("REGISTRAR");

        jBEditar.setBackground(new java.awt.Color(255, 255, 255));
        jBEditar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496619_interact.png"))); // NOI18N
        jBEditar.setText("EDITAR");

        jBBuscar.setBackground(new java.awt.Color(255, 255, 255));
        jBBuscar.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496705_search.png"))); // NOI18N
        jBBuscar.setText("BUSCAR");

        javax.swing.GroupLayout jPOpcionesLayout = new javax.swing.GroupLayout(jPOpciones);
        jPOpciones.setLayout(jPOpcionesLayout);
        jPOpcionesLayout.setHorizontalGroup(
            jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcionesLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPOpcionesLayout.setVerticalGroup(
            jPOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcionesLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jBRegistrar)
                .addGap(28, 28, 28)
                .addComponent(jBBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jBEditar)
                .addGap(68, 68, 68))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471550032_graph.png"))); // NOI18N

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(100, 100, 100))
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jTPestania, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)))
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(411, 411, 411))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPPrincipalLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jPOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPPrincipalLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jTPestania, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTPestaniaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTPestaniaStateChanged
        // TODO add your handling code here:
    	refrescarComboFacultad();
    }//GEN-LAST:event_jTPestaniaStateChanged

	public class jpColor extends javax.swing.JPanel {

		private Color color1 = Color.BLACK;
		private Color color2 = Color.WHITE;

		public jpColor() {
		}

		public jpColor(Color c1, Color c2) {
			color1 = c1;
			color2 = c2;
		}

		public void paint(Graphics g) {
			Graphics2D g2 = (Graphics2D) g.create();
			Rectangle clip = g2.getClipBounds();
			g2.setPaint(new GradientPaint(0.0f, 0.0f, color1.darker(), 0.0f, getHeight(), color2.darker()));
			g2.fillRect(clip.x, clip.y, clip.width, clip.height);
		}
        
        public void setVistaColor() {
            this.color1 = new Color(66, 111, 166);
            this.color2 = new Color(103, 174, 118);
        }

	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBInicio;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JComboBox jCBFacultad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPGestionAreasIntre;
    private javax.swing.JPanel jPGestionFacul;
    private javax.swing.JPanel jPGestionProgra;
    private javax.swing.JPanel jPOpciones;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JTextField jTFCodArea;
    private javax.swing.JTextField jTFCodFac;
    private javax.swing.JTextField jTFCodPro;
    private javax.swing.JTextField jTFCreditos;
    private javax.swing.JTextField jTFNomArea;
    private javax.swing.JTextField jTFNomFac;
    private javax.swing.JTextField jTFNombrePro;
    private javax.swing.JTabbedPane jTPestania;
    private javax.swing.JTabbedPane jTabbedPane2;
    // End of variables declaration//GEN-END:variables

	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == jBInicio) {
			this.dispose();
		}

		if (arg0.getSource() == jBEditar) {
			if (jTPestania.getSelectedIndex() == 1) {
				// Tomando datos Programa

				try {

					if (programaBuscado == null) {
						JOptionPane.showMessageDialog(null, "Debe buscar antes de editar");
					} else {

						int cod = Integer.parseInt(jTFCodPro.getText());
						String nom = jTFNombrePro.getText();
						int creditos = Integer.parseInt(jTFCreditos.getText());
						Facultad fac = (Facultad) jCBFacultad.getSelectedItem();

						Programa p = new Programa(cod, fac, nom, creditos);

						controlador.editarPro(p);
						JOptionPane.showMessageDialog(null, "El programa se ha editado exitosamente");
					}
				} catch (Exception exc) {
					exc.printStackTrace();
				}

			} else if (jTPestania.getSelectedIndex() == 0) {
				// Tomando datos Facultad

				try {

					if (facBuscada == null) {
						JOptionPane.showMessageDialog(null, "Debe buscar antes de editar");
					} else {

						int cod = Integer.parseInt(jTFCodFac.getText());
						String nom = jTFNomFac.getText();

						Facultad f = new Facultad(cod, nom);

						controlador.editarFac(f);
						JOptionPane.showMessageDialog(null, "La facultad se ha editado exitosamente");
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else if (jTPestania.getSelectedIndex() == 2) {
				// Tomando datos Area interes

				try {

					if (areaBuscada == null) {
						JOptionPane.showMessageDialog(null, "Debe buscar antes de editar");
					} else {
						int cod = Integer.parseInt(jTFCodArea.getText());
						String nom = jTFNomArea.getText();

						AreasInteres area = new AreasInteres(cod, nom);

						controlador.editarArea(area);
						JOptionPane.showMessageDialog(null, "El area se ha editado exitosamente");
					}
				} catch (Exception exc) {
					exc.printStackTrace();
				}

			}
		}

		if (arg0.getSource() == jBBuscar) {
			if (jTPestania.getSelectedIndex() == 1) {
				// busqueda para Programa

				try {
					if (jTFCodPro.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Debe diligenciar el c�digo del programa que desea buscar");
					} else {
						int cod = Integer.parseInt(jTFCodPro.getText());

						Programa p = controlador.buscarPro(cod);
						programaBuscado = p;

						jTFNombrePro.setText(p.getNomPrograma());
						jTFCreditos.setText(p.getCreditosPrograma() + "");
						jCBFacultad.setSelectedItem(p.getFacultad());
					}
				} catch (ExcepcionNegocio e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				} catch (Exception exc) {
					exc.printStackTrace();
				}

			} else if (jTPestania.getSelectedIndex() == 0) {
				// busqueda para Facultad
				try {
					if (jTFCodFac.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Debe diligenciar el c�digo de la facultad para buscarla");
					} else {
						int cod = Integer.parseInt(jTFCodFac.getText());

						Facultad fac = controlador.buscarFac(cod);
						facBuscada = fac;

						jTFNomFac.setText(fac.getNombre());
					}
				} catch (ExcepcionNegocio e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				} catch (Exception exc) {
					exc.printStackTrace();
				}

			} else if (jTPestania.getSelectedIndex() == 2) {
				// busqueda para Area interes

				try {
					if (jTFCodArea.getText().isEmpty()) {
						JOptionPane.showMessageDialog(null, "Debe diligenciar el c�digo del area que desea buscar");
					} else {
						int cod = Integer.parseInt(jTFCodArea.getText());

						AreasInteres area = controlador.buscarArea(cod);
						areaBuscada = area;

						jTFNomArea.setText(area.getNombre());
					}
				} catch (ExcepcionNegocio e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				} catch (Exception exc) {
					exc.printStackTrace();
				}

			}
		}

		if (arg0.getSource() == jBRegistrar) {
			if (jTPestania.getSelectedIndex() == 1) {
				// Tomando datos Programa

				try {

					if (jCBFacultad.getSelectedIndex() == 0) {
						JOptionPane.showMessageDialog(null, "Debe seleccionar una facultad");
					} else {

						int cod = Integer.parseInt(jTFCodPro.getText());
						String nom = jTFNombrePro.getText();
						int creditos = Integer.parseInt(jTFCreditos.getText());
						Facultad fac = (Facultad) jCBFacultad.getSelectedItem();

						Programa p = new Programa(cod, fac, nom, creditos);

						controlador.registrarPro(p);
						JOptionPane.showMessageDialog(null, "El programa se ha registrado exitosamente");
					}
				} catch (ExcepcionNegocio e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				} catch (Exception exc) {
					exc.printStackTrace();
				}

			} else if (jTPestania.getSelectedIndex() == 0) {
				// Tomando datos Facultad

				try {

					int cod = Integer.parseInt(jTFCodFac.getText());
					String nom = jTFNomFac.getText();

					Facultad f = new Facultad(cod, nom);

					controlador.registrarFac(f);
					JOptionPane.showMessageDialog(null, "La facultad se ha registrado exitosamente");

				} catch (ExcepcionNegocio exc) {
					JOptionPane.showMessageDialog(null, exc.getMessage());
				} catch (Exception e) {
					e.printStackTrace();
				}

			} else if (jTPestania.getSelectedIndex() == 2) {
				// Tomando datos Area interes

				try {

					int cod = Integer.parseInt(jTFCodArea.getText());
					String nom = jTFNomArea.getText();

					AreasInteres area = new AreasInteres(cod, nom);

					controlador.registrarArea(area);
					JOptionPane.showMessageDialog(null, "El area se ha registrado exitosamente");

				} catch (ExcepcionNegocio e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
				} catch (Exception exc) {
					exc.printStackTrace();
				}

			}
		}

	}

	private void refrescarComboFacultad() {
		try {
			List<Facultad> lista = controlador.listarFacultad();
			jCBFacultad.removeAllItems();
			jCBFacultad.addItem("Seleccione una opcion");
			for (Facultad facultad : lista) {
				jCBFacultad.addItem(facultad);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void pintarPanelRegistro() {

		Color c5 = Color.white;
		Color c6 = Color.red;
		jpColor jpmicolor2 = new jpColor(c5, c6);
		jpmicolor2.setSize(this.getSize());
		jPGestionAreasIntre.add(jpmicolor2);

		Color c7 = Color.white;
		Color c8 = Color.red;
		jpColor jpmicolor3 = new jpColor(c7, c8);
		jpmicolor3.setSize(this.getSize());
		jPGestionFacul.add(jpmicolor3);

		Color c9 = Color.white;
		Color c10 = Color.red;
		jpColor jpmicolor4 = new jpColor(c9, c10);
		jpmicolor4.setSize(this.getSize());
		jPGestionProgra.add(jpmicolor4);

	}

	private void pintarPanelPrincipal() {
		Color c1 = Color.RED;
		Color c2 = Color.BLACK;
		jpColor jpmicolor = new jpColor(c1, c2);
		jpmicolor.setSize(this.getSize());
		jPPrincipal.add(jpmicolor);

	}

}
