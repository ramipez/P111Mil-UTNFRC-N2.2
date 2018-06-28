
package agendacompartida.dao;

import agendacompartida.dominio.Contacto;
import agendacompartida.dominio.Telefono;
import java.util.Date;
import java.sql.*;
import java.util.ArrayList;

public class ContactoDao
{
    private Conexion con;

    
    public void insertarDatos(Contacto contacto){
        con=Conexion.getInstance();
        String sql;
        sql="insert into Contacto values("+contacto.getDni()+","+contacto.getNombre()+","+contacto.getApellido()+","+contacto.getDireccion()+",str_to_date('"+contacto.getFechaNac()+"','%d/%m/%Y');";                                 
        con.ejecutarSQL(sql);
    }
    
    public void eliminarContacto (String id){
<<<<<<< HEAD
	
		
		} 
     public ArrayList<Contacto>  buscarContactoNombre(String nombre)
    {
        int dni=0;
        String nom="", ape="";
        ArrayList<Contacto>  lista = new ArrayList<Contacto>();
        try{
            ResultSet s = con.consultar("select * fron Contactos where nombre = '"+nombre+"';");
            while(s.next())
            {
                Contacto aux = new Contacto();
                aux.setApellido(s.getString("Apellido"));
                aux.setNombre(s.getString("Nombre"));
                aux.setDni(s.getInt("Dni"));
                aux.setDireccion(s.getString("Direccion"));
                aux.setFechaNac(s.getDate("fecha"));
                lista.add(aux);
            }
            
        return lista;    
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
   
=======
	con=Conexion.getInstance();
	String sql;
        sql= "DELETE * FROM contacto WHERE id= '"+ id +"';";
        con.ejecutarSQL(sql);
	}
    
>>>>>>> origin/master
}
