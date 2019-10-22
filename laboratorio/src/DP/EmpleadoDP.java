/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

import MD.EmpleadoMD;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author sandy
 */
public class EmpleadoDP {
    private EmpleadoMD empleado_md;
    private String codigoEmpleado;
    private String cedulaEmpleado;
    private String nombreEmpleado;
    private String telefonoEmpleado;
    private Date fechaEmpleado;
    private String direccionEmpleado;
    private String cargoEmpleado;

    public EmpleadoDP() {
        this.empleado_md = new EmpleadoMD(this);
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getTelefonoEmpleado() {
        return telefonoEmpleado;
    }

    public void setTelefonoEmpleado(String telefonoEmpleado) {
        this.telefonoEmpleado = telefonoEmpleado;
    }

    public Date getFechaEmpleado() {
        return fechaEmpleado;
    }

    public void setFechaEmpleado(Date fechaEmpleado) {
        this.fechaEmpleado = fechaEmpleado;
    }

    public String getDireccionEmpleado() {
        return direccionEmpleado;
    }

    public void setDireccionEmpleado(String direccionEmpleado) {
        this.direccionEmpleado = direccionEmpleado;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }
    
    public void insertarEmpleado(){
        empleado_md.insertar();
    }
    
    public void actualizarEmpleado(){
        empleado_md.actualizar();
    }
    
    public void eliminarEmpleado(){
        empleado_md.eliminar();
    }
    
    public Vector listarEmpleados(){
        return empleado_md.listar();
    }
    
    public EmpleadoDP buscarEmpleado(){
        return empleado_md.buscar();
    }
    
    public Vector buscarParametroEmpleado(int pos, String valor){
        return empleado_md.buscarParametro(pos, valor);
    }
    
    public boolean  verificarCodigoEmpleado(){
        return empleado_md.verificarCodigo();
    }
    
    public Vector llenarParametroEmpleado(){
        return empleado_md.llenarParametro();
    }

    @Override
    public String toString() {
        return "EmpleadoDP{" + "codigoEmpleado=" + codigoEmpleado + ", cedulaEmpleado=" + cedulaEmpleado + ", nombreEmpleado=" + nombreEmpleado + ", telefonoEmpleado=" + telefonoEmpleado + ", fechaEmpleado=" + fechaEmpleado + ", direccionEmpleado=" + direccionEmpleado + ", cargoEmpleado=" + cargoEmpleado + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
