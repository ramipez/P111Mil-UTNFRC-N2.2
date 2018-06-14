package tp.agendatelefonica;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class ContactoMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner tel1 = new Scanner(System.in);

        boolean bandera = false;
        int nuevo;

        do {

            System.out.println("Por favor ingrese el nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Por favor ingrese el apellido: ");
            String apellido = sc.nextLine();

            System.out.println("Por favor ingrese el documento: ");
            int dni = sc.nextInt();

            System.out.println("Por favor ingrese la direccion: ");
            String direccion = sc.nextLine();

            System.out.println("Por favor ingrese la fecha de nacimiento: ");
            String fechaNacimiento = sc.nextLine();

            Contacto C = new Contacto(nombre, apellido, dni, direccion, fechaNacimiento);

            AgenteContacto.agregarContacto(C);

            System.out.println("Por favor ingrese el tipo de telefono (CASA - TRABAJO - MOVIL - PRINCIPAL - OTRO): ");
            String tipoTelefono = sc.nextLine();

            System.out.println("Por favor ingrese el numero de telefono: ");
            int telefono = sc.nextInt();
            
            Telefono t = new Telefono(tipoTelefono, telefono);

            AgenteContacto.agregarTelefono(C,t);
            
            System.out.println("¿Desea ingresar un nuevo contacto? Ingrese  1_Para continuar 2_Para finalizar");
            nuevo = sc.nextInt();

            switch (nuevo) {
                case 1:
                    bandera = false;
                    break;

                case 2:
                    bandera = true;
                    break;
                    
            }
        } while (bandera == false);

    }
}
