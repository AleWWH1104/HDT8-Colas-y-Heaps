package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase FileManager que se encarga de leer un archivo de texto con información de pacientes y crear objetos Paciente a partir de los datos leídos.
 */
public class FileManager {

    //Lee un archivo de texto con información de pacientes y devuelve una lista de objetos Paciente.
    public List<Paciente> leerArchivo(String nombreArchivo) {
        List<Paciente> pacientes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 3) {
                    String nombre = datos[0].trim();
                    String sintoma = datos[1].trim();
                    char codigo = datos[2].trim().charAt(0);
                    Paciente paciente = new Paciente(nombre, sintoma, codigo);
                    pacientes.add(paciente);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
        return pacientes;
    }
}

