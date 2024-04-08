# HDT8-Colas-y-Heaps

# Hospital Emergency System

Este proyecto implementa un sistema de atención de pacientes para un hospital de emergencias utilizando una cola de prioridad basada en un Heap implementado con un Vector en Java.

## Estructura del proyecto

- `src/main/java/com/example/`: Contiene las clases Java del proyecto.
  - `Paciente.java`: Clase que representa a un paciente en el sistema de atención médica.
  - `VectorHeap.java`: Implementación de un Heap utilizando un Vector como estructura subyacente.
  - `IPriorityQueue.java`: Interfaz que define los métodos básicos que debe tener una cola de prioridad.
  - `FileManager.java`: Clase que se encarga de leer un archivo de texto con información de pacientes.
  - `Main.java`: Clase principal que gestiona el sistema de atención de pacientes en el hospital de emergencias.

## Uso del proyecto

1. **Archivo de pacientes**: El sistema lee un archivo de texto con información de pacientes. Cada línea del archivo debe tener el siguiente formato: `nombre, sintoma, codigo`.
2. **Ejecución**: Ejecuta la clase `Main.java` para iniciar el sistema. Asegúrate de proporcionar la ruta correcta al archivo de pacientes.
3. **Atención de pacientes**: El sistema atiende a los pacientes según su código de emergencia utilizando un Heap implementado con un Vector y la PriorityQueue del Java Collection Framework.
4. **Pruebas unitarias**: Se incluyen pruebas unitarias para los métodos de agregar y retirar pacientes del Heap.

# Referencia para el VectorHeap
Modulos en Canvas: https://cdn.inst-fs-iad-prod.inscloudgate.net/22c73164-00c2-4cfc-9862-ecf6d66506c3/VectorHeap.java?token=eyJhbGciOiJIUzUxMiIsInR5cCI6IkpXVCIsImtpZCI6ImNkbiJ9.eyJyZXNvdXJjZSI6Ii8yMmM3MzE2NC0wMGMyLTRjZmMtOTg2Mi1lY2Y2ZDY2NTA2YzMvVmVjdG9ySGVhcC5qYXZhIiwidGVuYW50IjoiY2FudmFzIiwidXNlcl9pZCI6IjExMTQwMDAwMDAwMDAyNzYyMyIsImlhdCI6MTcxMjU4MDI1MiwiZXhwIjoxNzEyNjY2NjUyfQ.1Nh26C5cqJPde_HxgRy_CcOYkpGl1uzxOj71jtN3eTqylGzzTmBoBHyHG0udl-N9t9OwouqAX2C_1WyrHniwqg&content_type=text%2Fx-java-source 