/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author estar
 */
public class CondicionalaesIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // definir una variable tipo entera
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Califique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion >= 1 && opinion <= 5) {
            switch (opinion){
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no disfrutara la pelicula");
                    break;              
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena"); 
                    break;
                case 5:   
                    System.out.println("fantastico uqe le gustara");
                    break;
                    
                    //El equivalente del caso de oro modo es (default)
                    /* default:
                       <acciones>
                       break;
                    */
                                
                    
            }
        } else if (opinion < 0){
            System.out.println("Una opinion negativa");
        } else if (opinion == 0){
            System.out.println("El valor " + opinion + " No es valido, y no se tomara en cuenta");
        } else {
            System.out.println(opinion + " Se te fue la mano");
        }
        
        System.out.println("See you later");
    }
    
}
