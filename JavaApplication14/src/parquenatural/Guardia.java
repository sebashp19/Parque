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
public class Guardia extends Personal{
        private Area area;
	private int matriculauto;
	private String modeloauto;

	public void Guardia(){

	}

    public Area getArea() {
        return area;
    }


    public int getMatriculauto() {
        return matriculauto;
    }

    public String getModeloauto() {
        return modeloauto;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public void setMatriculauto(int matriculauto) {
        this.matriculauto = matriculauto;
    }

    public void setModeloauto(String modeloauto) {
        this.modeloauto = modeloauto;
    }

  
}
