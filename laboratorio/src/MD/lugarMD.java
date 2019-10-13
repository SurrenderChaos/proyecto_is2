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
import java.text.SimpleDateFormat;
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
            result = stmt.executeQuery("select * from LUGARES");
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
        String aux = "";
        try{
            con = coneccion.conectar();
            stmt = con.createStatement();
            cadena = "INSERT INTO LUGARES( CODIGO, NOMBRE, LATITUD, LONGITUD) VALUES('"+
                    lugardp.getCodigo() + "', '"+
                    lugardp.getNombre() + "', '"+
                    lugardp.getLatitud() + "', '"+
                    lugardp.getLongitud() +"');";
            System.out.println(cadena);
            stmt.executeQuery(cadena);
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
            cadena = "UPDATE LUGARES SET NOMBRE = '"+ lugardp.getNombre()+"', "+
                    "LATITUD = '"+lugardp.getLatitud() +"', "+
                    "LONGITUD = '"+lugardp.getLongitud()+"' WHERE CODIGO = '"+lugardp.getCodigo()+"' ;";
            System.out.println(cadena);
            verifica = stmt.executeUpdate(cadena);
            if(verifica >0){
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
            cadena = "DELETE FROM LUGARES WHERE ID = "+lugardp.getCodigo();
            System.out.println(cadena);
            verifica = stmt.executeUpdate(cadena);
            if(verifica > 0){
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
            result = stmt.executeQuery("SELECT * FROM LUGARES WHERE CODIGO = '" + lugardp.getCodigo()+"';");
            while(result.next()){
                if(result.getString(1).trim().compareTo(lugardp.getCodigo()) == 0){
                    lugardp.setNombre(result.getString(2));
                    lugardp.setLatitud(result.getDouble(3));
                    lugardp.setLongitud(result.getDouble(4));
                }
            }
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
            result = stmt.executeQuery("SELECT * FROM LUGARES");
            while(result.next()){
                aux = new lugarDP();
                aux.setCodigo(result.getString(1));
                aux.setNombre(result.getString(2));
                aux.setLatitud(result.getDouble(3));
                aux.setLongitud(result.getDouble(4));
                lugares.add(aux);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lugares;
    }
}
