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
public class Personal {
        protected int cedula;
	protected String direccion;
	protected String nombre;
	protected int sueldo;
	protected int telefono;

	public void Personal(){

	}

    public int getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
        
        
}
