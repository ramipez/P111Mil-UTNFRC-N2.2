package agendacompartida.dao;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author AsusX541U
 */
public class TelefonoDao {

    Statement statement = connection.createStatement();

    statement.executeUpdate("INSERT INTO Telefonos (tipoTelefono, numero, prefijo) VALUES (1, 3516086969, '+549');");
    
    ResultSet rs = statement.executeQuery("Select * from Telefonos");

    while (rs.next()){
        
            System.out.println(rs.getTipoTelefono(1));
            System.out.println(rs.getNumero("id"));
            System.out.println(rs.getPrefijo());

        }
    }
