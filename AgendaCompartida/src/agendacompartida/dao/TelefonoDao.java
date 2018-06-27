package agendacompartida.dao;

import agendacompartida.dominio.Telefono;

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
                "update Telefonos "
                + "set numero = " + telefono.getNumero()
                + " , codArea = " + telefono.getPrefijo()
                +", tipo = "+ telefono.getTipoTelefono());

    }
}

