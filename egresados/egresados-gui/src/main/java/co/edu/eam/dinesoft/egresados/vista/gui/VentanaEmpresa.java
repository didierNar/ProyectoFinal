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

import co.edu.eam.dinesoft.egresados.vista.controladores.ControladorVentanaEmpresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.enumeraciones.TipoEmpresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Ciudad;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Contacto;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Departamento;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Empresa;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.Pais;
import co.edu.eam.ingesoftdesarrollo.egresados.persistencia.modelo.entidades.SectorLaboral;
import co.edu.eam.ingesoftdesarrollo.logica.excepcion.ExcepcionNegocio;

/**
 *
 * @author Didier Narv�ez
 */
public class VentanaEmpresa extends javax.swing.JFrame implements ActionListener {

	private ControladorVentanaEmpresa controlador;
	private Empresa empresaBuscada;

	/**
	 * Creates new form VentanaEmpresa
	 */
	public VentanaEmpresa() {
		initComponents();
		controlador = new ControladorVentanaEmpresa();
		empresaBuscada = null;
		pintarPanelPrincipal();
		pintarPanelRegistro();
		setLocationRelativeTo(this);
		jBAnterior.setVisible(false);
		jTPPestanias.setEnabledAt(1, false);
		jBCancelar.addActionListener(this);
		jBEditar.addActionListener(this);
		jBInicio.addActionListener(this);
		jBRegistro.addActionListener(this);
		jBSiguiente.addActionListener(this);
		jBBuscar.addActionListener(this);
		jBAnterior.addActionListener(this);
		refrescarComboPais();
		refrescarComboSectorLab();
		refrescarComboTipoEmpresa();
		VentanaEmpresa.jpColor jpVista = new VentanaEmpresa.jpColor();
		jpVista.setSize(this.getSize());
		jBRegistro.setVisible(false);
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
        jPOpcines = new javax.swing.JPanel();
        jBRegistro = new javax.swing.JToggleButton();
        jBEditar = new javax.swing.JButton();
        jBBuscar = new javax.swing.JButton();
        jBCancelar = new javax.swing.JButton();
        jBAnterior = new javax.swing.JButton();
        jBSiguiente = new javax.swing.JButton();
        jBInicio = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTPPestanias = new javax.swing.JTabbedPane();
        jPDatosEmpresa = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTFTel = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jTFNit = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTFDirWeb = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jCBSectorLab = new javax.swing.JComboBox();
        jCBCiudad = new javax.swing.JComboBox();
        jCBDepto = new javax.swing.JComboBox();
        jCBPais = new javax.swing.JComboBox();
        jCBTipo = new javax.swing.JComboBox();
        jTFRazonSocial = new javax.swing.JTextField();
        jPDatosContacto = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTFNomContacto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTFCargoContacto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTFCorreoContacto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTFTelContacto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Bernard MT Condensed", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro Empresa");

        jPOpcines.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jBRegistro.setBackground(new java.awt.Color(255, 255, 255));
        jBRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496828_Add-Male-User.png"))); // NOI18N
        jBRegistro.setText("REGISTRO");

        jBEditar.setBackground(new java.awt.Color(255, 255, 255));
        jBEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496619_interact.png"))); // NOI18N
        jBEditar.setText("EDITAR");

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496705_search.png"))); // NOI18N
        jBBuscar.setText("BUSCAR");

        javax.swing.GroupLayout jPOpcinesLayout = new javax.swing.GroupLayout(jPOpcines);
        jPOpcines.setLayout(jPOpcinesLayout);
        jPOpcinesLayout.setHorizontalGroup(
            jPOpcinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPOpcinesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPOpcinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBRegistro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        jPOpcinesLayout.setVerticalGroup(
            jPOpcinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPOpcinesLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jBRegistro)
                .addGap(33, 33, 33)
                .addComponent(jBEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jBBuscar)
                .addGap(37, 37, 37))
        );

        jBCancelar.setBackground(new java.awt.Color(255, 255, 255));
        jBCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496222_button_cancel.png"))); // NOI18N
        jBCancelar.setText("CANCELAR");

        jBAnterior.setBackground(new java.awt.Color(255, 255, 255));
        jBAnterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496101_Undo.png"))); // NOI18N
        jBAnterior.setText("ANTERIOR");

        jBSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        jBSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471495851_go-next_1.png"))); // NOI18N
        jBSiguiente.setText("SIGUIENTE");

        jBInicio.setBackground(new java.awt.Color(255, 255, 255));
        jBInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471496349_home.png"))); // NOI18N
        jBInicio.setText("INICIO");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1471569091_constr_my_bank.png"))); // NOI18N

        jTPPestanias.setFont(new java.awt.Font("Bernard MT Condensed", 0, 14)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel27.setText("Raz�n Social:");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel28.setText("Tel�fono:");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel29.setText("NIT :");

        jLabel30.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel30.setText("Pa�s :");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel31.setText("Departamento :");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel32.setText("Tipo De Empresa :");

        jLabel33.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel33.setText("Ciudad :");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel34.setText("Direccion Sitio Web");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel35.setText("Sector Laboral :");

        jLabel36.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel36.setText("Direccion :");

        jCBDepto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBDeptoItemStateChanged(evt);
            }
        });

        jCBPais.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBPaisItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPDatosEmpresaLayout = new javax.swing.GroupLayout(jPDatosEmpresa);
        jPDatosEmpresa.setLayout(jPDatosEmpresaLayout);
        jPDatosEmpresaLayout.setHorizontalGroup(
            jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEmpresaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel33)
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jCBCiudad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCBDepto, 0, 152, Short.MAX_VALUE)
                    .addComponent(jCBPais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addGroup(jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jTFDireccion)
                    .addComponent(jTFDirWeb, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel34)
                    .addComponent(jCBSectorLab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCBTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27)
                    .addComponent(jLabel29)
                    .addComponent(jTFNit, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(jTFRazonSocial))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPDatosEmpresaLayout.setVerticalGroup(
            jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosEmpresaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosEmpresaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDirWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBSectorLab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDatosEmpresaLayout.createSequentialGroup()
                        .addGroup(jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(jLabel31)
                        .addGroup(jPDatosEmpresaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPDatosEmpresaLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel33))
                            .addGroup(jPDatosEmpresaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jCBDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTPPestanias.addTab("Datos De La Empresa", jPDatosEmpresa);

        jPDatosContacto.setOpaque(false);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("Nombre Completo :");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Cargo En La Empresa :");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Correo Electr�nico :");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Tel�fono :");

        javax.swing.GroupLayout jPDatosContactoLayout = new javax.swing.GroupLayout(jPDatosContacto);
        jPDatosContacto.setLayout(jPDatosContactoLayout);
        jPDatosContactoLayout.setHorizontalGroup(
            jPDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosContactoLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTFNomContacto)
                        .addComponent(jTFCorreoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(jPDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFCargoContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFTelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        jPDatosContactoLayout.setVerticalGroup(
            jPDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDatosContactoLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNomContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCargoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPDatosContactoLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPDatosContactoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPDatosContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFCorreoContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTPPestanias.addTab("Datos De Contacto", jPDatosContacto);

        javax.swing.GroupLayout jPPrincipalLayout = new javax.swing.GroupLayout(jPPrincipal);
        jPPrincipal.setLayout(jPPrincipalLayout);
        jPPrincipalLayout.setHorizontalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel1))
                    .addComponent(jTPPestanias, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPOpcines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jBCancelar)
                .addGap(117, 117, 117)
                .addComponent(jBAnterior)
                .addGap(104, 104, 104)
                .addComponent(jBSiguiente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPPrincipalLayout.setVerticalGroup(
            jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPrincipalLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(7, 7, 7)
                        .addComponent(jTPPestanias, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPOpcines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBSiguiente)
                        .addComponent(jBInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void jCBPaisItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_jCBPaisItemStateChanged
		// TODO add your handling code here:
		if (jCBPais.getSelectedIndex() != 0) {
			Pais p = (Pais) jCBPais.getSelectedItem();
			refrescarComboDepto(p);
		}
	}// GEN-LAST:event_jCBPaisItemStateChanged

	private void jCBDeptoItemStateChanged(java.awt.event.ItemEvent evt) {// GEN-FIRST:event_jCBDeptoItemStateChanged
		// TODO add your handling code here:
		if (jCBDepto.getSelectedIndex() != 0) {
			Departamento d = (Departamento) jCBDepto.getSelectedItem();
			refrescarComboCiudad(d);
		}
	}// GEN-LAST:event_jCBDeptoItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAnterior;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBCancelar;
    private javax.swing.JButton jBEditar;
    private javax.swing.JButton jBInicio;
    private javax.swing.JToggleButton jBRegistro;
    private javax.swing.JButton jBSiguiente;
    private javax.swing.JComboBox jCBCiudad;
    private javax.swing.JComboBox jCBDepto;
    private javax.swing.JComboBox jCBPais;
    private javax.swing.JComboBox jCBSectorLab;
    private javax.swing.JComboBox jCBTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPDatosContacto;
    private javax.swing.JPanel jPDatosEmpresa;
    private javax.swing.JPanel jPOpcines;
    private javax.swing.JPanel jPPrincipal;
    private javax.swing.JTextField jTFCargoContacto;
    private javax.swing.JTextField jTFCorreoContacto;
    private javax.swing.JTextField jTFDirWeb;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFNit;
    private javax.swing.JTextField jTFNomContacto;
    private javax.swing.JTextField jTFRazonSocial;
    private javax.swing.JTextField jTFTel;
    private javax.swing.JTextField jTFTelContacto;
    private javax.swing.JTabbedPane jTPPestanias;
    // End of variables declaration//GEN-END:variables

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

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == jBInicio) {
			this.dispose();
		}

		if (arg0.getSource() == jBEditar) {
			try {
				if (empresaBuscada == null) {
					JOptionPane.showMessageDialog(null, "Primero debe buscar antes de editar");
				} else {
					// Tomando datos empresa
					Pais pais = (Pais) jCBPais.getSelectedItem();
					Departamento depto = (Departamento) jCBDepto.getSelectedItem();
					Ciudad ciudad = (Ciudad) jCBCiudad.getSelectedItem();
					String tel = jTFTel.getText();
					TipoEmpresa tipo = (TipoEmpresa) jCBTipo.getSelectedItem();
					String direcWeb = jTFDirWeb.getText();
					SectorLaboral sectorLab = (SectorLaboral) jCBSectorLab.getSelectedItem();
					String dir = jTFDireccion.getText();
					String razonSocial = jTFRazonSocial.getText();
					String nit = jTFNit.getText();

					// Tomando datos Contacto
					String nombre = jTFNomContacto.getText();
					String correo = jTFCorreoContacto.getText();
					String cargo = jTFCargoContacto.getText();
					String telContacto = jTFTelContacto.getText();

					Empresa emp = new Empresa(nit, sectorLab, razonSocial, depto, tel, tipo, direcWeb, dir, ciudad,
							pais);

					Contacto con = new Contacto(emp, nombre, correo, cargo, telContacto);

					controlador.editar(emp, con);

				}
			} catch (Exception exc) {
				exc.printStackTrace();
			}
		}

		if (arg0.getSource() == jBRegistro) {

			try {

				// Tomando datos empresa
				Pais pais = (Pais) jCBPais.getSelectedItem();
				Departamento depto = (Departamento) jCBDepto.getSelectedItem();
				Ciudad ciudad = (Ciudad) jCBCiudad.getSelectedItem();
				String tel = jTFTel.getText();
				TipoEmpresa tipo = (TipoEmpresa) jCBTipo.getSelectedItem();
				String direcWeb = jTFDirWeb.getText();
				SectorLaboral sectorLab = (SectorLaboral) jCBSectorLab.getSelectedItem();
				String dir = jTFDireccion.getText();
				String razonSocial = jTFRazonSocial.getText();
				String nit = jTFNit.getText();

				// Tomando datos Contacto
				String nombre = jTFNomContacto.getText();
				String correo = jTFCorreoContacto.getText();
				String cargo = jTFCargoContacto.getText();
				String telContacto = jTFTelContacto.getText();

				Empresa emp = new Empresa(nit, sectorLab, razonSocial, depto, tel, tipo, direcWeb, dir, ciudad, pais);

				Contacto con = new Contacto(emp, nombre, correo, cargo, telContacto);

				controlador.registrar(emp, con);

				limpiarCampos();

			} catch (ExcepcionNegocio e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			} catch (Exception exc) {
				exc.printStackTrace();
			}

		}

		if (arg0.getSource() == jBSiguiente) {

			if (jTPPestanias.getSelectedIndex() == 0) {
				jTPPestanias.setSelectedIndex(1);
				jTPPestanias.setEnabledAt(1, true);
				jTPPestanias.setEnabledAt(0, false);
				jBSiguiente.setVisible(false);
				jBAnterior.setVisible(true);
				jBRegistro.setVisible(true);

			}

		}

		if (arg0.getSource() == jBAnterior) {

			if (jTPPestanias.getSelectedIndex() == 1) {
				jTPPestanias.setEnabledAt(0, true);
				jTPPestanias.setSelectedIndex(0);
				jTPPestanias.setEnabledAt(1, false);
				jBAnterior.setVisible(false);
				jBSiguiente.setVisible(true);
				jBRegistro.setVisible(false);

			}
		}

		if (arg0.getSource() == jBBuscar) {

			try {

				String nit = JOptionPane.showInputDialog(null, "Ingrese el NIT de la empresa");
				Empresa emp = controlador.buscar(nit);
				empresaBuscada = emp;

				jCBPais.setSelectedItem(emp.getPais());
				jCBDepto.setSelectedItem(emp.getDepto());
				jCBCiudad.setSelectedItem(emp.getCiudad());
				jTFTel.setText(emp.getTelefono());
				jCBTipo.setSelectedItem(emp.getTipo());
				jTFDirWeb.setText(emp.getWeb());
				jCBSectorLab.setSelectedItem(emp.getSector());
				jTFDireccion.setText(emp.getDireccion());
				jTFRazonSocial.setText(emp.getRazonSocial());
				jTFNit.setText(emp.getNit());

				Contacto con = controlador.buscar(emp);

				jTFNomContacto.setText(con.getNombre());
				jTFCargoContacto.setText(con.getCargo());
				jTFCorreoContacto.setText(con.getCorreo());
				jTFTelContacto.setText(con.getTel());

			} catch (ExcepcionNegocio e) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			} catch (Exception exc) {
				exc.printStackTrace();
			}
		}

		if (arg0.getSource() == jBCancelar) {
			int opc = JOptionPane.showConfirmDialog(null, "Esta seguro que desea cancelar");
			if (opc == 0) {
				limpiarCampos();
			}
		}

	}



	private void refrescarComboPais() {
		try {
			List<Pais> lista = controlador.listaPaises();
			jCBPais.removeAllItems();
			jCBPais.addItem("Seleccione opci�n");
			for (Pais pais : lista) {
				jCBPais.addItem(pais);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void refrescarComboDepto(Pais p) {
		try {
			List<Departamento> lista = controlador.deptosPais(p);
			jCBDepto.removeAllItems();
			jCBDepto.addItem("Seleccione opci�n");
			for (Departamento depto : lista) {
				jCBDepto.addItem(depto);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void refrescarComboCiudad(Departamento dep) {
		try {
			List<Ciudad> lista = controlador.ciudadesDepto(dep);
			jCBCiudad.removeAllItems();
			jCBCiudad.addItem("Seleccione opci�n");
			for (Ciudad ciudad : lista) {
				jCBCiudad.addItem(ciudad);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void refrescarComboTipoEmpresa (){
		jCBTipo.addItem("Seleccione una opci�n");
		jCBTipo.addItem(TipoEmpresa.PRIVADA);
		jCBTipo.addItem(TipoEmpresa.PUBLICA);
	}

	private void refrescarComboSectorLab() {
		try {
			jCBSectorLab.removeAllItems();
			jCBSectorLab.addItem("Seleccione una opci�n");
			List<SectorLaboral> lista = controlador.listaSectorLab();
			for (SectorLaboral sectorLaboral : lista) {
				jCBSectorLab.addItem(sectorLaboral);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void limpiarCampos() {
		// Campos Empresa
		refrescarComboPais();
		jTFTel.setText(null);
		jCBTipo.setSelectedItem(null);
		jTFDirWeb.setText(null);
		jCBSectorLab.setSelectedItem(null);
		jTFDireccion.setText(null);
		jTFRazonSocial.setText(null);
		jTFNit.setText(null);

		// Campos Contacto
		jTFNomContacto.setText(null);
		jTFCargoContacto.setText(null);
		jTFCorreoContacto.setText(null);
		jTFTelContacto.setText(null);
	}

	private void pintarPanelRegistro() {

		Color c5 = Color.white;
		Color c6 = Color.BLUE;
		VentanaEmpresa.jpColor jpmicolor2 = new VentanaEmpresa.jpColor(c5, c6);
		jpmicolor2.setSize(this.getSize());
		jPDatosEmpresa.add(jpmicolor2);

		Color c7 = Color.white;
		Color c8 = Color.BLUE;
		VentanaEmpresa.jpColor jpmicolor3 = new VentanaEmpresa.jpColor(c7, c8);
		jpmicolor3.setSize(this.getSize());
		jPDatosContacto.add(jpmicolor3);

		Color c9 = Color.blue;
		Color c10 = Color.black;
		VentanaEmpresa.jpColor jpmicolor4 = new VentanaEmpresa.jpColor(c9, c10);
		jpmicolor4.setSize(this.getSize());
		jPOpcines.add(jpmicolor4);

	}

	private void pintarPanelPrincipal() {
		Color c1 = Color.BLUE;
		Color c2 = Color.BLACK;
		VentanaEmpresa.jpColor jpmicolor = new VentanaEmpresa.jpColor(c1, c2);
		jpmicolor.setSize(this.getSize());
		jPPrincipal.add(jpmicolor);

	}

}
