/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramas;

/**
 *
 * @author estar
 */
public class Ejemplo2guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    	String nombre = "Mariano";
   	 
    	int edad = 29;
   	 
    	mostrarInfo(nombre, edad);
	}

    
	public static void mostrarInfo(String nombre, int edad) {
   	 
    	System.out.println("El nombre del usuario es: " + nombre + "y su edad:" + edad);
   	 
	}
    
}
