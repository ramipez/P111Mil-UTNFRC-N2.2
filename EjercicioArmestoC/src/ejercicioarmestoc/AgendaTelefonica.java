/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarmestoc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


/**
 *
 * @author alumno
 */
public class AgendaTelefonica {

    Contacto[] c=new Contacto[99];

    public void add(int i) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Scanner Sc=new Scanner (System.in);
        Scanner SC=new Scanner (System.in);
        System.out.println("ingrese dni");
        int dni = sc.nextInt();
        System.out.println("Ingrese Nombre");
        String Nombre = Sc.nextLine();
        System.out.println("ingrese Apellido");
        String Apellido = Sc.nextLine();
        System.out.println("ingrese Direccion");
        String direccion = Sc.nextLine();
        System.out.println("Ingrese Fecha Nacimiento, ingresar de forma DD/MM/YYYY");
        Date FechaNac = new SimpleDateFormat("dd/mm/yyyy").parse(SC.nextLine());
        System.out.println("Ingrese Cantidad de Telefonos a Ingresar");
        int ct = sc.nextInt();
        Telefono[] tel = new Telefono[ct];
        for (int into = 0; into < tel.length; into++) {
            System.out.println("Ingrese Tipo de telefono (1-CASA|2-TRABAJO|3-MOVIL|4-Principal|5-OTRO)");
            int t = sc.nextInt();
            System.out.println("ingrese nro telefono;");
            int nro = sc.nextInt();
            tel[into] = new Telefono(t, nro);
        }

        c[i] = new Contacto(dni, Nombre, Apellido, direccion, FechaNac, tel);

        System.out.println("Contacto creado: " + c[i].toString());

    }

    public void buscarporDni(int Dni) {
        for (int i = 0; i < c.length; i++) {
          if(c[i]!=null){
            if (c[i].getDni() == Dni) {
                System.out.println(c[i].toString());

            }
            
                else{
                    System.out.println("DAto no encontrado");
                }
        }}
    }

    public void buscarporNombre(String nombre) {
        for (int i = 0; i < c.length; i++) {
            if(c[i]!=null){
            if (c[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(c[i].toString());
            }
            
                else{
                    System.out.println("DAto no encontrado");
                }}
        }
    }

    public void buscarporTelefono(int NroTelefono) {
        for (int i = 0; i < c.length; i++) {
            if(c[i]!=null){
            for (int j = 0; j < c[i].getTel().length; j++) {
                if (c[i].getTel()[j].Nrotelefono == NroTelefono) {
                    System.out.println(c[i].toString());
                }
                else{
                    System.out.println("DAto no encontrado");
                }
            }
        }}
    }

    public void Borrar(int op) {
        Scanner Sc = new Scanner(System.in);

        switch (op) {
            case 1:
                System.out.println("Ingrese Nombre");
                String n = Sc.nextLine();

                for (int i = 0; i < c.length; i++) {
                    if(c[i]!=null){
                    if (c[i].getNombre().equalsIgnoreCase(n)) {
                        System.out.println(c[i].toString());
                        System.out.println("Desea Borrar Contacto:  1-Si, 2-No");
                        int a = Sc.nextInt();
                        if (a == 1) {
                            c[i] = null;
                        }

                    }

                    break;
                }}

                break;
            case 2:
                System.out.println("Ingrese Dni");
                int d = Sc.nextInt();
                for (int i = 0; i < c.length; i++) {
                 if(c[i]!=null){
                    if (c[i].getDni() == d) {
                        System.out.println(c[i].toString());
                        System.out.println("Desea Borrar Contacto:  1-Si, 2-No");
                        int a = Sc.nextInt();
                        if (a == 1) {
                            c[i] = null;
                        }
                    }
                 }
                    //c[i]
                }

                break;
            case 3:
                System.out.println("Ingrese Numero Telefono:");
                int nro = Sc.nextInt();
                for (int i = 0; i < c.length; i++) {
                  if(c[i]!=null){
                    for (int j = 0; j < c[i].getTel().length; j++) {
                        if (c[i].getTel()[j].Nrotelefono == nro) {
                            System.out.println(c[i].toString());
                            System.out.println("Desea Borrar Contacto:  1-Si, 2-No");
                            int a = Sc.nextInt();
                            if (a == 1) {
                                c[i] = null;
                            }
                        }
                    }}
                    //c[i]
                }
                break;
            default:
                System.out.println("No realiza operacion");
                break;

        }

    }

    public void actualizar(int op) throws ParseException {
        Scanner sc = new Scanner(System.in);
        switch (op) {
            case 1:
                System.out.println("Ingrese Nombre");
                String n = sc.nextLine();

                for (int i = 0; i < c.length; i++) {
                    if(c[i]!=null){
                    if (c[i].getNombre().equalsIgnoreCase(n)) {
                        System.out.println(c[i].toString());
                        System.out.println("Que Dato Desea Actualizar:  1-dni, 2-Nombre, 3-Apellido, 4-Direccion, 5-FechaNacimiento, 6-Numero Telefono");
                        int a = sc.nextInt();
                        switch (a) {
                            case 1:
                                System.out.println("Ingrese Nuevo Dni");
                                int dn = sc.nextInt();
                                c[i].setDni(dn);
                                break;
                            case 2:
                                System.out.println("Ingrese Nuevo Nombre");
                                String nomb = sc.nextLine();
                                c[i].setNombre(nomb);
                                break;
                            case 3:
                                System.out.println("Ingrese Nuevo Apellido");
                                String ape = sc.nextLine();
                                c[i].setApellido(ape);
                                break;
                            case 4:
                                System.out.println("Ingrese Nueva Direcion");
                                String dir = sc.nextLine();
                                c[i].setDireccion(dir);
                                break;
                            case 5:
                                System.out.println("Ingrese nueva Fecha de Nacimiento");
                                Date na = new SimpleDateFormat("dd/mm/yyyy").parse(sc.nextLine());
                                c[i].setFechaNac(na);
                                break;
                            case 6:
                                System.out.println("Desea Actualizar un telefono o agregar uno nuevo: (1-nuevo, 2-Actualizar)");
                                int k = sc.nextInt();
                                if (k == 1) {
                                    int asd = c[i].getTel().length;
                                    System.out.println("Ingrese Tipo de telefono (1-CASA|2-TRABAJO|3-MOVIL|4-Principal|5-OTRO)");
                                    int t = sc.nextInt();
                                    System.out.println("ingrese nro telefono;");
                                    int nro = sc.nextInt();
                                    Telefono te = new Telefono(t, nro);
                                    c[i].tel[asd] = te;
                                } else if (k == 2) {
                                    System.out.println("Ingrese Numero a Actualizar");
                                    int nroc = sc.nextInt();
                                    for (int j = 0; j < c[i].getTel().length; j++) {
                                        if (c[i].getTel()[j].Nrotelefono == nroc) {
                                            System.out.println("Ingrese Tipo de telefono (1-CASA|2-TRABAJO|3-MOVIL|4-Principal|5-OTRO)");
                                            int t = sc.nextInt();
                                            System.out.println("ingrese nro telefono;");
                                            int nro = sc.nextInt();
                                            Telefono telefon = new Telefono(t, nro);
                                            c[i].tel[j] = telefon;

                                        }
                                    }
                                } else {
                                    System.out.println("Opcion no valida");
                                }

                        }

                    }}

                    break;
                }

                break;
            case 2:
                System.out.println("Ingrese Dni");
                int d = sc.nextInt();
                for (int i = 0; i < c.length; i++) {
                    if(c[i]!=null){
                    if (c[i].getDni() == d) {
                        System.out.println(c[i].toString());
                        System.out.println("Que Dato Desea Actualizar:  1-dni, 2-Nombre, 3-Apellido, 4-Direccion, 5-FechaNacimiento, 6-Numero Telefono");
                        int a = sc.nextInt();
                        switch (a) {
                            case 1:
                                System.out.println("Ingrese Nuevo Dni");
                                int dn = sc.nextInt();
                                c[i].setDni(dn);
                                break;
                            case 2:
                                System.out.println("Ingrese Nuevo Nombre");
                                String nomb = sc.nextLine();
                                c[i].setNombre(nomb);
                                break;
                            case 3:
                                System.out.println("Ingrese Nuevo Apellido");
                                String ape = sc.nextLine();
                                c[i].setApellido(ape);
                                break;
                            case 4:
                                System.out.println("Ingrese Nueva Direcion");
                                String dir = sc.nextLine();
                                c[i].setDireccion(dir);
                                break;
                            case 5:
                                System.out.println("Ingrese nueva Fecha de Nacimiento");
                                Date na = new SimpleDateFormat("dd/mm/yyyy").parse(sc.nextLine());
                                c[i].setFechaNac(na);
                                break;
                            case 6:
                                System.out.println("Desea Actualizar un telefono o agregar uno nuevo: (1-nuevo, 2-Actualizar)");
                                int k = sc.nextInt();
                                if (k == 1) {
                                    int asd = c[i].getTel().length;
                                    System.out.println("Ingrese Tipo de telefono (1-CASA|2-TRABAJO|3-MOVIL|4-Principal|5-OTRO)");
                                    int t = sc.nextInt();
                                    System.out.println("ingrese nro telefono;");
                                    int nro = sc.nextInt();
                                    Telefono te = new Telefono(t, nro);
                                    c[i].tel[asd] = te;
                                } else if (k == 2) {
                                    System.out.println("Ingrese Numero a Actualizar");
                                    int nroc = sc.nextInt();
                                    for (int j = 0; j < c[i].getTel().length; j++) {
                                        if (c[i].getTel()[j].Nrotelefono == nroc) {
                                            System.out.println("Ingrese Tipo de telefono (1-CASA|2-TRABAJO|3-MOVIL|4-Principal|5-OTRO)");
                                            int t = sc.nextInt();
                                            System.out.println("ingrese nro telefono;");
                                            int nro = sc.nextInt();
                                            Telefono telefon = new Telefono(t, nro);
                                            c[i].tel[j] = telefon;

                                        }
                                    }
                                } else {
                                    System.out.println("Opcion no valida");
                                }

                        }

                    }
                    }
                    //c[i]
                }

                break;
            case 3:
                System.out.println("Ingrese Numero Telefono:");
                int nro = sc.nextInt();
                for (int i = 0; i < c.length; i++) {
                    if(c[i]!=null){
                    for (int j = 0; j < c[i].getTel().length; j++) {
                        if (c[i].getTel()[j].Nrotelefono == nro) {
                            System.out.println(c[i].toString());
                            System.out.println("Que Dato Desea Actualizar:  1-dni, 2-Nombre, 3-Apellido, 4-Direccion, 5-FechaNacimiento, 6-Numero Telefono");
                            int a = sc.nextInt();
                            switch (a) {
                                case 1:
                                    System.out.println("Ingrese Nuevo Dni");
                                    int dn = sc.nextInt();
                                    c[i].setDni(dn);
                                    break;
                                case 2:
                                    System.out.println("Ingrese Nuevo Nombre");
                                    String nomb = sc.nextLine();
                                    c[i].setNombre(nomb);
                                    break;
                                case 3:
                                    System.out.println("Ingrese Nuevo Apellido");
                                    String ape = sc.nextLine();
                                    c[i].setApellido(ape);
                                    break;
                                case 4:
                                    System.out.println("Ingrese Nueva Direcion");
                                    String dir = sc.nextLine();
                                    c[i].setDireccion(dir);
                                    break;
                                case 5:
                                    System.out.println("Ingrese nueva Fecha de Nacimiento");
                                  Date na = new SimpleDateFormat("dd/mm/yyyy").parse(sc.nextLine());
                                    c[i].setFechaNac(na);
                                    break;
                                case 6:
                                    System.out.println("Desea Actualizar un telefono o agregar uno nuevo: (1-nuevo, 2-Actualizar)");
                                    int k = sc.nextInt();
                                    if (k == 1) {
                                        int asd = c[i].getTel().length;
                                        System.out.println("Ingrese Tipo de telefono (1-CASA|2-TRABAJO|3-MOVIL|4-Principal|5-OTRO)");
                                        int t = sc.nextInt();
                                        System.out.println("ingrese nro telefono;");
                                        int nross = sc.nextInt();
                                        Telefono te = new Telefono(t, nro);
                                        c[i].tel[asd] = te;
                                    } else if (k == 2) {
                                        System.out.println("Ingrese Numero a Actualizar");
                                        int nroc = sc.nextInt();
                                        for (int je = 0; je < c[i].getTel().length; je++) {
                                            if (c[i].getTel()[j].Nrotelefono == nroc) {
                                                System.out.println("Ingrese Tipo de telefono (1-CASA|2-TRABAJO|3-MOVIL|4-Principal|5-OTRO)");
                                                int t = sc.nextInt();
                                                System.out.println("ingrese nro telefono;");
                                                int nross = sc.nextInt();
                                                Telefono telefon = new Telefono(t, nro);
                                                c[i].tel[j] = telefon;

                                            }
                                        }
                                    } else {
                                        System.out.println("Opcion no valida");
                                    }

                            }
                        }
                    }}

                    //c[i]
                }
                break;
            default:
                System.out.println("No realiza operacion");
                break;
        }
    }
    public void OrdenareImprimir(){
        for(int j=0;j<c.length;j++){
            
            for(int i=0;i<c.length-j;i++){
            if(c[i]!=null){
                if(c[i].getApellido().compareTo(c[i+1].getApellido())>0){
                    Contacto co = new Contacto();
                    co=c[i];
                    c[i]=c[i+1];
                    c[i+1]=co;
                }
            }}
        }
        for(int j=0;j<c.length;j++){
                System.out.println(c[j].toString());
            }
        }
    public void ListarFechacerc(){
        for(int i=0;i<c.length;i++){
         
         
        }
    }
    
    }

