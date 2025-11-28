/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unl.cc.proyecto_integrador;
import java.util.Scanner;
/**
 *
 * @author armij
 */
public class InterfazPrincipal {

    private ControladorSignosVitales controlador;
    private Scanner sc;

    public InterfazPrincipal() {
        controlador = new ControladorSignosVitales();
        sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        while (true) {
            System.out.println("\n--- SISTEMA DE SIGNOS VITALES ---");
            System.out.println("1. Registrar Paciente y Signos");
            System.out.println("2. Listar Registros");
            System.out.println("3. Buscar por Cedula");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1 -> registrar();
                case 2 -> listar();
                case 3 -> buscar();
                case 4 -> {
                    System.out.println("Saliendo...");
                    return;
                }
                default -> System.out.println("Opcion invalida.");
            }
        }
    }

    private void registrar() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Cedula: ");
        String cedula = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        Paciente p = new Paciente(nombre, cedula, edad);

  System.out.print("Peso: ");
double peso = Double.parseDouble(sc.nextLine());

System.out.print("Altura: ");
double altura = Double.parseDouble(sc.nextLine());

System.out.print("Frecuencia Cardiaca: ");
int fc = Integer.parseInt(sc.nextLine());

System.out.print("Presion Arterial: ");
String pa = sc.nextLine();

System.out.print("Saturacion O2: ");
int sat = Integer.parseInt(sc.nextLine());



        SignosVitales s = new SignosVitales(peso, altura, fc, pa, sat);

        controlador.registrar(p, s);
        System.out.println("Registro guardado correctamente.");
    }

    private void listar() {
        System.out.println("\n--- LISTA DE REGISTROS ---");
        for (RegistroSignos r : controlador.listar()) {
            System.out.println(r + "\n");
        }
    }

    private void buscar() {
        System.out.print("Ingrese la cedula: ");
        String cedula = sc.nextLine();

        var lista = controlador.buscarPorCedula(cedula);

        if (lista.isEmpty()) {
            System.out.println("No existen registros.");
        } else {
            lista.forEach(System.out::println);
        }
    }
}
