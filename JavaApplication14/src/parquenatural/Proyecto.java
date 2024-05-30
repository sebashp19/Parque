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
public class Proyecto {
    	private Especie especie;
	private String nombre;
	private int numespe;
	private double presupuesto;

	public void Proyecto(){
        }
	
	public void buscar_especie(){

	}

    public Especie getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumespe() {
        return numespe;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumespe(int numespe) {
        this.numespe = numespe;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
        
}
