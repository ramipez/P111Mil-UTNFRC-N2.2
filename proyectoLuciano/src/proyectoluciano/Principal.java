/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoluciano;

/**
 * proyectoLuciano
 *
 * @author Luciano
 */
import java.text.ParseException;
import java.util.*;
import javax.swing.JOptionPane;

public class Principal
{

    public static void main(String[] args) throws ParseException
    {

        Scanner entrada = new Scanner(System.in);
        Scanner entradaL = new Scanner(System.in);

        Admin contacto = new Admin();
        int cont = 0;

        System.out.println("******* MENU DE OPCIONES *******");
        System.out.println("1- Agregar un nuevo contacto");
        System.out.println("2- Actualizar los datos de un contacto");
        System.out.println("3- Eliminar un contacto cargado por equivocación");
        System.out.println("4- Buscar un contacto por dni");
        System.out.println("5- Buscar un contacto por número de teléfono");
        System.out.println("6- Buscar un contacto por nombre");
        System.out.println("7- Listar todos los contactos ordenados alfabéticamente");
        System.out.println("8- Listar los contactos con fecha de nacimiento próximos a la fecha del día. Se deberá\n"
                + "mostrar el nombre, el teléfono y la cantidad de días, de los contactos cuya fecha de\n"
                + "nacimiento se encuentra a no más 7 días de su cumpleaños respecto de la fecha actual.");

        System.out.println("Insgrese la opcion");
        int op = entrada.nextInt();
        while (op >= 1 && op <= 8)
        {

            switch (op)
            {

                case 1:

                    contacto.agregar(cont);
                    cont++;
                    break;

                case 2:

                    contacto.actualizar();

                    break;
                case 3:

                    contacto.borrar();

                    break;
                case 4:
                    System.out.println("Ingrese el dni a buscar");
                    int dni = entrada.nextInt();
                    contacto.buscarPorDni(dni);

                    break;
                case 5:

                    System.out.println("Ingrese el tipo: ");
                    int tipo = entrada.nextInt();
                    System.out.println("Ingre el numero de telefono a buscar: ");
                    int nro = entrada.nextInt();

                    contacto.buscarPorNroTelefono(tipo, nro);

                    break;
                case 6:

                    System.out.println("Buscar por nombre: ");
                    String nombre = entradaL.nextLine();
                    contacto.buscarPorNombre(nombre);

                    break;
                case 7:

                    contacto.OrdenarEImprimir();

                    break;
                case 8:
                    break;
                default:

                    System.out.println("No se modifico nada");
                    break;

            }

            System.out.println("Ingrese una opcion : ");
            op = entrada.nextInt();

        }

    }

}
