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
public class ejercicioBuscarVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vector[] = new int[30];
        int vec[]=new int[vector.length];
        int num;
        for (int i = 0; i < vector.length; i++) {
            vector[i]= (int) (Math.random()*20+1);
            int c =1;
            boolean cont = false;
            int e=0,d =0;
            
       while((!cont)&&(d<e)){
                if(vector[i]== vec[d]){
                    cont=true;
                }
               d++; 
                
            }
            if(!cont){
            for (int j = 0; j < vector.length; j++) {
                if (j!=i){
                    if(vector[i]==vector[j]){
                        c++;
                    }
                     
                }
                 System.out.println("  el " + vector[i] + " se repite " + c + " veces");
            System.out.println("Ingrese un numero");
                     num = scanner.nextInt();
                if (num!=vector[i] && num!=vector[j]) {
                         
                         System.out.println(num + "se repite " +vector[i]+ " veces " + c);
            }
             
        }
       
      
        
                }
                
            
            
        
        

     

    


