/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.geometria;

/**
 *
 * @author AXEL
 */
public class Circulo implements Figura{
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public void area() {
        float areaTemp= (float)Math.PI * (this.radio * this.radio);
        System.out.println("El area del circulo es"+ areaTemp);
    }

}
