/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacalculadora;

/**
 *
 * @author AXEL
 */
public class Calculadora {
    public int suma(int a, int b){
        return a+b;
    }
    
    public int multiplicar(int a, int b){
        return a*b;
    }
    
    public void restar(int a, int b){
        System.out.println(a-b);
    }
    
    public void dividir(int a, int b){
        System.out.println(a/b);
    }
}
