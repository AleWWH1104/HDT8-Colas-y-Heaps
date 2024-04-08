package com.example;

/**
 * Clase que representa a un paciente en el sistema de atención médica de un hospital de emergencias.
 */
public class Paciente implements Comparable<Paciente> {
    String nombre;
    String sintoma;
    char codigo;

    //Constructor que inicializa un objeto Paciente con los datos proporcionados.
    public Paciente(String nombre, String sintoma, char codigo){
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigo = codigo;
    }

    //Obtiene el nombre del paciente.
    public String getNombre(){
        return nombre;
    }

    //Obtiene la descripción del síntoma del paciente.
    public String getSintoma() {
        return sintoma;
    }

    //Obtiene el código de emergencia del paciente.
    public char getCodigo() {
        return codigo;
    }

    //Compara este paciente con otro paciente en función de su código
    @Override
    public int compareTo(Paciente otro) {
        return Character.compare(this.codigo, otro.getCodigo());
    }

    //Representación en cadena de texto
    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + codigo;
    }
}
