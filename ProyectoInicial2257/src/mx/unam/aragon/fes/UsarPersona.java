/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

/**
 *
 * @author unam
 */
public class UsarPersona {
    public static void main(String[] args) {
        System.out.println("Programa usar persona");
        
        int edad = 0;
        // edad = 1;
        
        Persona per1=new Persona(); // llamada al constructor
        Persona per2=new Persona();
        
        System.out.println( per1.getNombre() );
        
        per2.setNombre("Jesús");
        System.out.println( per2.getNombre() );
        
        System.out.println( per2.toString() );
        per2.setEdad(  18  );
        System.out.println( per2.toString() );
        
    }
}
