/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.jabase;

/**
 *
 * @author Busca en contacto3
 */
import java.util.Scanner;
import java.text.ParseException;
public class ProyectoJabase
{

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException
    {
    Scanner sc = new Scanner (System.in);
    int opcion;
        Agenda contac= new Agenda();
        //nc =numero de contacto en lista
        int nc=0;
                
        System.out.println("Bienvenido a agenda telefonica, ingrese una opcion para continuar");
        System.out.println("1) Agregar un nuevo contacto");
        System.out.println("2) Actualizar datos de un contacto");
        System.out.println("3) Eliminar un contacto");
        System.out.println("4) Buscar contacto por dni");
        System.out.println("5) Buscar contacto por numero de telefono");
        System.out.println("6) Buscar contacto por nombre");
        System.out.println("7) Listar contactos de A -Z");
        System.out.println("8) Contactos que cumplen los proximos dias");
        opcion = sc.nextInt();
        
        while(opcion>=1 && opcion<=8){
        switch (opcion)
        {
            case 1:
                contac.Añadir(nc);
                        nc++;
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
                
        }         
        System.out.println("Ingrese Opcion: ");
            opcion=sc.nextInt();
        }   
    }
    
}
