/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_integrador;

/**
 *
 * @author armij
 */
public class SignosVitales {

    private double peso;
    private double altura;
    private int frecuenciaCardiaca;
    private String presionArterial;
    private int saturacion;

    public SignosVitales(double peso, double altura, int frecuenciaCardiaca, String presionArterial, int saturacion) {
        this.peso = peso;
        this.altura = altura;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.presionArterial = presionArterial;
        this.saturacion = saturacion;
    }

    @Override
    public String toString() {
        return "Peso: " + peso +
                " | Altura: " + altura +
                " | Frecuencia Cardiaca: " + frecuenciaCardiaca +
                " | Presion: " + presionArterial +
                " | Saturacion O2: " + saturacion + "%";
    }
}
