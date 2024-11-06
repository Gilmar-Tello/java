/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionfinal;

/**
 *
 * @author tello
 */
public class Piloto extends Trabajador {
    private int horasManejo;
    private String licencia;
    private double precioHora;

    public Piloto(String nombre, int edad, double salarioBase, String licencia, double tarifaPorHora) {
        super(nombre, edad, salarioBase);
        this.licencia = licencia;
        this.precioHora = tarifaPorHora;
        this.horasManejo = 0;
    }

    public void registrarViaje(int horas) {
        if (horas > 0) {
            horasManejo += horas;
        }
    }

    public double calcularSalario() {
        return salarioBase + (horasManejo * precioHora);
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Licencia: " + licencia);
        System.out.println("Horas de manejo: " + horasManejo);
        System.out.println("Tarifa por hora: " + precioHora);
        System.out.println("Salario Total: " + calcularSalario());
    }
}
