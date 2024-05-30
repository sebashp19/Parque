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
public class Excursion {
    	private Alojamiento alojamiento[];
	private char cod;
	private String dia;
	private int hora;
	private Cliente visitante[];


	public void Excursion(){

	}

	public void buscar_visitante(){

	}

    public Alojamiento[] getAlojamiento() {
        return alojamiento;
    }

    public char getCod() {
        return cod;
    }

    public String getDia() {
        return dia;
    }

    public int getHora() {
        return hora;
    }

   

    public Cliente[] getVisitante() {
        return visitante;
    }

    public void setAlojamiento(Alojamiento[] alojamiento) {
        this.alojamiento = alojamiento;
    }

    public void setCod(char cod) {
        this.cod = cod;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }



    public void setVisitante(Cliente[] visitante) {
        this.visitante = visitante;
    }
        
        
}
