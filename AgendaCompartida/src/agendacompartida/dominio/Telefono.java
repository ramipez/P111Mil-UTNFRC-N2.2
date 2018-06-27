package agendacompartida.dominio;

public class Telefono {

    private String tipoTelefono;
    private int numero;
    private String prefijo;
    
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
    public String getPrefijo(){
        return prefijo;
    }
    public void setPrefijo(String prefijo){
        this.prefijo = prefijo;
    }
    
    
    
}

