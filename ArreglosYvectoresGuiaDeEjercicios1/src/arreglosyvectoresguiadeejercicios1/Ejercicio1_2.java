/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosyvectoresguiadeejercicios1;

import java.util.Random;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.N;

/**
 *
 * @author estar
 */
public class Ejercicio1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num,nam, cont =0;
       nam=10;
        int[] vec= new int [nam];
        Random vector = new Random();
        Scanner scanner = new Scanner(System.in);
                   
        for (int i = 0; i < nam; i++) {
            vec[i]=vector.nextInt(10-1)+1;
            System.out.println(vec[i]);
        }
    
        System.out.println("Ingrese numero a buscar: ");
        num = scanner.nextInt();
        
         while((num<1)||(num>20)){
            System.out.println("Ingresar numero dentro del rango");
            num = scanner.nextInt();
        }
        for (int i = 0; i < nam; i++) {
            if (vec[i]==num) {
                cont++;
            }
       
        }
 
        System.out.println("El numero " + num + " se prite "   + cont + " veces");
        }
}
    

    
   
