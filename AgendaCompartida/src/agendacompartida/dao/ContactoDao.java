
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
   
=======
	con=Conexion.getInstance();
	String sql;
        sql= "DELETE * FROM contacto WHERE id= '"+ id +"';";
        con.ejecutarSQL(sql);
	}
    
>>>>>>> origin/master
}
