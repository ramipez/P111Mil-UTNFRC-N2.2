
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
        Contacto c = null;
        sql="insert into Contacto values("+dni+","+nombre+","+apellido+","+direccion+","+fechaNac+",";
                  for(int i=0;i<c.tel.length;i++){
            sql+= c.tel[i];
        }
         sql+=");";                                 
        con.ejecutarSQL(sql);
    }
    
    public void eliminarContacto (String id){
	
		
		} 
       }
}
