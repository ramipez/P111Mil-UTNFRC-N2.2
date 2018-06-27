/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoluciano;

import java.util.Date;

/**
 *
 * @author Luciano
 */
public class Contacto {
    
     int dni;
     String nombre,apellido,direccion;
     Date fecha_nacimiento;
     Telefono[] tel;

    public Contacto(int dni, String nombre, String apellido, String direccion, Date fecha_nacimiento, Telefono[] tel) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.tel=tel;
        
    }
    
    
  
  

    @Override
    public String toString() {
        
        String mostrarContacto ="Contacto{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", fecha_nacimiento=" + fecha_nacimiento;
        
        for(int j=0;j<tel.length;j++){
            
            mostrarContacto +=", tel=" + tel[j] + '}';
            
        }
        
        
        return mostrarContacto;
    }
    
    public Contacto(){
        
        dni=0;
        nombre="";
        apellido="";
        direccion="";
        fecha_nacimiento=null;
        
        
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Telefono[] getTel() {
        return tel;
    }

    public void setTel(Telefono[] tel) {
        this.tel = tel;
    }
    
    
    
    
}
