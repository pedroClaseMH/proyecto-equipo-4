/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hoja_01_Strings;

/**
 *
 * @author daw1
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String codigoSucio = " ID-3 76 -P RIMe ";
        String codigoLimpio = "";
        
        
        codigoLimpio = codigoSucio.trim().replace(" ", "").toUpperCase();

        
        
        System.out.println("Codigo final normalizado: " + codigoLimpio);
        System.out.println("Longitud del codigo: " + codigoLimpio.length());
    }
}
