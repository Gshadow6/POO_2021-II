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
public class Puerta {
    private String material;
    private Color color;
    private boolean conVidrio;

    public Puerta() {
    }

    public Puerta(String material, Color color, boolean conVidrio) {
        this.material = material;
        this.color = color;
        this.conVidrio = conVidrio;
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

    public boolean isConVidrio() {
        return conVidrio;
    }

    public void setConVidrio(boolean conVidrio) {
        this.conVidrio = conVidrio;
    }

    @Override
    public String toString() {
        return "Puerta{" + "material=" + material + ", color=" + color + ", conVidrio=" + conVidrio + '}';
    }
    
    public void abrir(){
        System.out.println("Abriendo puerta....");
    }
    
    public void cerrar(){
        System.out.println("Cerrando puerta...");
    }
}
