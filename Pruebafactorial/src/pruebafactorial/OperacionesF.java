/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafactorial;

/**
 *
 * @author AXEL
 */
public class OperacionesF {
    public void factorialLoop(int x){
        int temp =1;
        for (int i=1; i<=x; i++){
            temp = temp * i;
        }
        System.out.println("El factorial "+ x +" es "+ temp);
    }
    
    public int factorialRecursividad(int x){
        if(x==0){
            return 1;
        }else{
            return x*factorialRecursividad(x-1);
        }
    }
}
