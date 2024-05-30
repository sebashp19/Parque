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
public class Cliente {
        private int cedula;
	private String dirrecion;
	private String nombre;
	private String profesion;

	public Cliente(){

	}

    public int getCedula() {
        return cedula;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

}
