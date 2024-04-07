package com.example;

public class Paciente implements Comparable<Paciente> {
    String nombre;
    String sintoma;
    char codigo;

    public Paciente(String nombre, String sintoma, char codigo){
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getSintoma() {
        return sintoma;
    }

    public char getCodigo() {
        return codigo;
    }

    @Override
    public int compareTo(Paciente otro) {
        return Character.compare(this.codigo, otro.getCodigo());
    }

    @Override
    public String toString() {
        return nombre + ", " + sintoma + ", " + codigo;
    }
}