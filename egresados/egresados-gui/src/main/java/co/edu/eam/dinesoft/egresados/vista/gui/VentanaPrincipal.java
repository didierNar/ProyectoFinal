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

import javax.persistence.Persistence;

/**
 *
 * @author Didier Narv�ez
 */
public class VentanaPrincipal extends javax.swing.JFrame implements ActionListener {

	/**
	 * Creates new form VentanaPrincipal
	 */
	public VentanaPrincipal() {
		initComponents();
		setLocationRelativeTo(this);
		jBInfoEgresados.addActionListener(this);
		jBInfoEmp.addActionListener(this);
		jBInfoParametrica.addActionListener(this);
		jBReportes.addActionListener(this);
		pintarPanel();
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
        jPOpc = new javax.swing.JPanel();
        jBInfoEgresados = new javax.swing.JButton();
        jBInfoEmp = new javax.swing.JButton();
        jBInfoParametrica = new javax.swing.JButton();
        jBReportes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPOpc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione una opci�n de navegaci�n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jBInfoEgresados.setBackground(new java.awt.Color(255, 255, 255));
        jBInfoEgresados.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jBInfoEgresados.setForeground(new java.awt.Color(0, 0, 153));
        jBInfoEgresados.setText("INFORMACION DE EGRESADOS");

        jBInfoEmp.setBackground(new java.awt.Color(255, 255, 255));
        jBInfoEmp.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jBInfoEmp.setForeground(new java.awt.Color(0, 0, 153));
        jBInfoEmp.setText("INFORMACION DE EMPRESAS");

        jBInfoParametrica.setBackground(new java.awt.Color(255, 255, 255));
        jBInfoParametrica.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jBInfoParametrica.setForeground(new java.awt.Color(0, 0, 153));
        jBInfoParametrica.setText("INFORMACION PAREMETRICA");

        jBReportes.setBackground(new java.awt.Color(255, 255, 255));
        jBReportes.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jBReportes.setForeground(new java.awt.Color(0, 0, 153));
        jBReportes.setText("REPORTES Y ESTADISTICAS");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471493407_graduated.png"))); // NOI18N

        javax.swing.GroupLayout jPOpcLayout = new javax.swing.GroupLayout(jPOpc);
        jPOpc.setLayout(jPOpcLayout);
        jPOpcLayout.setHorizontalGroup(
            jPOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBInfoEgresados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBInfoEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(jPOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBReportes)
                    .addComponent(jBInfoParametrica))
                .addGap(36, 36, 36))
        );
        jPOpcLayout.setVerticalGroup(
            jPOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(jPOpcLayout.createSequentialGroup()
                .addGroup(jPOpcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPOpcLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jBReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBInfoParametrica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPOpcLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jBInfoEgresados, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBInfoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EAM.png"))); // NOI18N

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPrincipalLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jPOpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 748, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBInfoEgresados;
    private javax.swing.JButton jBInfoEmp;
    private javax.swing.JButton jBInfoParametrica;
    private javax.swing.JButton jBReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPOpc;
    private javax.swing.JPanel jPPrincipal;
    // End of variables declaration//GEN-END:variables

	public void actionPerformed(ActionEvent arg0) {

		if (arg0.getSource() == jBInfoEgresados) {

			VentanaEgresados egresados = new VentanaEgresados();
			egresados.setVisible(true);

		}

		if (arg0.getSource() == jBInfoEmp) {

			VentanaEmpresa empresas = new VentanaEmpresa();
			empresas.setVisible(true);

		}

		if (arg0.getSource() == jBInfoParametrica) {

			VentanaInfoParametrica informacion = new VentanaInfoParametrica();
			informacion.setVisible(true);

		}

		if (arg0.getSource() == jBReportes) {

			VentanaReportes reportes = new VentanaReportes();
			reportes.setVisible(true);

		}

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
		Color c1 = Color.cyan;
		Color c2 = Color.blue;
		VentanaPrincipal.jpColor jpmicolor = new VentanaPrincipal.jpColor(c1, c2);
		jpmicolor.setSize(this.getSize());
		jPPrincipal.add(jpmicolor);

		Color c3 = Color.blue;
		Color c4 = Color.cyan;
		VentanaPrincipal.jpColor jpmicolor1 = new VentanaPrincipal.jpColor(c3, c4);
		jpmicolor1.setSize(this.getSize());
		jPOpc.add(jpmicolor1);
	}

}
