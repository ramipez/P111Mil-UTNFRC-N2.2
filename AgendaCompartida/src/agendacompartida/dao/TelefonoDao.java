package agendacompartida.dao;

import agendacompartida.dominio.Telefono;
import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author AsusX541U
 */
public class TelefonoDao {

    private final Conexion conexion;

    public TelefonoDao(Conexion c) {
        this.conexion = c;
    }

    public void updateTelefono(Telefono telefono) {
        conexion.ejecutarSQL(
                " update Telefonos "
                + " set numero = '" + telefono.getNumero()+"'"
                + " , codArea = '" + telefono.getPrefijo()+"'"
                +", tipo = '"+ telefono.getTipoTelefono()+"'"
                +" where id_telefonos ="+ telefono.getId());
        

    }
    public void deleteTelefono(Telefono telefono) {

        conexion.ejecutarSQL("delete from Telefonos"
                + "where id_telefonos =" + telefono.getId());
    }
}
/*
    Statement statement = Connection.createStatement();

    statement.executeUpdate("INSERT INTO Telefonos (id, tipoTelefono, numero, prefijo) VALUES (1,1, 3516086969, '+549');");
    
    ResultSet rs = statement.executeQuery("Select * from Telefonos");

    while (rs.next()){
        
            System.out.println(rs.getId(1));
            System.out.println(rs.getTipoTelefono(1));
            System.out.println(rs.getNumero());
            System.out.println(rs.getPrefijo());

        }
    }
*/
