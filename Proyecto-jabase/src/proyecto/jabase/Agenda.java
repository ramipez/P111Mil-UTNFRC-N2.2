/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.jabase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author alumno
 */
public class Agenda {
    
        Contacto[] nc=new Contacto[300];
    
    public void Añadir (int i) throws ParseException {
     Scanner sc = new Scanner (System.in);   
     Scanner sc1 = new Scanner (System.in);
        
    System.out.println("Ingrese nombre");
    String Nombre =sc.nextLine();
    System.out.println("Ingrese Apellido");
    String Apellido=sc.nextLine();
    System.out.println("Ingrese Direccion");
    String Direccion= sc.nextLine();
    System.out.println("Ingrese Altura");
    int Altura = sc.nextInt();
    System.out.println("Ingrese Dni");
    int Dni = sc.nextInt();
    
    
    System.out.println("Ingrese fecha de Nacimiento (En formato dd/MM/yyyy)");    
    String fecha = sc1.nextLine();
    Date Nacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
    
    System.out.println("Ingrese Cantidad de Telefonos a Ingresar");
        int ct = sc.nextInt();
    Telefono[] tel = new Telefono[ct];
        for (int into = 0; into < tel.length; into++) {
            System.out.println("Ingrese Tipo de telefono (1-Casa|2-Trabajo|3-Movil|4-Principal|5-Otro)");
            int t = sc.nextInt();
            while(t<0&&t>5){
                System.out.println("Ingrese Valor VAlido");
                t=sc.nextInt();
            }
            System.out.println("ingrese nro telefono;");
            int nro = sc.nextInt();
            tel[into] = new Telefono(t, nro);
        }
    }  
}
    
    public void Actualizardatos (int opc, int c ) {
    System.out.println ("que contacto desea actualizar?");
    System.out.println();
    
}
//    public void    
//}
