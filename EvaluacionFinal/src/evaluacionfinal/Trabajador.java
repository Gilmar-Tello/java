/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionfinal;

/**
 *
 * @author tello
 */
public class Trabajador {
    protected String nombre;
    protected int edad;
    protected double salarioBase;

    public Trabajador(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario Base: " + salarioBase);
    }

    public double calcularSalario() {
        return salarioBase;
    }
}
