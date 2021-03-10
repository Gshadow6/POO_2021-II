
package mx.unam.aragon.fes.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        try {
            ObjectOutputStream fSalida = new ObjectOutputStream(
                    new FileOutputStream(archivo));

            fSalida.writeObject(datos);
            fSalida.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Empleado> leerEmpleado(){
        ArrayList<Empleado> tmp = null;
        try {
            ObjectInputStream fLectura = new ObjectInputStream(
                    new FileInputStream(archivo));

            tmp = (ArrayList<Empleado>) fLectura.readObject();
            if (tmp == null) {
                System.out.println("No hay nada");
            } else {
                System.out.println("Nombre" + tmp.size());
            }
            fLectura.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.toString());
        }
    //Leer el disco duro
    //Se sube al ArrayList tmp
    
        return tmp;
    }
    
}
