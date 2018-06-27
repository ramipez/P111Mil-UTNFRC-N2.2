
package agendacompartida.dao;

import agendacompartida.dominio.Telefono;
import java.util.Date;

public class ContactoDao
{

    
    public void insertarDatos(int dni, String nombre, String apellido, String direccion, Date fechaNac, Telefono[] tel){
        Conexion con=Conexion.getInstance();
        String sql;
        sql="insert into Contacto values("+dni+","+nombre+","+apellido+","+direccion+","+fechaNac+",";
                  for(int i=0;i<tel.length;i++){
            sql+= tel[i];
        }
         sql+=");";         
                        
        con.ejecutarSQL(sql);
    }
    
    public void eliminarContacto (String id){
	
		
		}    
}
