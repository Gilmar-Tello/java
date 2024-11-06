
package cuenta;

/**
 *
 * @author tello
 */
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
    private double saldo; // variable de instancia que almacena el saldo
    private List<String> mov; // lista para almacenar los movimientos

    // constructor
    public Cuenta(double saldoInicial) {
        // valida que saldoInicial sea mayor que 0.0;
        // si no lo es, saldo se inicializa con el valor predeterminado 0.0
        saldo = saldoInicial > 0.0 ? saldoInicial : 0.0;
        mov = new ArrayList<>();
        mov.add(String.format("Saldo inicial: $%.2f", saldo));
    } // fin del constructor de Cuenta

    // abona (suma) un monto a la cuenta
    public void depositar(double monto) {
        saldo += monto; // suma el monto al saldo
        mov.add(String.format("Deposito: $%.2f", monto));
    } // fin del método depositar

    // retira (resta) un monto de la cuenta
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto; // resta el monto al saldo
            mov.add(String.format("Retiro: $%.2f", monto));
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    } // fin del método retirar

    // devuelve el saldo de la cuenta
    public double obtenerSaldo() {
        return saldo; // proporciona el valor de saldo al método que hizo la llamada
    } // fin del método obtenerSaldo

    // muestra los últimos dos movimientos
    public void verUltimosDosMovimientos() {
        int size = mov.size();
        if (size >= 2) {
            System.out.println("Ultimos dos movimientos:");
            System.out.println(mov.get(size - 2));
            System.out.println(mov.get(size - 1));
        } else if (size == 1) {
            System.out.println("Ultimos dos movimientos:");
            System.out.println(mov.get(size - 1));
            System.out.println("No hay más movimientos.");
        } else {
            System.out.println("No hay movimientos registrados.");
        }
    } // fin del método verUltimosDosMovimientos
} // fin de la clase Cuenta
