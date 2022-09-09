/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacalculadora;

import java.util.Scanner;

/**
 *
 * @author AXEL
 */
public class PruebaCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op1=0;
        int op2=0;
        
        Scanner op= new Scanner(System.in);
        System.out.println("Selecciona 1 para sumar, 2 para multiplicar, 3 para restar y 4 para dividir");
        int opciondada = op.nextInt();
        switch(opciondada){
            case 1:
                System.out.println("Introduzca el valor del primer numero");
                op1=op.nextInt();
                System.out.println("Introduzca el valor del segundo numero");
                op2=op.nextInt();
                Calculadora Cs = new Calculadora();
                System.out.println("El resultado es: "+ Cs.suma(op1,op2));
            break;
            case 2:
                System.out.println("Introduzca el valor del primer numero");
                op1=op.nextInt();
                System.out.println("Introduzca el valor del segundo numero");
                op2=op.nextInt();
                Calculadora Cm= new Calculadora();
                System.out.println("El resultado es: "+Cm.multiplicar(op1,op2));
            break;
            case 3:
                System.out.println("Introduzca el valor del primer numero");
                op1=op.nextInt();
                System.out.println("Introduzca el valor del segundo numero");
                op2=op.nextInt();
                Calculadora Cr= new Calculadora();
                System.out.println("El resultado es: ");
                Cr.restar(op1,op2);
                
            break;
            case 4:
                System.out.println("Introduzca el valor del primer numero");
                op1=op.nextInt();
                System.out.println("Introduzca el valor del segundo numero");
                op2=op.nextInt();
                Calculadora Cd= new Calculadora();
                System.out.println("El resultado es: ");
                Cd.dividir(op1,op2);
            break;
        }
    }
    
}
