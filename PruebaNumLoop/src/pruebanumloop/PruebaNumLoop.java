/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebanumloop;

import java.util.Scanner;

/**
 *
 * @author AXEL
 */
public class PruebaNumLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num= op.nextInt();
        CrearLista cl= new CrearLista();
        cl.imprimirNumero(num);
    }
}
