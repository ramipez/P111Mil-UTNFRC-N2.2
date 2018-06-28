
package agendacompartida.dao;

import agendacompartida.dominio.Contacto;
import agendacompartida.dominio.Telefono;
import java.util.Date;

public class ContactoDao
{
    Conexion con;

    
    public void insertarDatos(Contacto contacto){
        con=Conexion.getInstance();
        String sql;
        sql="insert into Contacto values("+contacto.getDni()+","+contacto.getNombre()+","+contacto.getApellido()+","+contacto.getDireccion()+",str_to_date('"+contacto.getFechaNac()+"','%d/%m/%Y');";                                 
        con.ejecutarSQL(sql);
    }
    
    public void eliminarContacto (String id){
	con=Conexion.getInstance();
	String sql;
        sql= "DELETE * FROM contacto WHERE id= '"+ id +"';";
        con.ejecutarSQL(sql);
	}
    
    
    public void actualizarDatos(Contacto contacto, String dni){
        con = Conexion.getInstance();
        String sql="update Contacto "
                + " set nombre= '" + contacto.getNombre() + "'"
                + " , apellido= '" + contacto.getApellido()+ "'"
                + " , direccion= '" + contacto.getDireccion()+"'"
                + " , fechaNac = str_to_date(%d/%m/%Y),(" + contacto.getFechaNac() + ");"
                + " where dni= " + dni + "; ";
        con.ejecutarSQL(sql);
    }
    
}
