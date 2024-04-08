package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class VectorHeapTest {

    @Test
    public void testAddAndRemove() {
        VectorHeap<Paciente> colaPacientes = new VectorHeap<>();
        
        // Agregar pacientes a la cola
        Paciente paciente1 = new Paciente("Juan", "Fiebre", 'A');
        Paciente paciente2 = new Paciente("María", "Dolor de cabeza", 'B');
        Paciente paciente3 = new Paciente("Pedro", "Fractura", 'C');

        colaPacientes.add(paciente1);
        colaPacientes.add(paciente2);
        colaPacientes.add(paciente3);

        // Verificar que la cola no esté vacía
        assertFalse(colaPacientes.isEmpty());

        // Verificar el orden de atención
        assertEquals(paciente1, colaPacientes.remove());
        assertEquals(paciente2, colaPacientes.remove());
        assertEquals(paciente3, colaPacientes.remove());

        // Verificar que la cola esté vacía después de atender a todos los pacientes
        assertTrue(colaPacientes.isEmpty());
    }
}
