
package mx.unam.aragon.fes.persistencia;

import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;

public class ArchivoEmpleado {
    private String archivo;

    public ArchivoEmpleado() {
    }

    public ArchivoEmpleado(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }
        
    public void guardarEmpleados(ArrayList<Empleado> datos){
    //aqui el codig para grabar el disco duro 
    }
    
    public ArrayList<Empleado> leerEmpleado(){
        ArrayList<Empleado> tmp = null;
    
    //Leer el disco duro
    //Se sube al ArrayList tmp
    
        return tmp;
    }
    
}
