/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prueba;

/**
 *
 * @author DAW108
 */
public class Bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       boolean start = true;
       int contador = 1;
       final double SALIDA = 3.14159;
       
       //PRUEBA
//       while (true){
//           int num;
//           num = (int)(Math.random()*10);
//           System.out.println("Numero actual:" +num);
//           
//           if (num != 3){
//               ++contador;
//           } else {
//               System.out.println("Salio el numero 3 en " +contador +" intentos :D");
//               return;
//           }
//       }

        while (true){
           double num;
           
           num = Math.random()*10; //la cantidad de numeros de la parte entera (random unicamente te devuelve numeros entre 0.00 y 0.99)
           num = Math.round(num * 100000.0)/100000.0; //la cantidad de decimales del numero que quiero que salga
           System.out.println("Numero actual:" +num);
           
           if (num != SALIDA){
               ++contador;
           } else {
               System.out.println("Salio el numero " +SALIDA+ " en " +contador +" intentos :D");
               return;
           }
       }
       
    }
    
}
