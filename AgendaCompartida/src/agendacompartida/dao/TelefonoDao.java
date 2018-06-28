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
                + " set numero = '" + telefono.getNumero() + "'"
                + " , codArea = '" + telefono.getPrefijo() + "'"
                + ", tipo = '" + telefono.getTipoTelefono() + "'"
                + " where id_telefonos =" + telefono.getId());

    }

    public void deleteTelefono(Telefono telefono) {

        conexion.ejecutarSQL("delete from Telefonos"
                + " where id_telefonos =" + telefono.getId());
    }

    public void insertarTelefono(Telefono telefono) {
        String sql ="INSERT INTO Telefonos  (id, tipoTelefono, numero, prefijo) "
                + " VALUES ("+telefono.getId()+", '" + telefono.getTipoTelefono() +"' , '"+ telefono.getNumero() +"' , '"+ telefono.getPrefijo() + "')";
        conexion.ejecutarSQL(sql);

    }
}
