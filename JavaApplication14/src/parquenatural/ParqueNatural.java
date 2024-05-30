/************************************************* ***********************
* Palabra de honor:
* - No he discutido ni mostrado el código de mi programa con alguien que no sea mi
*compañero, Profesor o con el monitor asignado a este curso.
*
* - No he utilizado código obtenido de otro u otros estudiantes,
* O cualquier otra fuente no autorizada, ya sea modificado o sin modificar.
*
* - Si cualquier código o documentación utilizada en mi programa
* Fue obtenido de otra fuente, tal como un libro de texto o curso
* Notas, debe ser claramente señalado con una cita apropiada en
* Los comentarios de mi programa.
*
* <sebastian hernandez perez – 0221710005>
*
************************************************** ********************* /
* /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parquenatural;

import java.util.ArrayList;
import vista.VentanaPrincipal;

/**
 *
 * @author SIS
 */
public class ParqueNatural {

    
    private ArrayList<Region> regiones = new ArrayList<Region>();
    
    
    public ParqueNatural(){
        llenarDatos();
        new VentanaPrincipal().setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        
        
        new ParqueNatural();
        
        
     
    }
    
    
    public void llenarDatos(){
        regiones.add(new Region("Cordoba", "JAV"));
        regiones.add(new Region("Atlantico", "Comision reguladora de Parques naturales de Atlantico"));
        regiones.add(new Region("Cordoba", "EPO"));
        regiones.add(new Region("Antioquia", "MedaAmbiente"));
        regiones.add(new Region("Guajira", "MCA"));
        regiones.add(new Region("Bolivar", "EPA"));
        regiones.add(new Region("Sucre", "APA"));
        regiones.add(new Region("Santander", "CRPNS"));
        regiones.add(new Region("Norte de Santander", "PNS"));
    }
    
}
