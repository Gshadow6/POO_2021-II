/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.heredado;

import ico.fes.herencia.Persona;

/**
 *
 * @author AXEL
 */
public class Alumno extends Persona{
    private String numerocuenta;
    private String carrera;
    private int semestre;

    public Alumno() {
    }

    public Alumno(String numerocuenta, String carrera, int semestre) {
        this.numerocuenta = numerocuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }

    public Alumno(String numerocuenta, String carrera, int semestre, String nombre, int edad, char genero, float altura) {
        super(nombre, edad, genero, altura);
        this.numerocuenta = numerocuenta;
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    

    public String getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(String numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return super.toString()+ "Alumno{" + "numerocuenta=" + numerocuenta + ", carrera=" + carrera + ", semestre=" + semestre + '}';
    }
    
    
}
