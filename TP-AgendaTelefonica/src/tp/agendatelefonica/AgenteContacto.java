package tp.agendatelefonica;

import java.util.Scanner;

public class AgenteContacto {

    
    private Contacto[] sontactos = new Contacto[100];
    
    
    public void crearContacto() {

        Scanner sc = new Scanner(System.in);

        Contacto C = new Contacto();

        System.out.println("Por favor ingrese el nombre: ");
        String Nombre = sc.nextLine();
        C.setNombre(Nombre);
        System.out.println("Por favor ingrese el apellido: ");
        String Apellido = sc.nextLine();
        C.setApellido(Apellido);

        System.out.println("Por favor ingrese el documento: ");
        String Dni = sc.nextLine();
        System.out.println("Por favor ingrese la direccion: ");
        String Direccion = sc.nextLine();
        System.out.println("Por favor ingrese la fecha de nacimiento: ");
        String Fechadenacimiento = sc.nextLine();

        
        contactos[0]=C;
        

    }

}
