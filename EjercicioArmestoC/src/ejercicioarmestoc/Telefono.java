/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarmestoc;

/**
 *
 * @author alumno
 */
public class Telefono {
    int TipoContacto;
int Nrotelefono;

    public Telefono(int TipoContacto, int Nrotelelefono) {
        this.TipoContacto = TipoContacto;
        this.Nrotelefono = Nrotelefono;
    }

    public Telefono() {
        Nrotelefono=0;
    TipoContacto=0;
    
    }

    public int getTipoContacto() {
        return TipoContacto;
    }

    public void setTipoContacto(int TipoContacto) {
        this.TipoContacto = TipoContacto;
    }

    public int getNrotelefono() {
        return Nrotelefono;
    }

    public void setNrotelefono(int Nrotelefono) {
        this.Nrotelefono = Nrotelefono;
    }

    @Override
    public String toString() {
        return "AgendaTelefonica{" + "TipoContacto=" + TipoContacto + ", Nrotelefono=" + Nrotelefono + '}';
    }

}
