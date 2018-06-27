
package agendacompartida.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author agus_
 */
public class Conexion 
{
    private static Connection cn;
    
    private static Conexion instance;
     public static Conexion getInstance()
    {
        if(instance==null)
        {
            instance = new Conexion();
        }
        return instance;
    }
    public Conexion()
    {
        try{
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/agendatelefonos","root","1234");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
