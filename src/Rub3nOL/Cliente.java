/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas;

/**
 *
 * @author DAW101
 */
public class Cliente {

    private String codigo;
    private String nombre;
    private String apellidos;
    private String telefono;
    private double saldo;
    private static int contador = 0;

    
    public Cliente(String nombre, String apellidos, String telefono, double saldo){
        this.codigo = String.format("CLI %03d", ++contador);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.saldo = saldo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cliente.contador = contador;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellidos=" + apellidos + ", telefono=" + telefono + ", saldo=" + saldo + '}';
    }
    
    

}
