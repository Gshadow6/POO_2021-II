/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conceptosbasicos;

import ico.fes.Automovil;
import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author AXEL
 */
public class ConceptosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil miBocho= new Automovil();
        miBocho.setMarca("VW");
        miBocho.setSubmarca("Sedan");
        miBocho.setModelo(1970);
        miBocho.setColor(Color.blue);
        System.out.println(miBocho);
        
        //Tarea: Programar los objetos myAcura y myMustang}
        Automovil miMustang= new Automovil();
        miMustang.setMarca("Ford");
        miMustang.setSubmarca("Mustang");
        miMustang.setModelo(2010);
        miMustang.setColor(Color.yellow);
        System.out.println(miMustang);
        
        Automovil miAcura= new Automovil();
        miAcura.setMarca("Acura");
        miAcura.setSubmarca("NSX");
        miAcura.setModelo(2013);
        miAcura.setColor(Color.gray);
        System.out.println(miAcura);
    }
    
}
