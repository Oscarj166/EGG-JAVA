/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramaguiadeejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
  
        
    public static void main(String[] args) {
       int num,N, cont=0;
          N=30;
          int [] vector= new int[N];
        Scanner scanner = new Scanner(System.in);
        Random rd= new Random();
         
     
         
        System.out.println("Ingrese un numero entero entre 1 y 30");
        num = scanner.nextInt();
         
        
         System.out.println("===========");
                 buscarVector(num);

        LlenarVector(vector, N);
        
       
        for (int i = 0; i < N; i++) {
            if (vector[i]== num) {
                cont++;
               
        }
  
       
                
        }
         
        System.out.println("El numero " + num + " se repite : " + cont + " veces");
        
        
    }
    
    public static int LlenarVector(int[] vector, int N ) {
        Random rd= new Random();
       for (int i = 0; i < N; i++) {
            vector[i]=rd.nextInt(30-1)+1;
            System.out.println(vector[i]);
    }
        return  N;
    }
    
    
    public static void buscarVector(int num) {
        Scanner scanner = new Scanner(System.in);
         while((num<1)||(num>30)){
        System.out.println("Ingresa un numero dentro del rango");
          num = scanner.nextInt();
             System.out.println("===========");
        }
    }
}



         
            
        
        
           
            
    

    
        
    



    

