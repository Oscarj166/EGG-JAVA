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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int num=0,N, cont=0;
          N=20;
          int [] vector= new int[N];
        Scanner scanner = new Scanner(System.in);
        Random rd= new Random();
       String numero = Integer.toString(N);

        for (int i = 0; i < N; i++) {
            if (vector[i]== num) {
                
                cont++;
         }      
              LlenarVector(vector, N, num); 
        }
        
    }
    
    public static int LlenarVector(int[] vector, int N, int num ) {
        Random rd= new Random();
       for (int i = 0; i < N; i++) {
            vector[i]=rd.nextInt(10000-1)+1;
            System.out.println(vector[i]);
            num=vector[i];
            String numero = Integer.toString(num);
            System.out.println("El numero " + num + " tiene : " +numero.length()  + " digitos");
            System.out.println("===========");
       }
        return  N;
    }
    
}

             
        
    


