/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.jabase;

/**
 *
 * @author busca en telefono1
 */
import java.util.Date;
public class Contacto
{
    public String Nombre;
    public String Apellido;
    public String Direccion;
    public int Altura;
    public long Dni;
    public Date Nacimiento;
    
    
    public Contacto (String Nombre, String Apellido, String Direccion, int altura, long Dni, Date Nacimiento){
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Altura = altura;
        this.Dni = Dni;
        this.Nacimiento = Nacimiento;
     
    }
    
    public Contacto(){
        Nombre="";
        Apellido="";
        Direccion ="";
        Altura = 0;
        Dni= 0;
    }
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getApellido (){
        return Apellido;
    }
    
    public void setApellido (String Apellido){
        this.Apellido = Apellido;
    }

    public String getDireccion()
    {
        return Direccion;
    }

    public void setDireccion(String Direccion)
    {
        this.Direccion = Direccion;
    }

    public int getAltura()
    {
        return Altura;
    }

    public void setAltura(int Altura)
    {
        this.Altura = Altura;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

  

    @Override
    public String toString()
    {
        return "Contacto{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + ", Altura=" + Altura + ", dni=" + Dni + ", nacimiento=" + Nacimiento + '}';
    }

    
    
}

