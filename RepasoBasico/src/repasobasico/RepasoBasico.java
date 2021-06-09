/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.fes.dispositivos.SmartPhone;
/**
 *
 * @author AXEL
 */
public class RepasoBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartPhone cel1= new SmartPhone("Samsung");
        SmartPhone cel2= new SmartPhone("Huawei", "P40", "Gris", 5.5f);
        System.out.println(cel1);
        System.out.println(cel2);
    }
    
}
