/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factura;

/**
 *
 * @author tello
 */
public class PruebaFactura {
    public static void main(String[] args) {
        // Crear una instancia de Factura
        Factura factura = new Factura("0012", "metro", 5, 35.75);

        // Mostrar detalles de la factura
        System.out.println("Numero de pieza: " + factura.getNumeroDePieza());
        System.out.println("Descripcion de la pieza: " + factura.getDescripcionDePieza());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por articulo: Q" + factura.getPrecioPorArticulo());
        System.out.println("Monto de la factura: Q" + factura.obtenerMontoFactura());

        // Modificar los valores y mostrar los detalles actualizados
        factura.setCantidad(3);
        factura.setPrecioPorArticulo(35.75);
        System.out.println("\nActualizacion de la factura:");
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio por articulo: Q" + factura.getPrecioPorArticulo());
        System.out.println("Monto de la factura: Q" + factura.obtenerMontoFactura());
    }
}

