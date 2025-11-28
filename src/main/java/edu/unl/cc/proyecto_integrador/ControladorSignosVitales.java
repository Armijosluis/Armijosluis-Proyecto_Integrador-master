package edu.unl.cc.proyecto_integrador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author armij
 */

public class ControladorSignosVitales {

    private List<RegistroSignos> registros;

    public ControladorSignosVitales() {
        registros = new ArrayList<>();
    }

    public void registrar(Paciente p, SignosVitales s) {
        registros.add(new RegistroSignos(p, s));
    }

    public List<RegistroSignos> listar() {
        return registros;
    }

    public List<RegistroSignos> buscarPorCedula(String cedula) {
        List<RegistroSignos> resultado = new ArrayList<>();
        for (RegistroSignos r : registros) {
            if (r.getPaciente().getCedula().equals(cedula)) {
                resultado.add(r);
            }
        }
        return resultado;
    }
}
