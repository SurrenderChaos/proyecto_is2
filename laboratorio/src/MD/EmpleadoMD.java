/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MD;
import DP.EmpleadoDP;
import java.sql.Connection;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Properties;
import java.util.Vector;

/**
 *
 * @author sandy
 */
public class EmpleadoMD {
    private EmpleadoDP empleado_dp;
    private java.sql.Connection con;
    private java.sql.ResultSet rs;

    public EmpleadoMD(EmpleadoDP empleado_dp) {
        this.empleado_dp = empleado_dp;
    }
    
     public Connection conectarDB(){
        InputStream input;
        try{
            input = new FileInputStream("src/MD/configuracion.properties");
            Properties prop = new Properties();
            prop.load(input);
            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String pass = prop.getProperty("pass");
            String driver = prop.getProperty("driver");
            Class.forName(driver);
            this.con = DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }  
     
    public  void desconectarDB(){
        try
        {
            con.close();
        }
        catch (Exception e){}
    }
    
    public void insertar(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String completeDateInsert = "";
        try {
            String fechaNac = formatter.format(empleado_dp.getFechaEmpleado());
            completeDateInsert = fechaNac;
            //completeDateInsert = "DATE(\""+ fechaNac +"\")";
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            conectarDB();
            Statement stt = con.createStatement();
            
             stt.execute("ALTER SESSION SET nls_date_format='yyyy-mm-dd'");
            
            String query = "INSERT INTO empleado (CODIGO_EMPLEADO,CEDULA_EMPLEADO,NOMBRE_EMPLEADO,TELEFONO_EMPLEADO,NACIMIENTO_EMPLEADO,DIRECCION_EMPLEADO,CARGO_EMPLEADO)" + 
	        	    "VALUES('"+empleado_dp.getCodigoEmpleado()+"','"
                    +empleado_dp.getCedulaEmpleado()+"','"
                    +empleado_dp.getNombreEmpleado()+"','"
                    +empleado_dp.getTelefonoEmpleado()+"','"
                    + completeDateInsert + "','"
                    +empleado_dp.getDireccionEmpleado()+"','"
                    +empleado_dp.getCargoEmpleado()+"')";
            System.out.println(query);
            stt.execute(query);
            stt.close();
            }
	    catch (Exception e){
                System.out.println(e.toString());
            }
        
    }
    
    public void actualizar(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String completeDateInsert = "";
        
        try {
            String fechaNac = formatter.format(empleado_dp.getFechaEmpleado());
            completeDateInsert = fechaNac;
            System.out.println(completeDateInsert);
            
            //completeDateInsert = "DATE(\""+ fechaNac +"\")";
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try{
            conectarDB();
            Statement stt = con.createStatement();
            
            stt.execute("ALTER SESSION SET nls_date_format='yyyy-mm-dd'");//primero se debe setear la consola de oracle para que acepte el formato que vamos a poner
           

            stt.execute("UPDATE empleado SET CEDULA_EMPLEADO = '"+empleado_dp.getCedulaEmpleado()+"', NOMBRE_EMPLEADO = '"+empleado_dp.getNombreEmpleado()+"', TELEFONO_EMPLEADO = '"+empleado_dp.getTelefonoEmpleado()+"', NACIMIENTO_EMPLEADO = '"+completeDateInsert+"',DIRECCION_EMPLEADO = '"+empleado_dp.getDireccionEmpleado()+"',CARGO_EMPLEADO = '"+empleado_dp.getCargoEmpleado()+"'   "+
                                    "WHERE CODIGO_EMPLEADO='"+empleado_dp.getCodigoEmpleado()+"'");

            stt.close();
            }
        catch (Exception exc){
            System.out.println(exc.toString());
        }
    
    }
    
    public void eliminar(){
        try{
            conectarDB();
            Statement stt = con.createStatement();
            

            stt.execute("DELETE FROM empleado " + 
                        "WHERE CODIGO_EMPLEADO='"+empleado_dp.getCodigoEmpleado()+"'");

            stt.close();
            }
        catch (Exception exc){}
 
    }
    
    
    public boolean verificarCodigo(){
        try{
            conectarDB();
          
            System.out.println("conectado");
            Statement stt = con.createStatement();
            System.out.println("creado statement");
            ResultSet res = stt.executeQuery("select * from empleado");
            
            while (res.next()){
                System.out.println(empleado_dp.toString());
                System.out.println("res = "+res.getString(1).trim());
                if(this.empleado_dp.getCodigoEmpleado().equals(res.getString(1).trim()))
                    return true;
	        	 
	        }
            
            System.out.println("hecho el query");
	        res.close();
	        stt.close();
            
             
        }catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;

    }
    
    public Vector  listar(){
        
	Vector listaEmpleados = new Vector();
        
		
	try{
                conectarDB();
		Statement stt = con.createStatement();
	        
	         
	        this.rs = stt.executeQuery("SELECT * FROM empleado");
	        while (this.rs.next()){
                    EmpleadoDP empleadoAInsertar = new EmpleadoDP();
                    empleadoAInsertar.setCodigoEmpleado(rs.getString(1));
                    empleadoAInsertar.setCedulaEmpleado(rs.getString(2));
                    empleadoAInsertar.setNombreEmpleado(rs.getString(3));
                    empleadoAInsertar.setTelefonoEmpleado(rs.getString(4));
                    empleadoAInsertar.setFechaEmpleado(rs.getDate(5));
                    empleadoAInsertar.setDireccionEmpleado(rs.getString(6));
                    empleadoAInsertar.setCargoEmpleado(rs.getString(7));
                    listaEmpleados.add(empleadoAInsertar); 
	        }
	        this.rs.close();
	        stt.close();
		}
	    catch (Exception e){
                System.out.println(e.toString());
            }
	
        
	return listaEmpleados;
        
    }
    
    public EmpleadoDP buscar(){
        conectarDB();
        EmpleadoDP empleadoAux = new EmpleadoDP();
        
        try{
            Statement stt = con.createStatement();
            

            this.rs = stt.executeQuery("SELECT * FROM empleado WHERE CODIGO_EMPLEADO='"+empleado_dp.getCodigoEmpleado()+"' ");

            while (this.rs.next()){
                    empleadoAux.setCodigoEmpleado(this.rs.getString(1));
                    empleadoAux.setCedulaEmpleado(this.rs.getString(2));
                    empleadoAux.setNombreEmpleado(this.rs.getString(3));
                    empleadoAux.setTelefonoEmpleado(this.rs.getString(4));
                    empleadoAux.setFechaEmpleado(this.rs.getDate(5));
                    empleadoAux.setDireccionEmpleado(this.rs.getString(6));
                    empleadoAux.setCargoEmpleado(this.rs.getString(7));
            }
            this.rs.close();
            stt.close();
            }
        catch (Exception exc){
            System.out.println(exc.toString());
        }
        
        return empleadoAux;
    }
    
    /*public EmpleadoDP buscarParametro(int pos, String valor){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        String completeDateInsert = "";
        try {
            String fechaNac = formatter.format(empleado_dp.getFechaEmpleado());
            completeDateInsert = fechaNac;
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        conectarDB();
        EmpleadoDP empleadoAux = new EmpleadoDP();
        String parametro = "";
        


        
        switch(pos) {
            
        case 0:
            parametro = "EMPLEADO_CEDULA";
          
          break;
        case 1:
          parametro = "EMPLEADO_NOMBRE";
          break;
        case 2:
          parametro = "EMPLEADO_DIRECCION";
          break;
        case 3:
          parametro = "EMPLEADO_CARGO";
          break;
        case 4:
          parametro = "EMPLEADO_FECHA";
          break;
       
      }
        
        try{
            Statement stt = con.createStatement();
            
            stt.execute("ALTER SESSION SET nls_date_format='yyyy-mm-dd'");

            this.rs = stt.executeQuery("SELECT * FROM empleado WHERE '"+parametro+"'='"+valor+"'");

            while (this.rs.next()){
                    empleadoAux.setCodigoEmpleado(this.rs.getString(1));
                    empleadoAux.setCedulaEmpleado(this.rs.getString(2));
                    empleadoAux.setNombreEmpleado(this.rs.getString(3));
                    empleadoAux.setTelefonoEmpleado(this.rs.getString(4));
                    empleadoAux.setFechaEmpleado(this.rs.getDate(5));
                    empleadoAux.setDireccionEmpleado(this.rs.getString(6));
                    empleadoAux.setCargoEmpleado(this.rs.getString(7));
            }
            this.rs.close();
            stt.close();
            }
        catch (Exception exc){
            System.out.println(exc.toString());
        }
        
        return empleadoAux;
    }*/
    
    
    public Vector  buscarParametro(int pos, String valor){
        
	Vector listaEmpleadosParametro = new Vector();
        String parametro = "";
        switch(pos) {
            
        case 0:
            parametro = "CEDULA_EMPLEADO";
          
          break;
        case 1:
          parametro = "NOMBRE_EMPLEADO";
          break;
        case 2:
          parametro = "DIRECCION_EMPLEADO";
          break;
        case 3:
          parametro = "CARGO_EMPLEADO";
          break;
        case 4:
          parametro = "FECHA_EMPLEADO";
          break;
       
      }
        
		
	try{
                conectarDB();
		Statement stt = con.createStatement();
                
	        
	         
	        this.rs = stt.executeQuery("SELECT * FROM empleado WHERE "+parametro+" = '"+valor+"'");
	        while (this.rs.next()){
                    EmpleadoDP empleadoAInsertar = new EmpleadoDP();
                    empleadoAInsertar.setCodigoEmpleado(rs.getString(1));
                    empleadoAInsertar.setCedulaEmpleado(rs.getString(2));
                    empleadoAInsertar.setNombreEmpleado(rs.getString(3));
                    empleadoAInsertar.setTelefonoEmpleado(rs.getString(4));
                    empleadoAInsertar.setFechaEmpleado(rs.getDate(5));
                    empleadoAInsertar.setDireccionEmpleado(rs.getString(6));
                    empleadoAInsertar.setCargoEmpleado(rs.getString(7));
                    listaEmpleadosParametro.add(empleadoAInsertar); 
	        }
	        this.rs.close();
	        stt.close();
		}
	    catch (Exception e){
                System.out.println(e.toString());
            }
	
        
	return listaEmpleadosParametro;
        
    }
     
    
    
    
    
    
    

    
    
    
}

