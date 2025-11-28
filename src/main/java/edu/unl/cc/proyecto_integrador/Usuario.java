/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_integrador;

/**
 *
 * @author armij
 */
public class Usuario extends Persona {

    private String contrasena;

    public Usuario(String nombre, String cedula, String contrasena) {
        super(nombre, cedula);
        this.contrasena = contrasena;
    }

    public boolean autenticar(String u, String clave) {
        return this.nombre.equals(u) && this.contrasena.equals(clave);
    }

    @Override
    public String getTipo() {
        return "Usuario del Sistema";
    }

    @Override
    public String toString() {
        return "Usuario: " + nombre + " | Cedula: " + cedula;
    }
}
