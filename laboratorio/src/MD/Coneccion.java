/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MD;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author benav
 */
public class Coneccion {
    private Connection con=null;
    private Statement stmt;
    private ResultSet result;
    private String cadena;

    public Coneccion() {
    }
    
    public Connection conectar(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            this.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","Josedh18");
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
    
    public Connection cerrarConeccion(){
        try{
            this.con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        con = null;
        return con;
    }
}
