/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.partes;

import java.awt.Color;

/**
 *
 * @author AXEL
 */
public class Piso {
    private float ancho;
    private float largo;
    private String material;
    private Color color;

    public Piso() {
    }

    public Piso(float ancho, float largo, String material, Color color) {
        this.ancho = ancho;
        this.largo = largo;
        this.material = material;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Piso{" + "ancho=" + ancho + ", largo=" + largo + ", material=" + material + ", color=" + color + '}';
    }
    
    
}
