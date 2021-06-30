/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.programacion;

/**
 *
 * @author AXEL
 */
public class ProfesorDeProgramacion extends Profesor implements Programador{
    private int aniosExperiencia;
    private String lenguajeDeProgramacion;

    public ProfesorDeProgramacion() {
    }

    public ProfesorDeProgramacion(int aniosExperiencia, String lenguajeDeProgramacion) {
        this.aniosExperiencia = aniosExperiencia;
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public ProfesorDeProgramacion(int aniosExperiencia, String lenguajeDeProgramacion, String carrera, int antiguedad) {
        super(carrera, antiguedad);
        this.aniosExperiencia = aniosExperiencia;
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public ProfesorDeProgramacion(int aniosExperiencia, String lenguajeDeProgramacion, String carrera, int antiguedad, String nombre, int edad) {
        super(carrera, antiguedad, nombre, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    
    public String getLenguajeDeProgramacion() {
        return lenguajeDeProgramacion;
    }

    public void setLenguajeDeProgramacion(String lenguajeDeProgramacion) {
        this.lenguajeDeProgramacion = lenguajeDeProgramacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public String toString() {
        return super.toString() + " ProfesorDeProgramacion{" + "aniosExperiencia=" + aniosExperiencia + ", lenguajeDeProgramacion=" + lenguajeDeProgramacion + '}';
    }

    @Override
    public int programar() {
        System.out.println("Programando en " + this.lenguajeDeProgramacion);
        return 2;
    }

    @Override
    public void probarCodigo() {
        System.out.println("Probando programas en " + this.lenguajeDeProgramacion);
    }
    
    
}
