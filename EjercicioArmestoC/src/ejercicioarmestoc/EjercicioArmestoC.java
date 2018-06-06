/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarmestoc;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioArmestoC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc=new Scanner(System.in);
        
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
                        System.out.println("Ingrese Dni contacto:");
                        int dni=sc.nextInt();
                        System.out.println("Ingrese Nombre del Contacto:");
                        String Nombre=sc.nextLine();
                        System.out.println("Ingrese Apellido:");
                        String Apellido=sc.nextLine();
                        System.out.println("Ingrese Direccion:");
                        String Dir=sc.nextLine();
                        System.out.println("ingrese ");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
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
