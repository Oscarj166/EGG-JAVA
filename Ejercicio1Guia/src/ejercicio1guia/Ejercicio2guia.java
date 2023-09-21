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
public class Ejercicio2guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Se crea una variable Scanner 
       Scanner palabra = new Scanner(System.in);
        // Se crea una varible (String)
       String nombre;
        //se muestra un mensaje por pantalla pidiendo el nombre
       System.out.println("Ingresa tu nombre");
        //Se lee eel nombre de la persona con la variable nombre
       nombre = palabra.next();
       //se muestra por pantalla 
        System.out.println("hola " + nombre + " bienvanido");
    }
    
}
