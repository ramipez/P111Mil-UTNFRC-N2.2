package agendacompartida.dominio;

import java.util.Date;

public class Contacto {
  
 private int Dni;
 String Nombre;
 String Apellido;
 String Direccion;
 Date FechaNac;
 Telefono[] tel;
 

    public Contacto() {
    Dni=0;
    Nombre="";
    Apellido="";
    Direccion="";   
    tel=null;
    }

    public Contacto(int Dni, String Nombre, String Apellido, String Direccion, Date FechaNac, Telefono[] tel) {
        this.Dni = Dni;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Direccion = Direccion;
        this.FechaNac = FechaNac;
        this.tel=tel;
    }
    
    public Telefono[] getTel() {
          return tel;
    }

    public void setTel(Telefono[] tel) {
        this.tel = tel;
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

    public Date getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }


    @Override
    public String toString() {
     String str = "Contacto{" + "Dni=" + Dni + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Direccion=" + Direccion + ", FechaNac=" + FechaNac + ", tel=[";
        for(int i=0;i<tel.length;i++){
            str += tel[i];
        }
        return str+ " ] }";
    }
    
}


