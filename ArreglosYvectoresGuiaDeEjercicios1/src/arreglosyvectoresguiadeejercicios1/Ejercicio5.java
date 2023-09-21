/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosyvectoresguiadeejercicios1;

import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = new int[3][3];
        
        llenarMatriz(matriz);
        
        System.out.println("Matriz aleatoria creada");
        
        
        System.out.println("--------------------------");
        mostrarMatriz(matriz);
        System.out.println("--------------------------");
        
        
        System.out.println("Matriz transpuesta");        
        System.out.println("--------------------------");
        matrizTranspuesta(matriz);
        System.out.println("--------------------------");
    }
    
    private static void llenarMatriz(int[][] matriz){
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los numeros de la matriz");
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                int num = leer.nextInt();
                matriz[i][j] = num;
            }
        }
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print("[ " + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }  
    }
    
    public static void matrizTranspuesta(int[][] matriz) {
        
        int[][] matrizTransp = new int[3][3];
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matrizTransp[i][j] = matriz[j][i];
            }
        }

        mostrarMatriz(matrizTransp);
        
        esAntisimetrica(matriz, matrizTransp);
    }
    
    private static void esAntisimetrica(int[][] matriz, int[][] matrizTransp){
        
        int count = 0;
        
        for(int i = 0; i < matrizTransp.length; i++){
            for(int j = 0; j < matrizTransp.length; j++){
                
                if(matriz[i][j] == (-matrizTransp[i][j])){
                    count++;
                }
            }
        }
        
        if(count > 0){
            System.out.println("[Es una matriz antisimetrica]");
        } else {
            System.out.println("[No es una matriz antisimetrica]");
        }
    }
    }
    
}
