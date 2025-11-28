/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_integrador;

/**
 *
 * @author armij
 */
public class Paciente extends Persona {

    private int edad;

    public Paciente(String nombre, String cedula, int edad) {
        super(nombre, cedula);
        this.edad = edad;
    }

    public int getEdad() { return edad; }

    @Override
    public String getTipo() {
        return "Paciente";
    }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " | Cedula: " + cedula + " | Edad: " + edad;
    }
}
