/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Computadora;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author AXEL
 */
public class FuncionComputadora {
    
    public static void main(String[] args) {
        Computadora comp1= new Computadora("hp", "All in one 200 22", 
                           new Monitor("hp", "FHD", 21.5), 
                           new Mouse("hp", "KM300F", "gamer"), 
                           new Teclado("hp", "KM300F", 105, 12), 
                           new CPU("Intel core", "i3 de 10° generacion", "2.1GHz a 4.1GHz"));
        
        Computadora comp2= new Computadora("Xtreme", "Gaming CM-50130", 
                           new Monitor("Xtreme", "Gamer Full HD", 21.5) , 
                           new Mouse("Xtreme", "Ergonómico led con 6 botoneso", "Gamer"), 
                           new Teclado("Xtreme", "LED RGB", 105, 12), 
                           new CPU("AMD Ryzen", "3 PRO 2200", " 3.5GHz a 3.7GHz"));
        System.out.println("computadora 1 ="+comp1);
        System.out.println("computadora 2 ="+comp2);
    }
}
