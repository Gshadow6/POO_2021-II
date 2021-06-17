/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.componentes;

/**
 *
 * @author AXEL
 */
public class Teclado {
    private String marca;
    private String modelo;
    private int NumeroTeclas;
    private double multimedia;

    public Teclado() {
    }

    public Teclado(String marca, String modelo, int NumeroTeclas, double multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.NumeroTeclas = NumeroTeclas;
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumeroTeclas() {
        return NumeroTeclas;
    }

    public void setNumeroTeclas(int NumeroTeclas) {
        this.NumeroTeclas = NumeroTeclas;
    }

    public double getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(double multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", NumeroTeclas=" + NumeroTeclas + ", multimedia=" + multimedia + '}';
    }
    
    
}
