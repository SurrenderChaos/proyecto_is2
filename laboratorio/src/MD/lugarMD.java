/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MD;

import DP.lugarDP;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author benav
 */
public class lugarMD {
    private lugarDP lugardp;
    private Connection con = null;
    private Statement stmt;
    private ResultSet result;
    private String cadena;
    Coneccion coneccion = new Coneccion();
    
    public lugarMD(lugarDP lugardp){
        this.lugardp = lugardp;
    }
    
    public boolean verificar(){
        try{
            con = coneccion.conectar();
            stmt = con.createStatement();
            result = stmt.executeQuery("SELECT * FROM LUGARES");
            while(result.next()){
                if(result.getString(1).trim().compareTo(lugardp.getCodigo()) == 0){
                    System.out.println("lugar encontrado");
                    con = coneccion.cerrarConeccion();
                    return true;
                }
            }
            System.out.println("lugar no encontrado");
            con = coneccion.cerrarConeccion();           
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public void crear(){
        try{
            con = coneccion.conectar();
            stmt = con.createStatement();
            cadena = "INSERT INTO LUGARES( LUGCODIGO, LUGNOMBRE, LUGLATITUD, LUGLONGITUD) VALUES('"+
                    lugardp.getCodigo() + "', '"+
                    lugardp.getNombre() + "', '"+
                    lugardp.getLatitud() + "', '"+
                    lugardp.getLongitud() +"')";
            System.out.println(cadena);
            stmt.executeQuery(cadena);
            JOptionPane.showMessageDialog(null, "Lugar ingresado con exito");
            System.out.println("lugar ingresado con exito");
            con = coneccion.cerrarConeccion();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void modificar(){
        int verifica = 0;
        try{
            con = coneccion.conectar();
            stmt = con.createStatement();
            cadena = "UPDATE LUGARES SET LUGNOMBRE = '"+ lugardp.getNombre()+"', "+
                    "LUGLATITUD = '"+lugardp.getLatitud() +"', "+
                    "LUGLONGITUD = '"+lugardp.getLongitud()+"' WHERE LUGCODIGO = '"+lugardp.getCodigo()+"'";
            System.out.println(cadena);
            verifica = stmt.executeUpdate(cadena);
            if(verifica >0){
                JOptionPane.showMessageDialog(null, "Lugar modificado con exito");
                System.out.println("lugar modificado con exito");
            }
            con = coneccion.cerrarConeccion();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void eliminar(){
        int verifica = 0;
        try{
            con = coneccion.conectar();
            stmt = con.createStatement();
            cadena = "DELETE FROM LUGARES WHERE LUGCODIGO = '"+lugardp.getCodigo()+"'";
            System.out.println(cadena);
            verifica = stmt.executeUpdate(cadena);
            if(verifica > 0){
                JOptionPane.showMessageDialog(null, "Lugar eliminado con exito");
                System.out.println("lugar eliminado con exito");
            }
            con = coneccion.cerrarConeccion();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public lugarDP consultaP(){
        try{
            con = coneccion.conectar();
            stmt = con.createStatement();
            cadena = "SELECT * FROM LUGARES WHERE LUGCODIGO = '" + lugardp.getCodigo().trim()+"'";
            System.out.println(cadena);
            result = stmt.executeQuery(cadena);            
            while(result.next()){
                if(result.getString(1).trim().compareTo(lugardp.getCodigo()) == 0){
                    lugardp.setNombre(result.getString(2).trim());
                    lugardp.setLatitud(result.getInt(3));
                    lugardp.setLongitud(result.getInt(4));
                }
            }
            con = coneccion.cerrarConeccion();
        }catch(Exception e){
            e.printStackTrace();
        }
        return lugardp;
    }
    
    public ArrayList consultaG(){
        lugarDP aux;
        ArrayList<lugarDP> lugares = new ArrayList<lugarDP>();
        try{
            con = coneccion.conectar();
            stmt = con.createStatement();
            result = stmt.executeQuery("SELECT * FROM LUGARES ORDER BY LUGCODIGO ASC");
            while(result.next()){
                aux = new lugarDP();
                aux.setCodigo(result.getString(1).trim());
                aux.setNombre(result.getString(2).trim());
                aux.setLatitud(result.getInt(3));
                aux.setLongitud(result.getInt(4));
                lugares.add(aux);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        con = coneccion.cerrarConeccion();
        return lugares;
    }
}
