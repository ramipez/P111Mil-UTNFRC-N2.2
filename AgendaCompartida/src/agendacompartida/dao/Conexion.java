
package agendacompartida.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public void ejecutarSQL(String sql){
      try {
        cn.createStatement().execute(sql);
      } catch (SQLException ex) {
        Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
    
}
