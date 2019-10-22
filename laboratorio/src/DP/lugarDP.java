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
    private int latitud;
    private int longitud;
    private lugarMD lugarmd;

    public lugarDP() {
    }

    public lugarDP(String codigo, String nombre, int latitud, int longitud) {
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

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
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

    @Override
    public String toString() {
        return "lugarDP{" + "codigo=" + codigo + ", nombre=" + nombre + ", latitud=" + latitud + ", longitud=" + longitud + ", lugarmd=" + lugarmd + '}';
    }
    
    
}
