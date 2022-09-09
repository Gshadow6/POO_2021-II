/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaimpr;

/**
 *
 * @author AXEL
 */
public class PruebaImpr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = new int[10];
        Or or= new Or();
        
        Or.imprimir(num);
        System.out.println("Imprimir numeros");
        Or.imprimirDesc(num);
        System.out.println("Imprimir numeros descendente");
        Or.imprimirToken(num);
        System.out.println(" Imprimir numeros con token");
        Or.imprimirRandom(num);
        System.out.println("Imprimir numeros randoms");
        
    }
    
}
