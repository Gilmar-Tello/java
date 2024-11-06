/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;
/**
 *
 * @author tello
 */
import java.util.Scanner;

public class PruebaCuenta {
    // el método main empieza la ejecución de la aplicación de Java
    public static void main(String args[]) {
        Cuenta cuenta1 = new Cuenta(50.00); // crea objeto Cuenta
        Scanner entrada = new Scanner(System.in);   
        int n;

        // muestra el saldo inicial de cuenta1
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());

        while (true) {
            System.out.println("Ingrese 1 para depositar");
            System.out.println("Ingrese 2 para retirar");
            System.out.println("Ingrese 0 para salir y mostrar los ultimos movimientos");
           
            n = entrada.nextInt();

            if (n == 0) {
                break;
            } else if (n == 1) {
                double montoDeposito;
                System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador
                montoDeposito = entrada.nextDouble(); // obtiene entrada del usuario
                System.out.printf("\nSumando %.2f al saldo de cuenta1\n\n", montoDeposito);
                cuenta1.depositar(montoDeposito); // suma al saldo de cuenta1
                System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
                System.out.println(" ");
            } else if (n == 2) {
                double montoRetiro;
                System.out.print("Escriba el monto a retirar para cuenta1: "); // indicador
                montoRetiro = entrada.nextDouble(); // obtiene entrada del usuario
                System.out.printf("\nRetirando %.2f del saldo de cuenta1\n\n", montoRetiro);
                cuenta1.retirar(montoRetiro);
                System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
                System.out.println(" ");
            } else {
                System.out.println("Error.");
            }
        }

        // muestra los saldos
        System.out.printf("Saldo de cuenta1 final: $%.2f\n", cuenta1.obtenerSaldo());

        // muestra los últimos dos movimientos
        cuenta1.verUltimosDosMovimientos();
    } // fin de main
} // fin de la clase PruebaCuenta
