
package tp.agendatelefonica;

public class Contacto {
    
    private String Nombre;
    private String Apellido;
    private int Dni;
    private String Direccion;
    private String Fechadenacimiento;
    private Telefono[] telefono;

        
    public Contacto() {
    
    }
    
    
    public Contacto(String nombre, String apellido, int dni,String direccion, String fechaNacimiento){
    
            this.Nombre = nombre;
            this.Apellido = apellido;
            this.Dni = dni;
            this.Direccion = direccion;
            this.Fechadenacimiento = fechaNacimiento;
            
            telefono = new Telefono[5];
            
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
    
    public Telefono[] getTelefonos() {
        return telefono;
    }
    
   @Override
    public String toString() {
        return "Contacto{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Dni=" + Dni + ", Direccion=" + Direccion + ", Fechadenacimiento=" + Fechadenacimiento + '}';
    }
    
    
}
