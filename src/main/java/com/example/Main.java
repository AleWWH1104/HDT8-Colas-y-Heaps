package com.example;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Clase principal que gestiona el sistema de atención de pacientes en un hospital de emergencias.
 */
public class Main {
    public static void main(String[] args) {
        // Ruta del archivo de pacientes
        String ruta = "/Users/alejandraayala/Documents/Trabajos_UVG/Semestre 3/EstructuraDatos/HDT8-Colas-y-Heaps/src/main/java/com/example/pacientes.txt";
        
        // Crear un FileManager para leer el archivo
        FileManager fileManager = new FileManager();
        List<Paciente> pacientes = fileManager.leerArchivo(ruta);
        
        // Crear una cola de pacientes con VectorHeap
        VectorHeap<Paciente> colaPacientes = new VectorHeap<>();
        
        // Agregar pacientes a la cola
        for (Paciente paciente : pacientes) {
            colaPacientes.add(paciente);
        }

         // Atender pacientes según prioridad utilizando VectorHeap
        System.out.println("Implementacion VectorHeap");
        System.out.println("Orden de atención de pacientes:");
        while (!colaPacientes.isEmpty()) {
            Paciente paciente = colaPacientes.remove();  
            System.out.println("Paciente atendido" + paciente);
            System.out.println("siguiente");
        }
        if (colaPacientes.isEmpty()){
            System.out.println("Lista completada");
        }

        // Atender pacientes según prioridad utilizando Java Collection Framework
        System.out.println("Java Collection Framework");
        PriorityQueue<Paciente> colaPacientes2 = new PriorityQueue<>(pacientes);
        System.out.println("Orden de atención de pacientes:");
        while (!colaPacientes2.isEmpty()) {
            Paciente pacienteAtendido = colaPacientes2.poll();
            System.out.println(pacienteAtendido);
        }
    }
}
