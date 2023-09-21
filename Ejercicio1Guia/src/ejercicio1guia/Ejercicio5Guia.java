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
public class Ejercicio5Guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // se crea una variable scanner
        Scanner numero = new Scanner(System.in);
        //Se crean variables de tipo entera
        int entero, doble, triple;
        double raiz;
        //se le pide al usuario ingresar el numero por paltalla
        System.out.println("Ingrese un numero entero");
        //Se guarda el numero en una variable
        entero = numero.nextInt();
        doble = entero * entero;
        triple = entero * entero * entero;
        raiz = (double) Math.sqrt(entero);
        //Se imprime por pantalla
        System.out.println("El numero doble es: " + doble + " El triple es: " + triple + " y Su raiz " + raiz);
        System.out.println("Y su raiz es: " + Math.sqrt(entero));
        
        
                
    }
    
}
