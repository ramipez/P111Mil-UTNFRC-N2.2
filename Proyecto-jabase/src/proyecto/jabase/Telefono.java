/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.jabase;

/**
 *
 * @author puto el que lee2
 */
public class Telefono
{
    public long nmro;
    public int tipo;

    public Telefono(long nmro, int tipo)
    {
        this.nmro = nmro;
        this.tipo = tipo;
    }

    public long getNmro()
    {
        return nmro;
    }

    public void setNmro(long nmro)
    {
        this.nmro = nmro;
    }

    public int getTipo()
    {
        return tipo;
    }

    public void setTipo(int tipo)
    {
        this.tipo = tipo;
    }

    @Override
    public String toString()
    {
        return "Telefono{" + "nmro=" + nmro + ", tipo=" + tipo + '}';
    }

    
    
}
