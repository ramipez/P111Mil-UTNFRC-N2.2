
package agendacompartida.dao;

import agendacompartida.dominio.Contacto;
import agendacompartida.dominio.Telefono;
import java.util.Date;

public class ContactoDao
{
    Conexion con;

    
    public void insertarDatos(int dni, String nombre, String apellido, String direccion, Date fechaNac, Telefono[] tel){
        con=Conexion.getInstance();
        String sql;
        sql="insert into Contacto values("+dni+","+nombre+","+apellido+","+direccion+","+fechaNac+");";                                 
        con.ejecutarSQL(sql);
    }
    
    public void eliminarContacto (String id){
	con=Conexion.getInstance();
	String sql;
        sql= "DELETE * FROM contacto WHERE id= '"+ id +"';";
        con.ejecutarSQL(sql);
	}
    
}
