/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

import java.awt.Color;

/**
 *
 * @author AXEL
 */
public class Ventana {
    private String material;
    private Color color;
    private float alto;
    private float ancho;

    public Ventana() {
    }

    public Ventana(String material, Color color, float alto, float ancho) {
        this.material = material;
        this.color = color;
        this.alto = alto;
        this.ancho = ancho;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getAlto() {
        return alto;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "Ventana{" + "material=" + material + ", color=" + color + ", alto=" + alto + ", ancho=" + ancho + '}';
    }
    
    public void abrir(){
        System.out.println("Abriendo puerta...");
    }
    
    public void cerrar(){
        System.out.println("Cerrando puerta...");
    }
}
