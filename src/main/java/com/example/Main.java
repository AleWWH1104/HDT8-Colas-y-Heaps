package com.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String ruta = "/Users/alejandraayala/Documents/Trabajos_UVG/Semestre 3/EstructuraDatos/HDT8-Colas-y-Heaps/src/main/java/com/example/pacientes.txt";
        VectorHeap<Paciente> priorityQueue = new VectorHeap<>();
        FileManager fileManager = new FileManager();
        List<Paciente> pacientes = fileManager.leerArchivo(ruta);
        
        for (Paciente paciente : pacientes) {
            priorityQueue.add(paciente);
        }

        // Atender pacientes según prioridad
        System.out.println("Orden de atención de pacientes:");
        while (!priorityQueue.isEmpty()) {
            Paciente paciente = priorityQueue.remove();  
            System.out.println(paciente);
            System.out.println("siguiente");
        }
    }
}
