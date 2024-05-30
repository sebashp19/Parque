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
public class Area {
        private ArrayList<Especie> especie;
	private String nombre;
	private float tamaño;
	private Guardia guardia[];

	public Area(){

	}

    public Area(ArrayList<Especie> especie, String nombre, float tamaño, Guardia[] guardia) {
        this.especie = especie;
        this.nombre = nombre;
        
        this.tamaño = tamaño;
        this.guardia = guardia;
    }
        
        

	public void añade_especie(Especie e){

	}

    public ArrayList<Especie> getEspecie() {
        return especie;
    }

    public Guardia[] getGuardia() {
        return guardia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEspecie(ArrayList<Especie> especie) {
        this.especie = especie;
    }

    public void setGuardia(Guardia[] guardia) {
        this.guardia = guardia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public float getTamaño() {
        return tamaño;
    }
        
        
}
