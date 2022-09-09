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
public class Or {
    public static void imprimir(int[] x){
        for (int i=0; i<x.length; i++){
            System.out.print((x[i]=i+1)+" ");
        }
    }
    
    public static void imprimirDesc(int[] x){
        for (int i=0; i<x.length; i++){
            System.out.print((x[i]=10-i)+" ");
        }
    }
    
    public static void imprimirToken(int[] x){
        for (int i=0; i<x.length; i++){
            if(i<9){
                System.out.print((x[i]=i+1)+"-");
            }else{
                System.out.print(x[i]=i+1);
            }
        }
    }
    
    public static void imprimirRandom(int[] x){
        for (int i=0; i<x.length; i++){
            int a =(int) (Math.random() * 100 + 1);
            System.out.print((x[i]=a)+" ");
        }
    }
    
}
