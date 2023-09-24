package com.poo.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
    // Atributos
    private Integer id;
    private String nombre;
    private Integer edad;
    private String sexo;
    private LocalDate fechaNacimiento;
    private boolean esAdulto;

    // Constructor Vacio
    public Persona() {
    }

    /**
     * Construtor de persona
     * @param id de la persona
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     * @param fechaNacimiento de la persona
     * @param esAdulto se obtiene en base a la fecha de nacimiento
     */
    public Persona(Integer id, String nombre, String sexo, String fechaNacimiento, boolean esAdulto) {
        this.id = id;
        this.nombre = nombre;
        this.edad = calcularEdad(fechaNacimiento);
        this.sexo = sexo;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.esAdulto = esAdulto;
    }

    // Getters & Setters

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEsAdulto() {
        return esAdulto;
    }

    public void setEsAdulto(boolean esAdulto) {
        this.esAdulto = esAdulto;
    }

    // HashCode & Equals

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    // ToString

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", fechaNacimiento="
                + fechaNacimiento + ", esAdulto=" + esAdulto + "]";
    }

    // Metodos
    public int calcularEdad(String fechaNac){
        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaNacLocal = LocalDate.parse(fechaNac, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        int edad = fechaActual.getYear() - fechaNacLocal.getYear();

        if (
            fechaNacLocal.getMonthValue() > fechaActual.getMonthValue() || 
            (
                fechaNacLocal.getMonthValue() == fechaActual.getMonthValue() &&
                fechaNacLocal.getDayOfMonth() > fechaActual.getDayOfMonth()
            )
        ) {
            edad--;
        }
        return edad;
    }

}

