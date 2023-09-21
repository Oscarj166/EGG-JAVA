/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Guia1ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        int sumaTotal;
        
        // Se crea una varible Scanner que se utiliza para leer datos del usuario
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingresa un numero entero:");
        num1 = scanner.nextInt();
        
         System.out.println("Ingresa otro numero entero:");
        num2 = scanner.nextInt();
        
        sumaTotal = num1 + num2;
        
        System.out.println("La suma de los numeros es: " + sumaTotal);
    
    }
}
  
