
package tp.agendatelefonica;

import java.util.Scanner;


public class Telefono {
    
    private int numero;
    private String tipoTelefono;

    public Telefono (String tipo, int numero)
    {
        this.numero = numero;
        this.tipoTelefono = tipo;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int telefono) {
        this.numero = telefono;
    }

    public String getTipo() {
        return tipoTelefono;
    }

    public void setTipo(String tipoTelefono) {
        this.tipoTelefono = tipoTelefono;
    }

    @Override
    public String toString() {
        return "Telefono{" + "telefono=" + numero + ", tipoTelefono=" + tipoTelefono + '}';
    }

   
    
    

    
    
    
}
