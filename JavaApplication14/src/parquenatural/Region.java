/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquenatural;

import java.util.ArrayList;

/**
 *
 * @author law
 */
public class Region {
    
    private String nombre;
    ArrayList<Parque> parques = new ArrayList<Parque>();
    private String Organismo_responsable;

    public Region(String nombre, String Organismo_responsable) {
        this.nombre = nombre;
        this.Organismo_responsable = Organismo_responsable;
    }

    
    public void aniadirParqueARegion(Parque p){
        this.parques.add(p);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Parque> getParques() {
        return parques;
    }

    public void setParques(ArrayList<Parque> parques) {
        this.parques = parques;
    }

    public String getOrganismo_responsable() {
        return Organismo_responsable;
    }

    public void setOrganismo_responsable(String Organismo_responsable) {
        this.Organismo_responsable = Organismo_responsable;
    }
    
    
}
