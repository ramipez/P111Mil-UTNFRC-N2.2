/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarmestoc;

/**
 *
 * @author alumno
 */
public class Contacto {
 int Dni;
 String Nombre;
 String Apellido;
 String Direccion;
 String FechaNac;
 

    public Contacto() {
    Dni=0;
    Nombre="";
    Apellido="";
    Direccion="";
    FechaNac="";   
  
    }

    public Contacto(int Dni, String Nombre, String Apellido, String Direccion, String FechaNac) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.FechaNac = FechaNac;
      
    }


    

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(String FechaNac) {
        this.FechaNac = FechaNac;
    }

    @Override
    public String toString() {
        return "Contacto{" + "Dni=" + Dni + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + ", FechaNac=" + FechaNac +  '}';
    }

    
}
