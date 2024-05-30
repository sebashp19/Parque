/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquenatural;

import java.util.ArrayList;

/**
 *
 * @author SIS
 */
public class Parque {

	private String inaguracion;
	private String nombre;
	private int numentrada;
	private ArrayList<Region> ubicaicon;
	private ArrayList<Area> numarea;
	private Personal numpersonal [];
	private ArrayList<Alojamiento> alojamientos;
	private Cliente cliente [];

	public Parque(){

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

    public ArrayList<Alojamiento> getNumalojamiento() {
        return alojamientos;
    }

    public int getNumentrada() {
        return numentrada;
    }

    public ArrayList<Area> getNumarea() {
        System.err.println("LLEGO ---- " + this.numarea.size());
        return numarea;
        //System.err.println("LLEGO " + numarea.size());
        
        
    }

    public Personal[] getNumpersonal() {
        return numpersonal;
    }

    public ArrayList<Region> getUbicaicon() {
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

    public void setAlojamiento(ArrayList<Alojamiento> alojamiento) {
        this.alojamientos = alojamiento;
    }

    public void setNumarea(ArrayList<Area> numarea) {
        this.numarea = numarea;
    }
    public void Area(ArrayList<Area> area) {
        this.numarea = area;
        
    }

    public void setNumentrada(int numentrada) {
        this.numentrada = numentrada;
    }

    public void setNumpersonal(Personal[] numpersonal) {
        this.numpersonal = numpersonal;
    }

    public void setUbicaicon(ArrayList<Region> ubicaicon) {
        this.ubicaicon = ubicaicon;
    }

		
}