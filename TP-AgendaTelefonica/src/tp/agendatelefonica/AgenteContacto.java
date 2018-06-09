package tp.agendatelefonica;

public class AgenteContacto {

    private static Contacto[] ArrayContactos = new Contacto[1000];

    private static int contador = 0;

    public static void agregarContacto(Contacto contacto) {

        ArrayContactos[contador] = contacto;
        contador++;
    }
    
    public static void agregarTelefono(Contacto contacto, Telefono telefono) {

        contacto.getTelefonos()[0] = telefono;
        
    }
    
    
    public void actualizarContacto(){
    
    }

    static void eliminarContacto(){
    
        
    
    }
    
    
    
    
    
    
    
    
    
}
