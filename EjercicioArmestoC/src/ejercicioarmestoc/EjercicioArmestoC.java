/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarmestoc;

import java.text.ParseException;
import java.util.*;
        
/**
 *
 * @author alumno
 */
public class EjercicioArmestoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        Scanner Sc=new Scanner(System.in);
        AgendaTelefonica t=new AgendaTelefonica();
        int c=0;
        System.out.println("Ingresando Al Menu de opciones");
        System.out.println("1- Agregar un contacto:");
        System.out.println("2- Actualizar los Datos de un Contacto");
        System.out.println("3- Eliminar un Contacto Grabado por Equivocacion");
        System.out.println("4- Buscar Contacto por Dni:");
        System.out.println("5- Buscar un contacto por número de teléfono");
        System.out.println("6- Buscar un contacto por nombre");
        System.out.println("7- Listar todos los contactos ordenados alfabéticamente");
        System.out.println("8- Listar los contactos con fecha de nacimiento próximos a la fecha del día. Se deberá\n" +
                            "mostrar el nombre, el teléfono y la cantidad de días, de los contactos cuya fecha de\n" +
                            "nacimiento se encuentra a no más 7 días de su cumpleaños respecto de la fecha actual");
        System.out.println("Ingrese Opcion:");
        int op=sc.nextInt();
        while(op>=1 && op<=8){
        switch(op){
                case 1: 
                       
                        t.add(c);
                        c++;
                    break;
                case 2:
                    System.out.println("Ingrese metodo de busqueda de Contacto para Actualizar: 1-Nombre, 2-Dni, 3-Numero Telefono");
                    int opci=sc.nextInt();
                    t.actualizar(opci);
                    break;
                case 3: 
                    System.out.println(" Elija metodo de busqueda para brorrado: 1- nombre, 2-Dni, 3-Numero Telefono:");
                        int opc=sc.nextInt();
                        t.Borrar(opc);
                    break;
                case 4:
                    System.out.println("Ingrese Dni");
                    int DNI=sc.nextInt();
                    t.buscarporDni(DNI);
                    break;
                case 5:
                    System.out.println("Ingrese Numero de Telefono");
                    int tel=sc.nextInt();
                    t.buscarporTelefono(tel);
                    break;
                case 6:
                    System.out.println("Ingrese Nombre");
                    String nom=Sc.nextLine();
                    t.buscarporNombre(nom);
                    break;
                case 7: 
                    System.out.println("Listando Contactos");
                    t.OrdenareImprimir();
                    break;
                case 8:
                    
                    break;
                default:
                    break;
          
        }
            System.out.println("Ingrese Opcion: ");
            op=sc.nextInt();
        }

    }
    
}
