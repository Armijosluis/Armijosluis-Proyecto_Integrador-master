package edu.unl.cc.proyecto_integrador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author armij
 */

public class RegistroSignos {

    private Paciente paciente;
    private SignosVitales signos;
    private LocalDateTime fecha;

    public RegistroSignos(Paciente paciente, SignosVitales signos) {
        this.paciente = paciente;
        this.signos = signos;
        this.fecha = LocalDateTime.now();
    }

    public Paciente getPaciente() { return paciente; }
    public SignosVitales getSignos() { return signos; }
    public LocalDateTime getFecha() { return fecha; }

    @Override
    public String toString() {
        return "Registro [" + fecha + "]\n" +
                paciente + "\n" +
                signos;
    }
}
