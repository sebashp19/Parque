/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquenatural;

/**
 *
 * @author SIS
 */
public class Parque {

	private String inaguracion;
	private String nombre;
	private int numentrada;
	private String ubicaicon;
	public Area numarea [];
	public Personal numpersonal [];
	public Alojamiento numalojamiento [];
	public Cliente cliente [];

	public void Parque(){

	}

    public String getInaguracion() {
        return inaguracion;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public Alojamiento[] getNumalojamiento() {
        return numalojamiento;
    }

    public int getNumentrada() {
        return numentrada;
    }

    public Area[] getNumarea() {
        return numarea;
    }

    public Personal[] getNumpersonal() {
        return numpersonal;
    }

    public String getUbicaicon() {
        return ubicaicon;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public void setInaguracion(String inaguracion) {
        this.inaguracion = inaguracion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumalojamiento(Alojamiento[] numalojamiento) {
        this.numalojamiento = numalojamiento;
    }

    public void setNumarea(Area[] numarea) {
        this.numarea = numarea;
    }

    public void setNumentrada(int numentrada) {
        this.numentrada = numentrada;
    }

    public void setNumpersonal(Personal[] numpersonal) {
        this.numpersonal = numpersonal;
    }

    public void setUbicaicon(String ubicaicon) {
        this.ubicaicon = ubicaicon;
    }

		
}