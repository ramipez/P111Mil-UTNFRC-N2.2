package agendacompartida.dao;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author AsusX541U
 */
public class TelefonoDao {

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
