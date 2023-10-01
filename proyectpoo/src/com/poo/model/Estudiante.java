package com.poo.model;

public class Estudiante extends Persona {
    // Atributos
    private String escuela;
    private String curso;
    private int tetramestre;
    private int matricula;
    private double promedio;

    /* Constructor */
    public Estudiante(
        String nombre, String sexo, String fechaNacimiento,
        String escuela, String curso, int tetramestre, int matricula
        ){
        super(nombre, sexo, fechaNacimiento);
        this.escuela = escuela;
        this.curso = curso;
        this.tetramestre = tetramestre;
        this.matricula = matricula;
    }

    public String getEscuela() {
        return escuela;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getTetramestre() {
        return tetramestre;
    }
    public void setTetramestre(int tetramestre) {
        this.tetramestre = tetramestre;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }



    // ToString
    @Override
    public String toString(){
        return super.toString() + "\n" +
        "Estudiante [escuela = " + escuela + ", curso = " + curso + ", tetramestre = " + tetramestre + ", matricula = " + matricula + ", promedio = " + promedio + "]";
    }


}
