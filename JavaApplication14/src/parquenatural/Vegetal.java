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


	public void Vegetal(){

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
