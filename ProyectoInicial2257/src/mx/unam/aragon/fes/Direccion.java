/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

import java.io.Serializable;

/**
 *
 * @author unam
 */
public class Direccion implements Serializable{
    private String calle;
    private String numero;
    private String colonia;
    private String delegacion;
    private String estado;
    private String cp;

    public Direccion() {
    }

    public Direccion(String calle, String numero, String colonia, String delegacion, String estado, String cp) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.delegacion = delegacion;
        this.estado = estado;
        this.cp = cp;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + "\n numero=" + numero + "\n colonia=" + colonia + "\n delegacion=" + delegacion + "\n estado=" + estado + "\n cp=" + cp + '}';
    }
    
    
         
}
