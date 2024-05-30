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
public class Area {
        private Especie especie[];
	private String nombre;
	private int numespecie;
	private float tamaño;
	private Guardia guardia;

	public void Area(){

	}

	public void añade_especie(Especie e){

	}

    public Especie[] getEspecie() {
        return especie;
    }

    public Guardia getGuardia() {
        return guardia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEspecie(Especie[] especie) {
        this.especie = especie;
    }

    public void setGuardia(Guardia guardia) {
        this.guardia = guardia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumespecie() {
        return numespecie;
    }

    public void setNumespecie(int numespecie) {
        this.numespecie = numespecie;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public float getTamaño() {
        return tamaño;
    }
        
        
}
