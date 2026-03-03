/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas;

/**
 *
 * @author DAW101
 */
import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Cuántos clientes quieres crear? ");
        int n = entrada.nextInt();
        entrada.nextLine();
        
        Cliente[] clientes = new Cliente[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Cliente " + (i + 1));
            
            System.out.println("Nombre: ");
            String nombre = entrada.nextLine();
            
            System.out.println("Apellidos: ");
            String apellidos = entrada.nextLine();
            
            System.out.println("Teléfono: ");
            String telefono = entrada.nextLine();
            
            System.out.println("Saldo: ");
            double saldo = entrada.nextDouble();
            entrada.nextLine();
            
            clientes[i] = new Cliente(nombre, apellidos, telefono, saldo);
        }
        

        System.out.println("LISTA DE CLIENTES");
        for (Cliente c : clientes) {
            System.out.println(c);
        }
        
        System.out.println("Total de clientes creados: " + Cliente.getContador());
        
        entrada.close();
    }
}