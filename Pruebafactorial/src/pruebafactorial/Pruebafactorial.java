/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafactorial;

import java.util.Scanner;

/**
 *
 * @author AXEL
 */
public class Pruebafactorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionesF of = new OperacionesF();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero");
        int numeroDado = sc.nextInt();
        System.out.println("Factorial con loop");
        of.factorialLoop(numeroDado);
        System.out.println("Factorial con recursividad");
        int x=of.factorialRecursividad(numeroDado);
        System.out.println("El factorial "+ numeroDado +" es "+ x);
    }
    
}
