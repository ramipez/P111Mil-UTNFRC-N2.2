package tp.agendatelefonica;

import java.util.Scanner;

public class AgenteContacto {

    Contacto[] ArrayContactos = new Contacto[1000];

    int contador = 0;

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
        int Dni = sc.nextInt();
        C.setDni(Dni);
        
        System.out.println("Por favor ingrese la direccion: ");
        String Direccion = sc.nextLine();
        C.setDireccion(Direccion);
        
        System.out.println("Por favor ingrese la fecha de nacimiento: ");
        String Fechadenacimiento = sc.nextLine();
        C.setFechadenacimiento(Fechadenacimiento);

        ArrayContactos[contador] = C;

        contador++;

    }

}
