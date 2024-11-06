/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionfinal;

/**
 *
 * @author tello
 */
public class Vendedor extends Trabajador {
    private double comision;
    private int ventasRealizadas;

    public Vendedor(String nombre, int edad, double salarioBase, double comision) {
        super(nombre, edad, salarioBase);
        this.comision = comision;
        this.ventasRealizadas = 0;
    }

    public void realizarVenta() {
        ventasRealizadas++;
    }

    public double calcularSalario() {
        return salarioBase + (comision * ventasRealizadas);
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Comisión por venta: " + comision);
        System.out.println("Ventas realizadas: " + ventasRealizadas);
        System.out.println("Salario Total: " + calcularSalario());
    }
}
