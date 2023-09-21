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
public class Ejercicio4guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         // TODO code application logic here
         Scanner grados = new Scanner(System.in);
         //crea una vaariale double
        double gC;
        double gF;
        //Muestra un mensaje por pantalla
        System.out.println("Ingresa los grados a convertir:");
        gC = grados.nextDouble();
        gF = 32 + (gC*9/5);
        System.out.println("La conversion de grados centígrados a grados Fahrenheit es:  " + gF);
        
        
 
    }
    
}
