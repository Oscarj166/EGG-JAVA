/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import Entidad.Persona;

/**
 *
 * @author estar
 */
public class POOEJ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciacion utilizando el constructor vacio
        Persona primeraPersona = new Persona();
        
        // Instanciacion utilizando el constructor por parametro
        Persona segundaPersona = new Persona("Jose");
    }
    
}
