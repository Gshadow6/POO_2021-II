/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion2257;

import ico.fes.objetos.Puerta;
import ico.fes.objetos.Ventana;
import ico.fes.partes.Muro;
import ico.fes.partes.Piso;
import ico.fes.partes.Techo;
import ico.fes.partes.habitacion;
import java.awt.Color;

/**
 *
 * @author AXEL
 */
public class Composicion2257 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Muro muroNorte = new Muro();
        muroNorte.setPuerta(new Puerta("madera", Color.white, true));
        
        Ventana[] tmpVentanas= new Ventana[2];
        tmpVentanas[0]= new Ventana("Madera", Color.yellow, 0.5f, 1.0f);
        tmpVentanas[1]= new Ventana("Madera", Color.green, 0.5f, 1.0f);
        muroNorte.setVentana(tmpVentanas);
        
        System.out.println(muroNorte);
        
        System.out.println(muroNorte.getVentana()[0]);
        System.out.println(muroNorte.getVentana()[1]);
        
        muroNorte.getPuerta().setMaterial("Aluminio");
        System.out.println(muroNorte);
        
        muroNorte.getVentana()[1].setMaterial("Aluminio");
        System.out.println(muroNorte.getVentana()[1]);
        
        Muro muroSur= new Muro(5.0f, 4.5f, 2.5f, Color.blue, 
                new Puerta("Aluminio", Color.white, false), null);
        
        //creacion de habitacion
        System.out.println("----------------------------------------------------------------------------------------------");
        
        Muro[] tmpMuros= new Muro[4];
        Ventana []  tmpVentana1= new Ventana[1];
        tmpVentana1[0]= new Ventana("metal", Color.white, 1.5f, 1.5f);
        tmpMuros[0]= new Muro(2.5f, 0.1f, 2.5f, Color.white, null, tmpVentana1); //Muro Sur
        tmpMuros[1]= new Muro(2.5f, 0.1f, 2.5f, Color.white, new Puerta("Madera", Color.white, false), null); //Muro Norte
        tmpMuros[2]= new Muro(3.0f, 0.2f, 2.5f, Color.white, null, null); //Muro Este
        tmpMuros[3]= new Muro(3.0f, 0.2f, 2.5f, Color.white, null, null); //Muro Oeste
        habitacion Shadow= new habitacion(2, 1, tmpMuros, new Techo(3.0f, 2.5f, Color.white, "Concreto"), new Piso(3.0f, 2.5f, "Losas", Color.gray));
        
        System.out.println(Shadow);
        System.out.println(Shadow.getMuro()[0]);
        System.out.println(Shadow.getMuro()[1]);
        System.out.println(Shadow.getMuro()[2]);
        System.out.println(Shadow.getMuro()[3]);
    }
    
}
