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
public class AgendaTelefonica {
    Contacto[] c;
    
    public void add(int i){
        Scanner sc=new Scanner(System.in);
                
        System.out.println("ingrese dni");
        int dni=sc.nextInt();
        System.out.println("Ingrese Nombre");
        String Nombre=sc.nextLine();
        System.out.println("ingrese Apellido");
        String Apellido=sc.nextLine();
        System.out.println("ingrese Direccion");
        String direccion=sc.nextLine();
        System.out.println("Ingrese Fecha Nacimiento");
        String FechaNac=sc.nextLine();
        System.out.println("Ingrese Tipo de telefono (1-CASA|2-TRABAJO|3-MOVIL|4-Principal|5-OTRO)");
        int t=sc.nextInt();
        System.out.println("ingrese nro telefono;");
        int nro=sc.nextInt();
        Telefono tel=new Telefono(t,nro);
       c[i]=new Contacto(dni, Nombre, Apellido, direccion, FechaNac, tel);
                
    }
    public void buscarporDni(int Dni){
       for(int i=0; i<c.length;i++){
           if(c[i].getDni()==Dni){
               System.out.println(c[i].toString());
           }
       } 
    }
    
    public void buscarporNombre(String nombre){
        for(int i=0; i<c.length;i++){
           if(c[i].getNombre()==nombre){
               System.out.println(c[i].toString());
           }
       } 
    }
    
    public void buscarporTelefono(int NroTelefono){
        for(int i=0; i<c.length;i++){
           if(c[i].getTel().Nrotelefono==NroTelefono){
               System.out.println(c[i].toString());
           }
       } 
    }
    public void Borrar(String n, int D, int op){
        Scanner Sc=new Scanner(System.in);
        switch(op){
             case 1:
                    for(int i=0; i<c.length;i++){
           if(c[i].getNombre()==n){
               System.out.println(c[i].toString());
           }
       }  
                     
                    break;
                case 2:
                    break;
                case 3:
                    break;
        }
                
             
    }

}
