/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.objetos;

import java.awt.Color;

/**
 *
 * @author AXEL
 */
public class PuertaDeSeguridad extends Puerta{
    private String mecanismo;
    private String contrasenia;

    public PuertaDeSeguridad() {
    }

    public PuertaDeSeguridad(String mecanismo, String contrasenia) {
        this.mecanismo = mecanismo;
        this.contrasenia = contrasenia;
    }

    public PuertaDeSeguridad(String mecanismo, String contrasenia, String material, Color color, boolean conVidrio) {
        super(material, color, conVidrio);
        this.mecanismo = mecanismo;
        this.contrasenia = contrasenia;
    }

    public String getMecanismo() {
        return mecanismo;
    }

    public void setMecanismo(String mecanismo) {
        this.mecanismo = mecanismo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return super.toString() + "PuertaDeSeguridad{" + "mecanismo=" + mecanismo + ", contrasenia=" + contrasenia + '}';
    }

    public boolean verificar(){
        System.out.println("Verificando...");
        return this.contrasenia != null;
    }

    @Override
    public void abrir() {
        if (this.getContrasenia()== "1234dios"){
            super.abrir();
            System.out.println("Contraseña correcta ....");
        }else{
            System.out.println("Contraseña invalida... revise sus datos");
            super.abrir(); //To change body of generated methods, choose Tools | Templates.
            }
    }

   
    @Override
    public void cerrar() {
        super.cerrar();
    }
    
    
}
