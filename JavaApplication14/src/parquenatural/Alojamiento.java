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
public class Alojamiento {
    
	private int capacidad;
	private Excursion excursion;
	private String nombre;
	private Cliente visitantes;

	public void Alojamiento(){

	}

	public void visitantes(Cliente v){

	}

    public int getCapacidad() {
        return capacidad;
    }

    public Excursion getExcursion() {
        return excursion;
    }

  

    public Cliente getVisitantes() {
        return visitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setExcursion(Excursion excursion) {
        this.excursion = excursion;
    }

   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVisitantes(Cliente visitantes) {
        this.visitantes = visitantes;
    }
        
        
}
