/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.jabase;

/**
 *
 * @author busca en telefono
 */
import java.util.Date;
public class Contacto
{
    public String Nombre;
    public String Apellido;
    public String Direccion;
    public int Altura;
    public long dni;
    public Date nacimiento;
    
    
    public Contacto (String Nombre, String Apellido, String Direccion, int altura, long dni, Date nacimiento){
        
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.Altura = altura;
        this.dni = dni;
        this.nacimiento = nacimiento;
     
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

    public long getDni()
    {
        return dni;
    }

    public void setDni(long dni)
    {
        this.dni = dni;
    }

    public Date getNacimiento()
    {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento)
    {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString()
    {
        return "Contacto{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + ", Altura=" + Altura + ", dni=" + dni + ", nacimiento=" + nacimiento + '}';
    }

    
    
}

