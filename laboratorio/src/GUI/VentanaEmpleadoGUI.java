/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DP.EmpleadoDP;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sandy
 */
public class VentanaEmpleadoGUI extends javax.swing.JFrame {

    private EmpleadoDP empleado_dp;
    boolean isEdit = false;
    public VentanaEmpleadoGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tp_empleados = new javax.swing.JTabbedPane();
        p_consultapEmpleados = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tp_Adm_Emp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_ingCodEmp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_ingCedEmp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_ingNomEmp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_ingTelefEmp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_ingFechaEmp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_ingDirEmp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_ingCargoEmp = new javax.swing.JTextField();
        bt_guardarEmp = new javax.swing.JButton();
        bt_EmpBorrar = new javax.swing.JButton();
        lb_ingMensajeEmp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setText("PARÁMETRO");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CÉDULA", "NOMBRE", "DIRECCION", "CARGO", "FECHA" }));

        jLabel10.setText("VALOR DEL PARÁMETRO");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "CÉDULA", "NOMBRE", "FECHA", "CARGO"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout p_consultapEmpleadosLayout = new javax.swing.GroupLayout(p_consultapEmpleados);
        p_consultapEmpleados.setLayout(p_consultapEmpleadosLayout);
        p_consultapEmpleadosLayout.setHorizontalGroup(
            p_consultapEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_consultapEmpleadosLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(p_consultapEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(59, 59, 59)
                .addGroup(p_consultapEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        p_consultapEmpleadosLayout.setVerticalGroup(
            p_consultapEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_consultapEmpleadosLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(p_consultapEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(p_consultapEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_consultapEmpleadosLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        tp_empleados.addTab("Consulta por Parámetros de Empleados", p_consultapEmpleados);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("ADMINISTRACIÓN DE EMPLEADOS");

        jLabel2.setText("CODIGO DE EMPLEADO:");

        tf_ingCodEmp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_ingCodEmpFocusLost(evt);
            }
        });

        jLabel3.setText("CEDULA DE EMPLEADO:");

        jLabel4.setText("NOMBRE DEL EMPLEADO:");

        jLabel5.setText("TELEFONO DEL EMPLEADO:");

        jLabel6.setText("FECHA DE NACIMIENTO:");

        jLabel7.setText("DIRECCION DEL EMPLEADO:");

        jLabel8.setText("CARGO DEL EMPLEADO:");

        bt_guardarEmp.setText("GUARDAR");
        bt_guardarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_guardarEmpActionPerformed(evt);
            }
        });

        bt_EmpBorrar.setText("ELIMINAR");
        bt_EmpBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_EmpBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tp_Adm_EmpLayout = new javax.swing.GroupLayout(tp_Adm_Emp);
        tp_Adm_Emp.setLayout(tp_Adm_EmpLayout);
        tp_Adm_EmpLayout.setHorizontalGroup(
            tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp_Adm_EmpLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(tp_Adm_EmpLayout.createSequentialGroup()
                        .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(bt_guardarEmp))
                        .addGap(147, 147, 147)
                        .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_EmpBorrar)
                            .addGroup(tp_Adm_EmpLayout.createSequentialGroup()
                                .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_ingCodEmp)
                                    .addComponent(tf_ingCedEmp)
                                    .addComponent(tf_ingNomEmp)
                                    .addComponent(tf_ingTelefEmp)
                                    .addComponent(tf_ingFechaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ingDirEmp)
                                    .addComponent(tf_ingCargoEmp, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                                .addGap(65, 65, 65)
                                .addComponent(lb_ingMensajeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        tp_Adm_EmpLayout.setVerticalGroup(
            tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tp_Adm_EmpLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_ingCodEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_ingMensajeEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_ingCedEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_ingNomEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_ingTelefEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_ingFechaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_ingDirEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_ingCargoEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(tp_Adm_EmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_guardarEmp)
                    .addComponent(bt_EmpBorrar))
                .addGap(78, 78, 78))
        );

        tp_empleados.addTab("Administración de Empleados", tp_Adm_Emp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_empleados)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tp_empleados)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_EmpBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_EmpBorrarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar el empleado: "+empleado_dp.getCodigoEmpleado()+"?");
        if(resp==0){
            empleado_dp.eliminarEmpleado();
            lb_ingMensajeEmp.setText("EMPLEADO ELIMINADO");
            this.limpiar();
        }
    }//GEN-LAST:event_bt_EmpBorrarActionPerformed

    private void bt_guardarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_guardarEmpActionPerformed
        empleado_dp.setCedulaEmpleado(tf_ingCedEmp.getText());
        empleado_dp.setDireccionEmpleado(tf_ingDirEmp.getText());
        String fechaNacimiento = this.tf_ingFechaEmp.getText();
        try {
            empleado_dp.setFechaEmpleado(new SimpleDateFormat("dd-MM-yyyy").parse(fechaNacimiento));
        } catch (ParseException ex) {
            System.out.println("Fecha mal ingresada: "+ex.toString());
        }
        empleado_dp.setCargoEmpleado(this.tf_ingCargoEmp.getText());
        empleado_dp.setTelefonoEmpleado(tf_ingTelefEmp.getText());
        empleado_dp.setNombreEmpleado(this.tf_ingNomEmp.getText());

        if (this.isEdit==false){
            empleado_dp.insertarEmpleado();
            lb_ingMensajeEmp.setText("EMPLEADO INGRESADO");
            this.limpiar();
        }
        else
        {
            empleado_dp.actualizarEmpleado();
            lb_ingMensajeEmp.setText("EMPLEADO MODIFICADO");
            this.limpiar();
        }
    }//GEN-LAST:event_bt_guardarEmpActionPerformed

    private void tf_ingCodEmpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_ingCodEmpFocusLost
        //en este metodo se realizan el ingreso, la modificacion, la eliminacion y la busqueda general
        //este metodo lo que hace es cuando se pierde el foco en el text field del codigo, se verifica la existencia del codigo en la base de datos
        String codigoEmpleado = tf_ingCodEmp.getText();
        this.empleado_dp = new EmpleadoDP();
        this.empleado_dp.setCodigoEmpleado(codigoEmpleado);

        boolean verificacion = this.empleado_dp.verificarCodigoEmpleado();

        if (verificacion==false){
            lb_ingMensajeEmp.setText("EMPLEADO DISPONIBLE PARA INGRESO");
            this.tf_ingCedEmp.setText("");
            this.tf_ingDirEmp.setText("");
            this.tf_ingFechaEmp.setText("");
            this.tf_ingNomEmp.setText("");
            this.tf_ingTelefEmp.setText("");
            this.tf_ingCargoEmp.setText("");

            this.isEdit = false;
        }
        else{
            lb_ingMensajeEmp.setText("YA EXISTE ESE EMPLEADO!!");//si el empleado existe se despliegan los datos en los textfields
            EmpleadoDP empleadoBuscado = this.empleado_dp.buscarEmpleado();
            this.isEdit = true;
            tf_ingCedEmp.setText(empleadoBuscado.getCedulaEmpleado());
            tf_ingDirEmp.setText(empleadoBuscado.getDireccionEmpleado());
            tf_ingFechaEmp.setText(empleadoBuscado.getFechaEmpleado().toString());
            tf_ingNomEmp.setText(empleadoBuscado.getNombreEmpleado());
            tf_ingTelefEmp.setText(empleadoBuscado.getTelefonoEmpleado());
            tf_ingCargoEmp.setText(empleadoBuscado.getCargoEmpleado());
        }

        System.out.println(verificacion);
    }//GEN-LAST:event_tf_ingCodEmpFocusLost
     private void limpiar(){
        this.tf_ingCedEmp.setText("");
        this.tf_ingDirEmp.setText("");
        this.tf_ingFechaEmp.setText("");
        this.tf_ingNomEmp.setText("");
        this.tf_ingTelefEmp.setText("");
        this.tf_ingCargoEmp.setText("");
    }
     
     public void cargarTabla(){
        DefaultTableModel modelo1 = new DefaultTableModel();
        jTable1.setModel(modelo1);
        
        modelo1.addColumn("Codigo");
        modelo1.addColumn("Cedula");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Telefono");
        modelo1.addColumn("Fecha");
        modelo1.addColumn("Direccion");
        modelo1.addColumn("Cargo");
        
        
       Vector v1 = new Vector();
       //v1 = empleado_dp.listarEmpleados();
        for (int i = 0; i < v1.size(); i++) {
            Object arr[] = null;
            EmpleadoDP edp_aux = (EmpleadoDP) v1.get(i);
            modelo1.addRow(arr);
            modelo1.setValueAt(edp_aux.getCodigoEmpleado(), i, 0);
            modelo1.setValueAt(edp_aux.getCedulaEmpleado(), i, 1);
            modelo1.setValueAt(edp_aux.getNombreEmpleado(), i, 2);
            modelo1.setValueAt(edp_aux.getTelefonoEmpleado(), i, 3);
            modelo1.setValueAt(edp_aux.getFechaEmpleado(), i, 4);
            modelo1.setValueAt(edp_aux.getDireccionEmpleado(), i, 5);
            modelo1.setValueAt(edp_aux.getCargoEmpleado(), i, 6);
        }
        
        
    }
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
            java.util.logging.Logger.getLogger(VentanaEmpleadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEmpleadoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEmpleadoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_EmpBorrar;
    private javax.swing.JButton bt_guardarEmp;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb_ingMensajeEmp;
    private javax.swing.JPanel p_consultapEmpleados;
    private javax.swing.JTextField tf_ingCargoEmp;
    private javax.swing.JTextField tf_ingCedEmp;
    private javax.swing.JTextField tf_ingCodEmp;
    private javax.swing.JTextField tf_ingDirEmp;
    private javax.swing.JTextField tf_ingFechaEmp;
    private javax.swing.JTextField tf_ingNomEmp;
    private javax.swing.JTextField tf_ingTelefEmp;
    private javax.swing.JPanel tp_Adm_Emp;
    private javax.swing.JTabbedPane tp_empleados;
    // End of variables declaration//GEN-END:variables
}
