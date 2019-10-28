/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MD;

import DP.InvestigadorDP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Jose Astudillo
 */
public class InvestigadorMD {
    private InvestigadorDP DInvestigadorDP;
    private Connection conect =null;
    private Statement stm;
    private ResultSet resul;
    Coneccion conectarBD = new Coneccion();
    
    
    
    public InvestigadorMD(InvestigadorDP invetigadordp){
        this.DInvestigadorDP = invetigadordp;
    }
    
    
    public boolean ValidarMD(){
        try {
            conect = conectarBD.conectar();
            stm = conect.createStatement();
            resul = stm.executeQuery("SELECT * FROM INVESTIGADORES");
            while(resul.next()){
                if (resul.getString(1).trim().compareTo(DInvestigadorDP.getInCodigo())==0) {
                   conect = conectarBD.cerrarConeccion();
                   return true;
                }
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        return false;
    }
    
    
    public void InsertarMD(){
        try {
            conect = conectarBD.conectar();
            stm = conect.createStatement();
            stm.executeQuery("INSERT INTO INVESTIGADORES (CODIGO, CEDULA, NOMBRE, TELEFONO, DIRECCION, CARGO) VALUES ('"
                    +DInvestigadorDP.getInCodigo()+"','"
                    +DInvestigadorDP.getInCedula()+"','"
                    +DInvestigadorDP.getInNombre()+"','"
                    +DInvestigadorDP.getInTelefono()+"','"
                    +DInvestigadorDP.getInDireccion()+"','"
                    +DInvestigadorDP.getInCargo()+"')"
                    );
            conect = conectarBD.cerrarConeccion();
            JOptionPane.showMessageDialog(null,"Ingresado correctamente");
            
        } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,"Error en la Inserción a la Base de Datos");
        }  
        
    }
 
        
    public void ModificarMD(){
        
        int comprueba =0;
        try {
            conect = conectarBD.conectar();
            stm = conect.createStatement();
            comprueba = stm.executeUpdate("UPDATE INVESTIGADORES SET CEDULA = '"+ DInvestigadorDP.getInCedula()+"', "+
                    "NOMBRE = '"+DInvestigadorDP.getInNombre()+"', "+
                    "TELEFONO = '"+DInvestigadorDP.getInTelefono()+"', "+
                    "DIRECCION = '"+DInvestigadorDP.getInDireccion()+"', "+
                    "CARGO = '"+DInvestigadorDP.getInCargo()+"' WHERE CODIGO = '"+DInvestigadorDP.getInCodigo()+"'");
            int confirmado = JOptionPane.showConfirmDialog(null,"Esta Seguro de Modificar la Información?");

            if (JOptionPane.OK_OPTION == confirmado){
                 if (comprueba>0) {
                     System.out.println("Se Modificó la información con Éxito..!!");
                
                     }
            }
            else{
                System.out.println("No se ha borrado nada de la Información");
        
            }
            
            conect = conectarBD.cerrarConeccion();
      
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
            
    public void EliminarMD(){
        int comprueba =0;
        try {
            conect = conectarBD.conectar();
            stm = conect.createStatement();
            comprueba = stm.executeUpdate("DELETE FROM INVESTIGADORES WHERE CODIGO='"+DInvestigadorDP.getInCodigo()+ "'");
            int confirmado = JOptionPane.showConfirmDialog(null,"Esta Seguro de Borrar la Información?");

            if (JOptionPane.OK_OPTION == confirmado){
                 if (comprueba>0) {
                     System.out.println("Se borro la información con Éxito..!!");
                
                     }
            }
            else{
                System.out.println("No se ha borrado nada de la Información");
        
            }
            
            conect = conectarBD.cerrarConeccion();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public InvestigadorDP ConsultaMD(){
        int ced;
        String cedula ;
        try {
            conect = conectarBD.conectar();
            stm=conect.createStatement();
            resul= stm.executeQuery("SELECT * FROM INVESTIGADORES WHERE CODIGO ='" +DInvestigadorDP.getInCodigo().trim()+"'");
            while (resul.next()) {                
                if (resul.getString(1).trim().compareTo(DInvestigadorDP.getInCodigo())==0) {
                    // cedula=resul.getString(2);
                    // ced = Integer.parseInt(cedula);
                   DInvestigadorDP.setInCedula(resul.getString(2));
                   DInvestigadorDP.setInNombre(resul.getString(3));
                   DInvestigadorDP.setInTelefono(resul.getString(4));
                   DInvestigadorDP.setInDireccion(resul.getString(5));
                   DInvestigadorDP.setInCargo(resul.getString(6));
                }
                
            }
            conect = conectarBD.cerrarConeccion();
        
        } catch (Exception e) {
        }
        return DInvestigadorDP;
        }
    
    public ArrayList PresentarMD(){
        InvestigadorDP ext;
        int ced;
        String cedula ;
        ArrayList<InvestigadorDP> Inv = new ArrayList<InvestigadorDP>();
        try {
            conect = conectarBD.conectar();
            stm= conect.createStatement();
            resul = stm.executeQuery("SELECT * FROM INVESTIGADORES ORDER BY CODIGO");
            while (resul.next()) {                
                ext = new InvestigadorDP();
                ext.setInCodigo(resul.getString(1).trim());
                // cedula=resul.getString(2);
                // ced = Integer.parseInt(cedula);
                ext.setInCedula(resul.getString(2));
                ext.setInNombre(resul.getString(3));
                ext.setInTelefono(resul.getString(4));
                ext.setInDireccion(resul.getString(5));
                ext.setInCargo(resul.getString(6));
                Inv.add(ext);
            }
        } catch (Exception e) {
        e.printStackTrace();
        }
        
        return Inv;
        
    }
    }
