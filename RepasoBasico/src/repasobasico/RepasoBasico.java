/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasobasico;

import ico.fes.dispositivos.SmartPhone;
import ico.fes.inegi.encuestadorInegi;
import java.awt.BorderLayout;
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
        SmartPhone cel3= new SmartPhone("Apple", "IPhone 8 plus");
        SmartPhone cel4= new SmartPhone();
        System.out.println(cel1);
        System.out.println(cel2);
        System.out.println(cel3);
        System.out.println(cel4);
        
        //Uso de metodo de acceso
        cel1.setModelo("Galaxy Note 7");
        System.out.println(cel1);
        
        System.out.println("Marca del cel:"+ cel1.getMarca());
        
        encuestadorInegi enc1= new encuestadorInegi();
        enc1.setDispositivo(cel2);
    }
    

}
