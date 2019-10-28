/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DP.lugarDP;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author benav
 */
public class lugarGUI extends javax.swing.JFrame {

    lugarDP lugar = new lugarDP();
    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    /**
     * Creates new form lugarGUI
     */
    public lugarGUI() {
        initComponents();
        formatoTablaGeneral();
        formatoTablaParametro();
    }

    public void formatoTablaGeneral(){ 
        
        tablaConsultaGeneral.setModel(modelo1);
        modelo1.addColumn("Codigo");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Longitud");
        modelo1.addColumn("Latitud");
    }
    public void formatoTablaParametro(){
        
        tablaConsultaParametro.setModel(modelo2);
        modelo2.addColumn("Codigo");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Longitud");
        modelo2.addColumn("Latitud");
       
    }
    public void borrarRegistrosGeneral(){        
        DefaultTableModel dm = (DefaultTableModel) tablaConsultaGeneral.getModel();
        int count = dm.getRowCount();
        System.out.println("tabla con " + count + " filas");
        if(count > 0){
            for(int i= count -1; i>=0; i--){
                dm.removeRow(i);
            }
        }
    }
    public void borrarRegistrosParametro(){        
        DefaultTableModel dm = (DefaultTableModel) tablaConsultaParametro.getModel();
        int count = dm.getRowCount();
        System.out.println("tabla con " + count + " filas");
        if(count > 0){
            for(int i= count -1; i>=0; i--){
                dm.removeRow(i);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCrearCodigo = new javax.swing.JTextField();
        txtCrearNombre = new javax.swing.JTextField();
        txtCrearLongitud = new javax.swing.JTextField();
        txtCrearLatitud = new javax.swing.JTextField();
        btnCrearGuardar = new javax.swing.JButton();
        txtCrearCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtModificarCodigo = new javax.swing.JTextField();
        txtModificarNombre = new javax.swing.JTextField();
        txtModificarLongitud = new javax.swing.JTextField();
        txtModificarLatitud = new javax.swing.JTextField();
        btnModificarBuscar = new javax.swing.JButton();
        btnModificarGuardar = new javax.swing.JButton();
        btnModificarCancelar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEliminarCodigo = new javax.swing.JTextField();
        txtEliminarNombre = new javax.swing.JTextField();
        txtEliminarLongitud = new javax.swing.JTextField();
        txtEliminarLatitud = new javax.swing.JTextField();
        btnEliminarEliminar = new javax.swing.JButton();
        btnEliminarCancelar = new javax.swing.JButton();
        btnEliminarBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtParametroCodigo = new javax.swing.JTextField();
        btnParametroBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsultaParametro = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultaGeneral = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();

        jTabbedPane1.setToolTipText("");

        jLabel1.setText("Codigo");

        jLabel2.setText("Nombre");

        jLabel3.setText("Longitud");

        jLabel4.setText("Latitud");

        btnCrearGuardar.setText("Guardar");
        btnCrearGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearGuardarActionPerformed(evt);
            }
        });

        txtCrearCancelar.setText("Cancelar");
        txtCrearCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrearCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCrearGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(txtCrearCancelar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCrearCodigo)
                            .addComponent(txtCrearNombre)
                            .addComponent(txtCrearLongitud)
                            .addComponent(txtCrearLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCrearCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCrearNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCrearLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCrearLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearGuardar)
                    .addComponent(txtCrearCancelar))
                .addContainerGap(192, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear", jPanel1);

        jLabel5.setText("Codigo");

        jLabel6.setText("Nombre");

        jLabel7.setText("Longitud");

        jLabel8.setText("Latitud");

        btnModificarBuscar.setText("Buscar");
        btnModificarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarBuscarActionPerformed(evt);
            }
        });

        btnModificarGuardar.setText("Modificar");
        btnModificarGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarGuardarActionPerformed(evt);
            }
        });

        btnModificarCancelar.setText("Cancelar");
        btnModificarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnModificarGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificarCancelar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModificarCodigo)
                            .addComponent(txtModificarNombre)
                            .addComponent(txtModificarLongitud)
                            .addComponent(txtModificarLatitud))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificarBuscar)
                .addGap(134, 134, 134))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtModificarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtModificarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtModificarLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtModificarLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarGuardar)
                    .addComponent(btnModificarCancelar))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        jLabel9.setText("Codigo");

        jLabel10.setText("Nombre");

        jLabel11.setText("Longitud");

        jLabel12.setText("Latitud");

        txtEliminarNombre.setEditable(false);

        txtEliminarLongitud.setEditable(false);
        txtEliminarLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarLongitudActionPerformed(evt);
            }
        });

        txtEliminarLatitud.setEditable(false);

        btnEliminarEliminar.setText("Eliminar");
        btnEliminarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEliminarActionPerformed(evt);
            }
        });

        btnEliminarCancelar.setText("Cancelar");
        btnEliminarCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCancelarActionPerformed(evt);
            }
        });

        btnEliminarBuscar.setText("Buscar");
        btnEliminarBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEliminarLatitud)
                            .addComponent(txtEliminarNombre)
                            .addComponent(txtEliminarLongitud)
                            .addComponent(txtEliminarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarBuscar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnEliminarEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarCancelar)))
                .addGap(136, 136, 136))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEliminarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEliminarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEliminarLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtEliminarLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarEliminar)
                    .addComponent(btnEliminarCancelar))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eliminar", jPanel3);

        jLabel14.setText("Codigo");

        btnParametroBuscar.setText("Buscar");
        btnParametroBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParametroBuscarActionPerformed(evt);
            }
        });

        tablaConsultaParametro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaConsultaParametro);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(txtParametroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnParametroBuscar)
                .addContainerGap(269, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtParametroCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnParametroBuscar)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta", jPanel4);

        tablaConsultaGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaConsultaGeneral);

        jButton12.setText("Buscar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jButton12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta General", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEliminarLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarLongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEliminarLongitudActionPerformed

    private void btnCrearGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearGuardarActionPerformed
        // TODO add your handling code here:
        lugar.setCodigo(txtCrearCodigo.getText().trim());
        lugar.setNombre(txtCrearNombre.getText().trim().toUpperCase());
        lugar.setLongitud(Integer.parseInt(txtCrearLongitud.getText().trim()));
        lugar.setLatitud(Integer.parseInt(txtCrearLatitud.getText()));
        lugar.crearDP();
        lugar = new lugarDP();
        txtCrearCodigo.setText(null);
        txtCrearNombre.setText(null);
        txtCrearLongitud.setText(null);
        txtCrearLatitud.setText(null);        
    }//GEN-LAST:event_btnCrearGuardarActionPerformed

    private void txtCrearCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrearCancelarActionPerformed
        // TODO add your handling code here:
        lugar = new lugarDP();
        txtCrearCodigo.setText(null);
        txtCrearNombre.setText(null);
        txtCrearLongitud.setText(null);
        txtCrearLatitud.setText(null);
    }//GEN-LAST:event_txtCrearCancelarActionPerformed

    private void btnModificarGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarGuardarActionPerformed
        // TODO add your handling code here:
        lugar.setNombre(txtModificarNombre.getText().trim().toUpperCase());
        lugar.setLatitud(Integer.parseInt(txtModificarLatitud.getText()));
        lugar.setLongitud(Integer.parseInt(txtModificarLongitud.getText()));
        lugar.modificarDP();
        txtModificarCodigo.setText(null);
        txtModificarNombre.setText(null);
        txtModificarLongitud.setText(null);
        txtModificarLatitud.setText(null);
        txtModificarCodigo.setEditable(true);
        lugar = new lugarDP();
    }//GEN-LAST:event_btnModificarGuardarActionPerformed

    private void btnModificarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarBuscarActionPerformed
        // TODO add your handling code here:
        lugar.setCodigo(txtModificarCodigo.getText().trim());
        lugar = lugar.parametroDP();
        txtModificarNombre.setText(lugar.getNombre().trim());
        txtModificarLongitud.setText(""+lugar.getLongitud());
        txtModificarLatitud.setText(""+lugar.getLatitud());
        txtModificarCodigo.setEditable(false);
    }//GEN-LAST:event_btnModificarBuscarActionPerformed

    private void btnModificarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarCancelarActionPerformed
        // TODO add your handling code here:
        txtModificarCodigo.setText(null);
        txtModificarNombre.setText(null);
        txtModificarLongitud.setText(null);
        txtModificarLatitud.setText(null);
        lugar = new lugarDP();
    }//GEN-LAST:event_btnModificarCancelarActionPerformed

    private void btnEliminarBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarBuscarActionPerformed
        // TODO add your handling code here:
        lugar.setCodigo(txtEliminarCodigo.getText());
        lugar = lugar.parametroDP();
        txtEliminarNombre.setText(lugar.getNombre());
        txtEliminarLongitud.setText(""+lugar.getLongitud());
        txtEliminarLatitud.setText(""+lugar.getLatitud());
        txtEliminarCodigo.setEditable(false);
    }//GEN-LAST:event_btnEliminarBuscarActionPerformed

    private void btnEliminarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEliminarActionPerformed
        // TODO add your handling code here:
        lugar.eliminarDP();
        txtEliminarCodigo.setText(null);
        txtEliminarNombre.setText(null);
        txtEliminarLongitud.setText(null);
        txtEliminarLatitud.setText(null);
        txtEliminarCodigo.setEditable(true);
        lugar = new lugarDP();
    }//GEN-LAST:event_btnEliminarEliminarActionPerformed

    private void btnEliminarCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCancelarActionPerformed
        // TODO add your handling code here:
        txtEliminarCodigo.setText(null);
        txtEliminarNombre.setText(null);
        txtEliminarLongitud.setText(null);
        txtEliminarLatitud.setText(null);
        lugar = new lugarDP();
    }//GEN-LAST:event_btnEliminarCancelarActionPerformed

    private void btnParametroBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParametroBuscarActionPerformed
        // TODO add your handling code here:
        borrarRegistrosParametro();
        lugar.setCodigo(txtParametroCodigo.getText().trim());
        if(lugar.verificarDP() == true){
            txtParametroCodigo.setText(null);
            lugar = lugar.parametroDP();
            System.out.println(lugar.toString());
            Object o[] = null;
            modelo2.addRow(o);
            modelo2.setValueAt(lugar.getCodigo(), 0, 0);
            modelo2.setValueAt(lugar.getNombre(), 0, 1);
            modelo2.setValueAt(lugar.getLongitud(), 0, 2);
            modelo2.setValueAt(lugar.getLatitud(), 0, 3);
        }
        else{
            JOptionPane.showMessageDialog(this, "No existe ningun registro");
        }
    }//GEN-LAST:event_btnParametroBuscarActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:      
        borrarRegistrosGeneral();
        ArrayList<lugarDP> lugares = new ArrayList<lugarDP>();
        Object o[] = null;
        lugares = lugar.generalDP();
        for(int i=0; i < lugares.size(); i++){
            modelo1.addRow(o);
            lugarDP aux = lugares.get(i);
            modelo1.setValueAt(aux.getCodigo(), i, 0);
            modelo1.setValueAt(aux.getNombre(), i, 1);
            modelo1.setValueAt(aux.getLongitud(), i, 2);
            modelo1.setValueAt(aux.getLatitud(), i, 3);
        }
        
    }//GEN-LAST:event_jButton12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(lugarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lugarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lugarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lugarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lugarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearGuardar;
    private javax.swing.JButton btnEliminarBuscar;
    private javax.swing.JButton btnEliminarCancelar;
    private javax.swing.JButton btnEliminarEliminar;
    private javax.swing.JButton btnModificarBuscar;
    private javax.swing.JButton btnModificarCancelar;
    private javax.swing.JButton btnModificarGuardar;
    private javax.swing.JButton btnParametroBuscar;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablaConsultaGeneral;
    private javax.swing.JTable tablaConsultaParametro;
    private javax.swing.JButton txtCrearCancelar;
    private javax.swing.JTextField txtCrearCodigo;
    private javax.swing.JTextField txtCrearLatitud;
    private javax.swing.JTextField txtCrearLongitud;
    private javax.swing.JTextField txtCrearNombre;
    private javax.swing.JTextField txtEliminarCodigo;
    private javax.swing.JTextField txtEliminarLatitud;
    private javax.swing.JTextField txtEliminarLongitud;
    private javax.swing.JTextField txtEliminarNombre;
    private javax.swing.JTextField txtModificarCodigo;
    private javax.swing.JTextField txtModificarLatitud;
    private javax.swing.JTextField txtModificarLongitud;
    private javax.swing.JTextField txtModificarNombre;
    private javax.swing.JTextField txtParametroCodigo;
    // End of variables declaration//GEN-END:variables
}
