/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacionfinal;

import java.util.ArrayList;

public class Empresa {

    static Iterable<String[]> obtenerRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private String nombreEmpresa;
    private String direccion;
    private String telefono;
    private ArrayList<Trabajador> trabajadores;

    public Empresa(String nombre, String direccion, String telefono) {
        this.nombreEmpresa = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.trabajadores = new ArrayList<>();
    }

    public void agregarTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
        System.out.println("Trabajador agregado: " + trabajador.getNombre());
    }
    
    public void removerTrabajador(Trabajador trabajador) {
        if (trabajadores.contains(trabajador)) {
            trabajadores.remove(trabajador);
            System.out.println("Trabajador removido: " + trabajador.getNombre());
        } else {
            System.out.println("Trabajador no encontrado en la empresa.");
        }
    }

    public void mostrarTrabajadores() {
        for (Trabajador trabajador : trabajadores) {
            trabajador.mostrarDatos();
        }
    }
}
