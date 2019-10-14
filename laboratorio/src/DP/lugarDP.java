/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DP;

import MD.lugarMD;
import java.util.ArrayList;

/**
 *
 * @author benav
 */
public class lugarDP {
    private String codigo;
    private String nombre;
    private double latitud;
    private double longitud;
    private lugarMD lugarmd;

    public lugarDP() {
    }

    public lugarDP(String codigo, String nombre, double latitud, double longitud) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    public boolean verificarDP(){
        lugarMD lugarmd = new lugarMD(this);
        return lugarmd.verificar();
    }
    
    public void crearDP(){
        lugarMD lugarmd = new lugarMD(this);
        lugarmd.crear();
    }
    
    public void modificarDP(){
        lugarMD lugarmd = new lugarMD(this);
        lugarmd.modificar();
    }
    
    public void eliminarDP(){
        lugarMD lugarmd = new lugarMD(this);
        lugarmd.eliminar();
    }
    
    public lugarDP parametroDP(){
        lugarMD lugarmd = new lugarMD(this);
        return lugarmd.consultaP();
    }
    
    public ArrayList generalDP(){
        ArrayList<lugarDP> lugares = new ArrayList<lugarDP>();
        lugarMD lugarmd = new lugarMD(this);
        lugares = lugarmd.consultaG();
        return lugares;
    }
}
