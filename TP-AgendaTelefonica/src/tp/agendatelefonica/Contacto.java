
package tp.agendatelefonica;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;


public class Contacto {
    
    private String Nombre;
    private String Apellido;
    private int Dni;
    private String Direccion;
    private String Fechadenacimiento;
    
    public Contacto() {
    
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

    public int getDni() {
        return Dni;
    }

    public void setDni(int Dni) {
        this.Dni = Dni;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFechadenacimiento() {
        return Fechadenacimiento;
    }

    public void setFechadenacimiento(String Fechadenacimiento) {
        this.Fechadenacimiento = Fechadenacimiento;
    }
    
   
    
    
}
