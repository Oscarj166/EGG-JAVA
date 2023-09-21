/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosyvectoresguiadeejercicios1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int[] [] matriz = new int [3] [3];
           int[] [] matriztransp = new int [3] [3];
           Scanner sc = new Scanner(System.in);

    // Asigno valores mediante el For
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
             System.out.print("matriz ["+i+"]["+j+"]:");
            matriz[i][j] = sc.nextInt();
        }
    }
   	 
    // Muestro la matriz original
        System.out.println("\nMatriz :");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print( matriz[i][j]+" ");
        }
        System.out.println("");
    }
        //matriz transpuesta
        int aux;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }
    
    System.out.println("\nMatriz transpuesta");
     for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print( matriz[i][j]+ " ");
        }
         System.out.println("");
     }
}
}
        

