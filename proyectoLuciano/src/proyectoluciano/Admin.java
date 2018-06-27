/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoluciano;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Admin
{

    Contacto[] c = new Contacto[100];

    public void agregar(int i) throws ParseException
    {  //RESUELTO

        Scanner entnum = new Scanner(System.in);
        Scanner entletra = new Scanner(System.in);
        Scanner entfecha = new Scanner(System.in);

        System.out.println("Ingrese el DNI: ");

        int dni = entnum.nextInt();

        System.out.println("Ingrese nombre: ");

        String nombre = entletra.nextLine();

        System.out.println("Ingrese apellido: ");

        String apellido = entletra.nextLine();

        System.out.println("Ingrese direccion: ");

        String direccion = entletra.nextLine();

        System.out.println("Ingrese fecha de nacimiento (Formato dd/mm/yyyy) : ");

        Date fecha_nacimiento = new SimpleDateFormat("dd/mm/yyyy").parse(entfecha.nextLine());

        System.out.println("Ingrese la cantidad de numeros: ");
        int cn = entnum.nextInt();

        Telefono[] tel = new Telefono[cn];

        for (int h = 0; h < tel.length; h++)
        {

            System.out.println("Ingrese el tipo: 1-CASA, 2-TRABAJO, 3-MOVIL, 4-PRINCIPAL, 5-OTRO");
            int t = entnum.nextInt();

            System.out.println("Ingrese el numero");
            int num = entnum.nextInt();

            tel[h] = new Telefono(num, t);

        }

        c[i] = new Contacto(dni, nombre, apellido, direccion, fecha_nacimiento, tel);
        System.out.println("Contacto creado con exito: " + c[i].toString());

    }

    public void buscarPorDni(int dni)
    {  //MISMO PROBLEMA DE BUSCAR POR NOMBRE

        String aux = "";

        for (int i = 0; i < c.length; i++)
        {

            if (c[i] != null)
            {

                if (c[i].getDni() == dni)
                {

                    aux = c[i].toString();
                    break;

                } else
                {

                    aux = "No se ha encontrado el contacto";

                }

            }

        }
        System.out.println(aux);

    }

    public void buscarPorNombre(String nombre)
    {  //CUANDO BUSCO EL NOMBRE DL SEGUNDO AGREGADO,sale el mensaje de no encontrado del primero

        String aux = "";

        for (int i = 0; i < c.length; i++)
        {

            if (c[i] != null)
            {

                if (c[i].getNombre().equalsIgnoreCase(nombre))
                {

                    aux = c[i].toString();
                    break;

                } else
                {

                    aux = "No se ha encontrado el contacto";

                }

            }

        }

        System.out.println(aux);

    }

    public void buscarPorNroTelefono(int tipo, int nroTelefono)
    {  //PROBLEMA EN GENERAL

        boolean encontradoNumero = false;

        for (int i = 0; i < c.length; i++)
        {

            if (c[i] != null)
            {

                for (int j = 0; j < c[i].getTel().length; j++)
                {

                    if (c[i].getTel() != null)
                    {

                        if (c[i].getTel()[j].tipo == tipo && c[i].getTel()[j].nroTelefono == nroTelefono)
                        {

                            encontradoNumero = true;

                        }

                        if (encontradoNumero)
                        {

                            System.out.println("Contacto encontrado: " + c[i].toString());
                            break;

                        }

                    }

                }

            }

        }
        if (encontradoNumero == false)
        {
            System.out.println("Contacto no encontrado");
        }

    }

    public void actualizar() throws ParseException
    {
        Scanner tecla = new Scanner(System.in);
        Scanner teclanum = new Scanner(System.in);
        Scanner teclaFecha = new Scanner(System.in);

        boolean encontradoNombre = false;
        System.out.println("Ingrese el nombre del contacto a buscar");

        String nombre = tecla.nextLine();

        for (int i = 0; i < c.length; i++)
        {

            if (c[i] != null)
            {

                if (c[i].getNombre().equalsIgnoreCase(nombre))
                {

                    encontradoNombre = true;
                    System.out.println(c[i].toString());

                    if (encontradoNombre)
                    {

                        System.out.println("Que desea modificar? 1- NOMBRE, 2- APELLIDO, 3- DIRECCION, 4- FECHA DE NACIMIENTO, 5-TELEFONO");
                        int opc = teclanum.nextInt();

                        switch (opc)
                        {

                            case 1:
                                System.out.println("Introduce el nombre a modificar");
                                String nombreAMod = tecla.nextLine();
                                c[i].setNombre(nombreAMod);

                                break;

                            case 2:

                                System.out.println("Introduce el apellido a modificar");
                                String apeAMod = tecla.nextLine();
                                c[i].setApellido(apeAMod);

                                break;

                            case 3:

                                System.out.println("Introduce la direccion a modificar");
                                String deireAMod = tecla.nextLine();
                                c[i].setDireccion(deireAMod);

                                break;

                            case 4:

                                System.out.println("Introduce la fecha a modificar");
                                Date fechaAMod = new SimpleDateFormat("dd/mm/yyyy").parse(teclaFecha.nextLine());
                                c[i].setFecha_nacimiento(fechaAMod);

                                break;

                            case 5:

                                System.out.println("ACTUALIZAR NUMERO");

                                System.out.println("Ingrese numero que desee actualizar");

                                int nro = teclanum.nextInt();

                                for (int h = 0; h < c[i].getTel().length; h++)
                                {

                                    if (c[i].getTel()[h].nroTelefono == nro)
                                    {

                                        System.out.println("Ingrese el tipo: 1-CASA, 2-TRABAJO, 3-MOVIL, 4-PRINCIPAL, 5-OTRO");
                                        int t = teclanum.nextInt();
                                        c[i].getTel()[h].setTipo(t);
                                        System.out.println("ingrese el numero nuevo");
                                        int numNuevo = teclanum.nextInt();

                                        c[i].getTel()[h].setTipo(t);
                                        c[i].getTel()[h].setNroTelefono(numNuevo);

                                    } else
                                    {

                                        System.out.println("No se encontro el numero del contacto");
                                    }

                                }

                                break;

                            default:
                                System.out.println("No deseo modificar");
                                break;

                        }

                    }

                } else
                {

                    System.out.println("No se ha encontrado el contacto");

                }

            }

        }

    }

    public void OrdenarEImprimir()
    {  //Resuelto

        for (int i = 0; i < c.length; i++)
        {

            if (c[i] != null)
            {

                for (int j = 0; j < c.length - i; j++)
                {

                    if (c[i].getApellido().compareToIgnoreCase(c[i + 1].getApellido()) > 0)
                    {

                        Contacto contacto = new Contacto();
                        contacto = c[i];

                        c[i] = c[i + 1];
                        c[i + 1] = contacto;

                    }

                }

                for (i = 0; i < c.length; i++)
                {

                    if (c[i] != null)
                    {

                        System.out.println("Contacto: " + c[i].toString());

                    }
                }

            }

        }

    }

    public void borrar()
    {  //RESUELTO

        Scanner scanL = new Scanner(System.in);

        boolean encontrarNombre = false;

        for (int i = 0; i < c.length; i++)
        {

            if (c[i] != null)
            {

                System.out.println("Ingrese el nombre a buscar:");
                String nombre = scanL.nextLine();

                if (c[i].getNombre().equalsIgnoreCase(nombre))
                {

                    encontrarNombre = true;

                }

                if (encontrarNombre)
                {
                    int mje = JOptionPane.showConfirmDialog(null, "esta seguro?");

                    if (mje == JOptionPane.YES_OPTION)
                    {
                        c[i] = null;
                        JOptionPane.showMessageDialog(null, "ELIMIANCION EXITOSA");
                        break;

                    } else if (mje == JOptionPane.NO_OPTION)
                    {

                        JOptionPane.showMessageDialog(null, "NO ELIMINAR");
                    }

                } else if (encontrarNombre == false)
                {

                    System.out.println("No se pudo eliminar (Contacto inexistente)");
                    break;

                }

            }

        }

    }

    public void listarFecha() throws ParseException
    {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try
        {

            Date date1 = format.parse("20/04/2018");
            Date date2 = format.parse("20/04/2018");

            long diffDate = date1.getTime() - date2.getTime();
            long days = TimeUnit.MILLISECONDS.toDays(diffDate);

            System.out.println("dias de diferencia: " + days);

        } catch (ParseException ex)
        {
            System.out.println("PORFAVOR ingrese la fecha con este formato: dd/MM/yyyy");
            
        }

    }

}
