/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoluciano;

/**
 *
 * @author Luciano
 */
public class Telefono {
    
    int nroTelefono;
    int tipo;

    public Telefono(int nroTelefono, int tipo) {
        this.nroTelefono = nroTelefono;
        this.tipo = tipo;
    }
    
    public Telefono(){
        
        nroTelefono=0;
        tipo=0;
        
        
    }

    @Override
    public String toString() {
        return "Telefono{" + "nroTelefono=" + nroTelefono + ", tipo=" + tipo + '}';
    }
    

    public int getNroTelefono() {
        return nroTelefono;
    }

    public void setNroTelefono(int nroTelefono) {
        this.nroTelefono = nroTelefono;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
}
