/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factura;

/**
 *
 * @author tello
 */
public class Factura {
    // Variables de instancia
    private String numeroDePieza;
    private String descripcionDePieza;
    private int cantidad;
    private double precioPorArticulo;

    // Constructor que inicializa las cuatro variables de instancia
    public Factura(String numeroDePieza, String descripcionDePieza, int cantidad, double precioPorArticulo) {
        this.numeroDePieza = numeroDePieza;
        this.descripcionDePieza = descripcionDePieza;
        setCantidad(cantidad);  // Usamos el setter para validar
        setPrecioPorArticulo(precioPorArticulo);  // Usamos el setter para validar
    }

    // Métodos establecer y obtener para numeroDePieza
    public void setNumeroDePieza(String numeroDePieza) {
        this.numeroDePieza = numeroDePieza;
    }

    public String getNumeroDePieza() {
        return numeroDePieza;
    }

    // Métodos establecer y obtener para descripcionDePieza
    public void setDescripcionDePieza(String descripcionDePieza) {
        this.descripcionDePieza = descripcionDePieza;
    }

    public String getDescripcionDePieza() {
        return descripcionDePieza;
    }

    // Métodos establecer y obtener para cantidad
    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    // Métodos establecer y obtener para precioPorArticulo
    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo > 0) {
            this.precioPorArticulo = precioPorArticulo;
        } else {
            this.precioPorArticulo = 0.0;
        }
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    // Método para calcular el monto de la factura
    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}

