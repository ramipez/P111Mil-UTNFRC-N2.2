package agendacompartida.dominio;

public class Telefono {

    private String tipoTelefono;
    private int numero;
    
    public Telefono() {

    }

    public String getTipoTelefono() {
        return tipoTelefono;
    }

    public void setTipoTelefono(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
}

