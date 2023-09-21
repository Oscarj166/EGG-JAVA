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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //creo la variable con scanner para luego poder imprimir el vector
        Scanner scanner = new Scanner(System.in);
        //creo un vector llamado equipo tipo string
        int vectorDes[] = new int[100];
        int aux[]=new  int[vectorDes.length];
        //para llenar el vector realizamos un ciclo for
        for (int i = 0; i <vectorDes.length; i++) {
            vectorDes[i]= (int) (Math.random()*99+1);
            System.out.println("" + i + ": " + vectorDes[i]);
        }
         
        System.out.println("================");
        System.out.println("For decreciendo");
       inverso(vectorDes, aux);
        
        
    
        
    }
    public static int inverso(int []vectorDes, int [] aux) {
        for (int i = vectorDes.length-1, j=0;i>0;i--, j++) {
           aux[j] = vectorDes[i];
            System.out.println("" + i + ": " + vectorDes[i]);
    }
        return 0;
    }
}
    



    
    

