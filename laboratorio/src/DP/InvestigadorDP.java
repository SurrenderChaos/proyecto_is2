/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DP;

import MD.InvestigadorMD;
import java.util.ArrayList;

/**
 *
 * @author Jose Astudillo
 */
public class InvestigadorDP {
    private String InCodigo;
    private String InCedula;
    private String InNombre;
    private String InTelefono;
    private String InDireccion;
    private String InCargo;

    public InvestigadorDP() {
    }

    public InvestigadorDP(String InCodigo, String InCedula, String InNombre, String InTelefono, String InDireccion, String InCargo) {
        this.InCodigo = InCodigo;
        this.InCedula = InCedula;
        this.InNombre = InNombre;
        this.InTelefono = InTelefono;
        this.InDireccion = InDireccion;
        this.InCargo = InCargo;
    }

    public String getInCodigo() {
        return InCodigo;
    }

    public String getInCedula() {
        return InCedula;
    }

    public String getInNombre() {
        return InNombre;
    }

    public String getInTelefono() {
        return InTelefono;
    }

    public String getInDireccion() {
        return InDireccion;
    }

    public String getInCargo() {
        return InCargo;
    }

    public void setInCodigo(String InCodigo) {
        this.InCodigo = InCodigo;
    }

    public void setInCedula(String InCedula) {
        this.InCedula = InCedula;
    }

    public void setInNombre(String InNombre) {
        this.InNombre = InNombre;
    }

    public void setInTelefono(String InTelefono) {
        this.InTelefono = InTelefono;
    }

    public void setInDireccion(String InDireccion) {
        this.InDireccion = InDireccion;
    }

    public void setInCargo(String InCargo) {
        this.InCargo = InCargo;
    }
    
    
    public void ingresarDP(){
        InvestigadorMD InvMD = new InvestigadorMD(this);
        InvMD.InsertarMD();
    }
    
    public void eliminarDP(){
        InvestigadorMD InvMD = new InvestigadorMD(this);
        InvMD.EliminarMD();
    }
    public void modifcarDP(){
        InvestigadorMD InvMD = new InvestigadorMD(this);
        InvMD.ModificarMD();
    }
    
    public ArrayList ConsultaGeneral(){
        ArrayList<InvestigadorDP> Inves = new ArrayList<InvestigadorDP>();
        InvestigadorMD InvMD = new InvestigadorMD(this);
        Inves = InvMD.PresentarMD();
        return Inves;
    }
    
    public InvestigadorDP ConsultaDP(){
        InvestigadorMD InvMD = new InvestigadorMD(this);
        return InvMD.ConsultaMD();
    }
    public boolean VerificarDP(){
        InvestigadorMD InvMD = new InvestigadorMD(this);
        return InvMD.ValidarMD();
    }
    
    public String PresentarDP(){
        return "InvestigadorDP{" + "codigo=" + InCodigo +  ", cedula=" + InCedula +", nombre=" + InNombre + ", telefono=" + InTelefono + ", direccion=" + InDireccion + ", cargo=" + InCargo + '}';
    }
    
}
