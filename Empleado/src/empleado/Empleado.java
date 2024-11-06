/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author tello
 */
public class Empleado {
    // Variables de instancia
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // Constructor que inicializa las tres variables de instancia
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        setSalarioMensual(salarioMensual);  // Usamos el setter para validar
    }

    // Métodos establecer y obtener para primerNombre
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    // Métodos establecer y obtener para apellidoPaterno
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    // Métodos establecer y obtener para salarioMensual
    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual > 0) {
            this.salarioMensual = salarioMensual;
        } else {
            this.salarioMensual = 0.0;
        }
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    // Método para calcular el salario anual
    public double getSalarioAnual() {
        return salarioMensual * 12;
    }

    // Método para aplicar un aumento del 10%
    public void aplicarAumento() {
        salarioMensual *= 1.10;
    }
}

