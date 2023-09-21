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
public class Condicionales2Swicht2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // definir una variable tipo entera
        int opinion;
        String frase = "";
        Scanner leer = new Scanner(System.in);
        System.out.println("Califique la peli de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        
        if (opinion >= 1 && opinion <= 5) {
            switch (opinion){
                case 1 -> frase = "Nos sentimos apenados que no disfrutara la pelicula";
                case 2 -> frase = "Nos sentimos apenados que no disfrutara la pelicula";
                                 
                case 3 -> frase = "Has calificado la peli como buena";
                    
                case 4 -> frase = "Has calificado la peli como muy buena"); 
                    
                case 5 -> frase = "fantastico uqe le gustara");
                  
                    
           
                                
                    
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

    }
    
}
