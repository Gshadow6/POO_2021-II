/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractos;

import ico.fes.geometria.Circulo;
import ico.fes.geometria.Cuadrado;

/**
 *
 * @author AXEL
 */
public class Abstractos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado cuad1= new Cuadrado(2.0f);
        cuad1.area();
        
        Circulo cir1= new Circulo(2.0f);
        cir1.area();
    }
    
}
