/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subprogramaguiadeejercicios;

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
          Scanner leer = new Scanner(System.in);    
          System.out.println("ingrese el numero 1"); 
          int num1 = leer.nextInt();  
          System.out.println("ingrese el numero 2");      
          int num2 = leer.nextInt();    
          
          System.out.println("Ingrese la operacion: 1 (Suma), 2 (Resta), 3(Mult), 4(Divis)");     
          int respuesta = leer.nextInt(); 
          
          switch (respuesta){  
              case 1:       
                  int retorno1 = sumar(num1, num2); 
                  System.out.println("La suma de ambos es: " + retorno1);   
                  break;      
              case 2:      
                  int retorno2 = restar(num1, num2);   
                  System.out.println("La resta de ambos es: " + retorno2); 
                  break;  
              case 3:  
                      int retorno3 = multiplicar(num1, num2); 
                      System.out.println("La multipl de ambos es: " + retorno3);      
                      break;
              case 4:
                  double retorno4 = (double) dividir(num1, num2);   
                      System.out.println("La division de ambos es: " + retorno4); 
                      break;  
          }  
    }     public static int sumar(int num1, int num2) {
        
        int suma = num1 + num2;   
        return suma; 
    }   
    public static int restar(int num1, int num2) {    
        int resta = num1 - num2;  
        return resta; }   
    
    public static int multiplicar(int num1, int num2) {  
        int multiplicacion = num1 * num2;
        return multiplicacion; }   
    
    public static double dividir(double num1, double num2) {  
        double division = num1 / num2; 
        return division;
    }
}