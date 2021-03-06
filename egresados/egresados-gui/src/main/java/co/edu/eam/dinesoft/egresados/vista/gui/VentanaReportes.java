/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.dinesoft.egresados.vista.gui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import co.edu.eam.dinesoft.egresados.vista.controladores.ControladorVentanaReportes;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.SituacionActual;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.AreasInteres;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.InformacionLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.OfertaLaboral;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Programa;

/**
 *
 * @author Didier Narv�ez
 */
public class VentanaReportes extends javax.swing.JFrame implements ActionListener {

	private ControladorVentanaReportes controlador;

	/**
	 * Creates new form VentanaReportes
	 */
	public VentanaReportes() {
		initComponents();
		setLocationRelativeTo(this);
		jBInicio.addActionListener(this);
		controlador = new ControladorVentanaReportes();
		pintarPanel();
		refresacarComboEmpresas();
		refrescarComboProgramas();
		reporteEgresadosOcupacion();
		ofertasAbriertas();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTPPestanias = new javax.swing.JTabbedPane();
        jPReporteEgresados = new javax.swing.JPanel();
        jPGrafica = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jCBProgramaRep1 = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        panelOfertasAbiertas = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jCBProgramaRep2 = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEmpleadosEmp = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jCBEmpresas = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaOfertas = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnBuscarOfertas = new javax.swing.JButton();
        jCBPrograma = new javax.swing.JComboBox();
        jBInicio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REPORTES Y ESTAD�STICAS");

        jPGrafica.setBorder(javax.swing.BorderFactory.createTitledBorder("Gr�fica de reportes"));

        javax.swing.GroupLayout jPGraficaLayout = new javax.swing.GroupLayout(jPGrafica);
        jPGrafica.setLayout(jPGraficaLayout);
        jPGraficaLayout.setHorizontalGroup(
            jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 869, Short.MAX_VALUE)
        );
        jPGraficaLayout.setVerticalGroup(
            jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 381, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Seleccione el programa acad�mico");

        jCBProgramaRep1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBProgramaRep1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPReporteEgresadosLayout = new javax.swing.GroupLayout(jPReporteEgresados);
        jPReporteEgresados.setLayout(jPReporteEgresadosLayout);
        jPReporteEgresadosLayout.setHorizontalGroup(
            jPReporteEgresadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPReporteEgresadosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPReporteEgresadosLayout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel9)
                .addGap(101, 101, 101)
                .addComponent(jCBProgramaRep1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPReporteEgresadosLayout.setVerticalGroup(
            jPReporteEgresadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPReporteEgresadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPReporteEgresadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jCBProgramaRep1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPPestanias.addTab("Por tipo de ocupaci�n", jPReporteEgresados);

        panelOfertasAbiertas.setBorder(javax.swing.BorderFactory.createTitledBorder("Estad�stica de ofertas por area de conocimiento y programa acad�mico"));

        javax.swing.GroupLayout panelOfertasAbiertasLayout = new javax.swing.GroupLayout(panelOfertasAbiertas);
        panelOfertasAbiertas.setLayout(panelOfertasAbiertasLayout);
        panelOfertasAbiertasLayout.setHorizontalGroup(
            panelOfertasAbiertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
        );
        panelOfertasAbiertasLayout.setVerticalGroup(
            panelOfertasAbiertasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Seleccione el programa acad�mico");

        jCBProgramaRep2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBProgramaRep2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(panelOfertasAbiertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(108, 108, 108)
                        .addComponent(jCBProgramaRep2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCBProgramaRep2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelOfertasAbiertas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPPestanias.addTab("Ofertas abiertas", jPanel2);

        tablaEmpleadosEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Egresado", "Programa", "Cargo", "Fecha de entrada"
            }
        ));
        jScrollPane1.setViewportView(tablaEmpleadosEmp);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione la empresa en la que desea buscar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel7.setText("Empresa");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel7)
                .addGap(88, 88, 88)
                .addComponent(jCBEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTPPestanias.addTab("Empleados por empresa", jPanel3);

        tablaOfertas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Empresa", "Fecha publicaci�n", "Fecha cierre", "Cargo", "Salario", "Resumen"
            }
        ));
        jScrollPane2.setViewportView(tablaOfertas);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione el programa del cual desea buscar las ofertas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel8.setText("Programa");

        btnBuscarOfertas.setText("BUSCAR");
        btnBuscarOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarOfertasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel8)
                .addGap(88, 88, 88)
                .addComponent(jCBPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(btnBuscarOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnBuscarOfertas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPPestanias.addTab("Ofertas por programa", jPanel4);

        jBInicio.setBackground(new java.awt.Color(255, 255, 255));
        jBInicio.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496349_home.png"))); // NOI18N
        jBInicio.setText("INICIO");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471498828_stats.png"))); // NOI18N

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jTPPestanias)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel6)
                        .addGap(89, 89, 89))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBInicio)
                .addContainerGap())
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPPestanias, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void btnBuscarOfertasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBuscarOfertasActionPerformed
		// TODO add your handling code here:
		if (jCBPrograma.getSelectedIndex() != 0) {
			Programa pro = (Programa) jCBPrograma.getSelectedItem();
			refrescarTablaOfertas(pro);
		}
	}// GEN-LAST:event_btnBuscarOfertasActionPerformed

	private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBuscarActionPerformed
		// TODO add your handling code here:
		if (jCBEmpresas.getSelectedIndex() != 0) {
			Empresa emp = (Empresa) jCBEmpresas.getSelectedItem();
			refrescarTablaInfoLab(emp);
		}
	}// GEN-LAST:event_btnBuscarActionPerformed

	private void refrescarTablaInfoLab(Empresa e) {
		try {
			DefaultTableModel dtm = (DefaultTableModel) tablaEmpleadosEmp.getModel();
			dtm.setRowCount(0);
			List<InformacionLaboral> infoLab = controlador.infoLab(e);
			for (InformacionLaboral lista : infoLab) {
				dtm.addRow(new Object[] { lista.getEgresado().getNombre(),
						lista.getEgresado().getCodigoPrograma().getNomPrograma(), lista.getCargo(),
						lista.getFechaIngreso() });
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	private void refresacarComboEmpresas() {
		try {
			List<Empresa> lista = controlador.listaEmpresas();
			jCBEmpresas.removeAllItems();
			jCBEmpresas.addItem("Seleccione opci�n");
			for (Empresa empresa : lista) {
				jCBEmpresas.addItem(empresa);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void refrescarTablaOfertas(Programa p) {
		try {
			DefaultTableModel dtm = (DefaultTableModel) tablaOfertas.getModel();
			dtm.setRowCount(0);
			List<OfertaLaboral> lista = controlador.ofertaPorPrograma(p);
			for (OfertaLaboral oferta : lista) {
				dtm.addRow(new Object[] { oferta.getEmpresa(), oferta.getFechaApertura(), oferta.getFechaCierre(),
						oferta.getCargo(), oferta.getSalario(), oferta.getResumen() });
			}
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	private void refrescarComboProgramas(){
		try {
			List<Programa> programas = controlador.listar();
			jCBPrograma.removeAllItems();
			jCBPrograma.addItem("Seleccione opci�n");
			jCBProgramaRep1.removeAllItems();
			jCBProgramaRep2.removeAllItems();
			for (Programa programa : programas) {
				jCBPrograma.addItem(programa);
				jCBProgramaRep1.addItem(programa);
				jCBProgramaRep2.addItem(programa);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

    private void jCBProgramaRep1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBProgramaRep1ItemStateChanged
        // TODO add your handling code here:
    	ChartPanel panel;
		try {
			
			Programa programa = (Programa) jCBProgramaRep1.getSelectedItem();
			
			List<InformacionLaboral> listaInfoLab = controlador.infoLabPro(programa);

			jPGrafica.removeAll();
			
			double empleado = 0;
			double desempleado = 0;
			double independiente = 0;
			double empresario = 0;

			int contadorEmpleado = 0;
			int contadordDesempleado = 0;
			int contadorIndependiente = 0;
			int contadorEmpresario = 0;
			
			if (listaInfoLab.size() == 0){
				JOptionPane.showMessageDialog(null, "No egresados registrados");
			}

			for (InformacionLaboral informacionLaboral : listaInfoLab) {
				if (informacionLaboral.getSituaActual().equals(SituacionActual.EMPLEADO)) {
					contadorEmpleado++;
				} else if (informacionLaboral.getSituaActual().equals(SituacionActual.DESEMPLEADO)) {
					contadordDesempleado++;
				} else if (informacionLaboral.getSituaActual().equals(SituacionActual.INDEPENDIENTE)) {
					contadorIndependiente++;
				} else if (informacionLaboral.getSituaActual().equals(SituacionActual.EMPRESARIO)) {
					contadorEmpresario++;
				}				

				empleado = (contadorEmpleado * 100) / listaInfoLab.size();
				desempleado = (contadordDesempleado * 100) / listaInfoLab.size();
				independiente = (contadorIndependiente * 100) / listaInfoLab.size();
				empresario = (contadorEmpresario * 100) / listaInfoLab.size();
			}
			DefaultPieDataset ds = new DefaultPieDataset();
			ds.setValue("EMPLEADO: " + empleado + "%", empleado);
			ds.setValue("DESEMPLEADO: " + desempleado + "%", desempleado);
			ds.setValue("INDEPENDIENTE: " + independiente + "%", independiente);
			ds.setValue("EMPRESARIO: " + empresario + "%", empresario);

			JFreeChart jf = ChartFactory.createPieChart3D("Reporte de egresados por tipo de ocupaci�n", ds, true, true,
					true);

			panel = new ChartPanel(jf);
			panel.setBounds(20, 50, 720, 350);

			jPGrafica.add(panel);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }//GEN-LAST:event_jCBProgramaRep1ItemStateChanged

    private void jCBProgramaRep2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBProgramaRep2ItemStateChanged
        // TODO add your handling code here:
    	ChartPanel panel;
		try {
			
			Programa programa = (Programa) jCBProgramaRep2.getSelectedItem();
			
			List<OfertaLaboral> listaOfertaLab = controlador.ofertaLabPrograma(programa);
			
			int contador = 0;
			AreasInteres areaAnterior = null;
			DefaultCategoryDataset ds = new DefaultCategoryDataset();

			for (int i = 0; i < listaOfertaLab.size(); i++) {
				panelOfertasAbiertas.removeAll();
				// Validacion de oferta
				if (listaOfertaLab.get(i).isCerrarOferta() == false) {
					areaAnterior = listaOfertaLab.get(i).getArea();
					for (int j = 0; j < listaOfertaLab.size(); j++) {
						if (listaOfertaLab.get(j).getArea() == areaAnterior) {
							contador++;
						}
					}
					ds.addValue(contador, listaOfertaLab.get(i).getArea().getNombre(),
							listaOfertaLab.get(i).getArea().getNombre());
					contador = 0;
				}
			}

			JFreeChart jf = ChartFactory.createBarChart3D("Reporte de ofertas abiertas", "Nombre de las ofertas",
					"Numero de vacantes", ds, PlotOrientation.VERTICAL, true, true, true);

			panel = new ChartPanel(jf);
			panel.setBounds(20, 20, 720, 320);

			panelOfertasAbiertas.add(panel);

		} catch (Exception e) {
			e.printStackTrace();
		} 
    }//GEN-LAST:event_jCBProgramaRep2ItemStateChanged

    /**
     * Grafica de pastel
     */
	public void reporteEgresadosOcupacion() {
		ChartPanel panel;
		try {
			List<InformacionLaboral> listaInfoLab = controlador.listarInfoLab();

			double empleado = 0;
			double desempleado = 0;
			double independiente = 0;
			double empresario = 0;

			int contadorEmpleado = 0;
			int contadordDesempleado = 0;
			int contadorIndependiente = 0;
			int contadorEmpresario = 0;
			
			if (listaInfoLab.size() == 0){
				JOptionPane.showMessageDialog(null, "No hay egresados registrados");
			}

			for (InformacionLaboral informacionLaboral : listaInfoLab) {
				if (informacionLaboral.getSituaActual().equals(SituacionActual.EMPLEADO)) {
					contadorEmpleado++;
				} else if (informacionLaboral.getSituaActual().equals(SituacionActual.DESEMPLEADO)) {
					contadordDesempleado++;
				} else if (informacionLaboral.getSituaActual().equals(SituacionActual.INDEPENDIENTE)) {
					contadorIndependiente++;
				} else if (informacionLaboral.getSituaActual().equals(SituacionActual.EMPRESARIO)) {
					contadorEmpresario++;
				}

				empleado = (contadorEmpleado * 100) / listaInfoLab.size();
				desempleado = (contadordDesempleado * 100) / listaInfoLab.size();
				independiente = (contadorIndependiente * 100) / listaInfoLab.size();
				empresario = (contadorEmpresario * 100) / listaInfoLab.size();
			}
			DefaultPieDataset ds = new DefaultPieDataset();
			ds.setValue("EMPLEADO: " + empleado + "%", empleado);
			ds.setValue("DESEMPLEADO: " + desempleado + "%", desempleado);
			ds.setValue("INDEPENDIENTE: " + independiente + "%", independiente);
			ds.setValue("EMPRESARIO: " + empresario + "%", empresario);

			JFreeChart jf = ChartFactory.createPieChart3D("Reporte de egresados por tipo de ocupaci�n", ds, true, true,
					true);

			panel = new ChartPanel(jf);
			panel.setBounds(20, 50, 720, 350);

			jPGrafica.add(panel);

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	/**
	 * Grafica de barras indicando la cantidad de vacantes disponibles por
	 * oferta laboral
	 */
	public void ofertasAbriertas() {
		ChartPanel panel;
		try {
			List<OfertaLaboral> listaOfertaLab = controlador.listarOfertas();

			int contador = 0;
			AreasInteres areaAnterior = null;
			DefaultCategoryDataset ds = new DefaultCategoryDataset();

			for (int i = 0; i < listaOfertaLab.size(); i++) {
				// Validacion de oferta
				if (listaOfertaLab.get(i).isCerrarOferta() == false) {
					areaAnterior = listaOfertaLab.get(i).getArea();
					for (int j = 0; j < listaOfertaLab.size(); j++) {
						if (listaOfertaLab.get(j).getArea() == areaAnterior) {
							contador++;
						}
					}
					ds.addValue(contador, listaOfertaLab.get(i).getArea().getNombre(),
							listaOfertaLab.get(i).getArea().getNombre());
					contador = 0;
				}
			}

			JFreeChart jf = ChartFactory.createBarChart3D("Reporte de ofertas abiertas", "Nombre de las ofertas",
					"Numero de vacantes", ds, PlotOrientation.VERTICAL, true, true, true);

			panel = new ChartPanel(jf);
			panel.setBounds(20, 20, 720, 320);

			panelOfertasAbiertas.add(panel);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarOfertas;
    private javax.swing.JButton jBInicio;
    private javax.swing.JComboBox jCBEmpresas;
    private javax.swing.JComboBox jCBPrograma;
    private javax.swing.JComboBox jCBProgramaRep1;
    private javax.swing.JComboBox jCBProgramaRep2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPGrafica;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JPanel jPReporteEgresados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTPPestanias;
    private javax.swing.JPanel panelOfertasAbiertas;
    private javax.swing.JTable tablaEmpleadosEmp;
    private javax.swing.JTable tablaOfertas;
    // End of variables declaration//GEN-END:variables

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.dispose();
	}

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

	private void pintarPanel() {
		Color c1 = Color.DARK_GRAY;
		Color c2 = Color.white;
		VentanaReportes.jpColor jpmicolor = new VentanaReportes.jpColor(c1, c2);
		jpmicolor.setSize(this.getSize());
		jPPrincipal.add(jpmicolor);

		Color c3 = Color.white;
		Color c4 = Color.DARK_GRAY;
		VentanaReportes.jpColor jpmicolor1 = new VentanaReportes.jpColor(c3, c4);
		jpmicolor1.setSize(this.getSize());
		jPReporteEgresados.add(jpmicolor1);
	}

}
