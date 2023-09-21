/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglosyvectores;

import java.util.Scanner;

/**
 *
 * @author estar
 */
public class Ejercicio14Guia {

    /*Utilizando un Bucle for, aloja en el vector Equipo,
    los nombres de tus compañeros de equipo
     */
    public static void main(String[] args) {
         //creo la variable con scanner para luego poder imprimir el vector
        Scanner scanner = new Scanner(System.in);
        //creo un vector llamado equipo tipo string
        
        System.out.println("Igrese el numero de personas: ");
        int num = scanner.nextInt();
        String equipo[] = new String[num];
        //para llenar el vector realizamos un ciclo for
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Igrese el nombre del, o la integrante del equipo" + i + ": ");
            equipo[i] = scanner.next();
        }
        System.out.println("El vector es");
        for (int i = 0;i<equipo.length ;i++) {
            System.out.println("[" + equipo[i] + "]"+ " ");
    }
    
        
    }
}
