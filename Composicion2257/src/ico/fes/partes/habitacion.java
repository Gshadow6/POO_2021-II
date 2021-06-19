/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.partes;

/**
 *
 * @author AXEL
 */
public class habitacion {
    private int apagadores;
    private int contactos;
    private Muro [] muro;
    private Techo techo;
    private Piso piso;

    public habitacion() {
    }

    public habitacion(int apagadores, int contactos, Muro [] muro, Techo techo, Piso piso) {
        this.apagadores = apagadores;
        this.contactos = contactos;
        this.muro = muro;
        this.techo = techo;
        this.piso = piso;
    }

    public Piso getPiso() {
        return piso;
    }

    public void setPiso(Piso piso) {
        this.piso = piso;
    }

    public int getApagadores() {
        return apagadores;
    }

    public void setApagadores(int apagadores) {
        this.apagadores = apagadores;
    }

    public int getContactos() {
        return contactos;
    }

    public void setContactos(int contactos) {
        this.contactos = contactos;
    }

    public Muro[] getMuro() {
        return muro;
    }

    public void setMuro(Muro[] muro) {
        this.muro = muro;
    }

    public Techo getTecho() {
        return techo;
    }

    public void setTecho(Techo techo) {
        this.techo = techo;
    }

    @Override
    public String toString() {
        return "habitacion{" + "apagadores=" + apagadores + ", contactos=" + contactos + ", muro=" + muro + ", techo=" + techo + ", piso=" + piso + '}';
    }
    
    
}
