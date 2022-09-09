/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebadiasmes;

import java.util.Scanner;



/**
 *
 * @author AXEL
 */
public class PruebaDiasMes {
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mesn = 0; 
        
        System.out.println("Dame un mes del que quieras saber sus dia :3");
        String mes = sc.next();                
        mes = mes.toLowerCase();
        if(mes.equals("enero")){
            mesn=1;
        }
        if(mes.equals("febrero")){
            mesn=2;
        }
        if(mes.equals("marzo")){
            mesn=3;
        }
        if(mes.equals("abril")){
            mesn=4;
        }
        if(mes.equals("mayo")){
            mesn=5;
        }
        if(mes.equals("junio")){
            mesn=6;
        }
        if(mes.equals("julio")){
            mesn=7;
        }
        if(mes.equals("agosto")){
            mesn=8;
        }
        if(mes.equals("septiembre")){
            mesn=9;
        }
        if(mes.equals("octubre")){
            mesn=10;
        }
        if(mes.equals("noviembre")){
            mesn=11;
        }
        if(mes.equals("diciembre")){
            mesn=12;
        }
        
        ProbarMes m = new ProbarMes();
        m.mes(mesn);
    }
    
}
