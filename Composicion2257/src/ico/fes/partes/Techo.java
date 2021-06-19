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
public class Techo {
    private float largo;
    private float ancho;
    private Color color;
    private String material;

    public Techo() {
    }

    public Techo(float largo, float ancho, Color color, String material) {
        this.largo = largo;
        this.ancho = ancho;
        this.color = color;
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Techo{" + "largo=" + largo + ", ancho=" + ancho + ", color=" + color + ", material=" + material + '}';
    }
    
    
}
