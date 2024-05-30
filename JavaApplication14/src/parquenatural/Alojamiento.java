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
	private String nombre;
	private Cliente visitantes;
        private String valor;
        private String categoria;

	public Alojamiento(){

	}

	public void visitantes(Cliente v){

	}

    public int getCapacidad() {
        return capacidad;
    }

  

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
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


   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVisitantes(Cliente visitantes) {
        this.visitantes = visitantes;
    }
        
        
}
