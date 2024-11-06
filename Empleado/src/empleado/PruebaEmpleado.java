/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author tello
 */
public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear dos instancias de Empleado
        Empleado empleado1 = new Empleado("Fredy", "Vasquez", 3000.00);
        Empleado empleado2 = new Empleado("Leonel", "Robles", 2500.00);

        // Mostrar el salario anual de cada Empleado
        System.out.printf("Salario anual de %s %s: Q%.2f%n", empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioAnual());
        System.out.printf("Salario anual de %s %s: Q%.2f%n", empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioAnual());

        // Proporcionar un aumento del 10% a cada Empleado
        empleado1.aplicarAumento();
        empleado2.aplicarAumento();

        // Mostrar el salario anual de cada Empleado después del aumento
        System.out.printf("%nDespues del aumento del 10%%%n");
        System.out.printf("Salario anual de %s %s: Q%.2f%n", empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioAnual());
        System.out.printf("Salario anual de %s %s: Q%.2f%n", empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioAnual());
    }
}

