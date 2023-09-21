/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1guia;

import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Ejercicio3Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner(System.in);
        //Se crea una variablecadena (String) que se utiliza para leer datos del  usuario
        String frase;
                
        //Muestra un mensaje por pantalla
        System.out.println("Ingresa una frase:");
        frase = leer.nextLine();
 
        
        System.out.println("La frase es; " + frase.toUpperCase());
        System.out.println("La frase es; " + frase.toLowerCase());
    }
    
}
