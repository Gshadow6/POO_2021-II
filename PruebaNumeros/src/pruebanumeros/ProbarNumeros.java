/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebanumeros;

/**
 *
 * @author AXEL
 */
public class ProbarNumeros {
    boolean resp;
    int x;
    
    public static boolean Numeropar(int x){
       if((x % 2) == 0){
           return true;
       } 
       else{
           return false;
       }
    }

    public ProbarNumeros() {
    }
    
    public ProbarNumeros(int x) {
        this.x = x;
    }
    
    
}
