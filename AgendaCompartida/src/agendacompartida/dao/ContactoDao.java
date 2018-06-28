
package agendacompartida.dao;

import agendacompartida.dominio.Contacto;
import agendacompartida.dominio.Telefono;
import java.util.Date;
import java.sql.*;
import java.util.ArrayList;

public class ContactoDao
{
    private Conexion con;

    
    public void insertarDatos(int dni, String nombre, String apellido, String direccion, Date fechaNac, Telefono[] tel){
        con=Conexion.getInstance();
        String sql;
        sql="insert into Contacto values("+dni+","+nombre+","+apellido+","+direccion+","+fechaNac+",";
                  for(int i=0;i<tel.length;i++){
            sql+= tel[i];
        }
         sql+=");";                                 
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
