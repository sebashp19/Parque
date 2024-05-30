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
public class Vegetal extends Especie{
    private boolean floracion;
    private int periodoflor;
    private String per_floracion;


	public Vegetal(){

	}

    public String getPer_floracion() {
        return per_floracion;
    }

    public void setPer_floracion(String per_floracion) {
        this.per_floracion = per_floracion;
    }

        
        
        
    public void setFloracion(boolean floracion) {
        this.floracion = floracion;
    }

    public int getPeriodoflor() {
        return periodoflor;
    }

    public void setPeriodoflor(int periodoflor) {
        this.periodoflor = periodoflor;
    }
        
}
