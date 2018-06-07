/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.jabase;

/**
 *
 * @author Busca en contacto
 */
import java.util.Scanner;
public class ProyectoJabase
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    Scanner sc = new Scanner (System.in);
    
        System.out.println("Bienvenido a agenda telefonica, ingrese una opcion para continuar");
        System.out.println("1) Agregar un nuevo contacto");
        System.out.println("2) Actualizar datos de un contacto");
        System.out.println("3) Eliminar un contacto");
        System.out.println("4) Buscar contacto por dni");
        System.out.println("5) Buscar contacto por numero de telefono");
        System.out.println("6) Buscar contacto por nombre");
        System.out.println("7) Listar contactos de A -Z");
        System.out.println("8) Contactos que cumplen los proximos dias");
        
    }
    
}
