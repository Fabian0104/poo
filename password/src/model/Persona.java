package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private Integer edad;
    private String sexo;
    private LocalDate fechaNacimiento;

    // Constructor Vacio
    public Persona() {
    }

    /**
     * Construtor de persona
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     * @param fechaNacimiento de la persona
     * @param esAdulto se obtiene en base a la fecha de nacimiento
     */
    public Persona(String nombre, String apellido, String sexo, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = calcularEdad(fechaNacimiento);
        this.sexo = sexo;
        this.fechaNacimiento = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    // Getters & Setters

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
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

    // ToString

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", fechaNacimiento="
                + fechaNacimiento + "]";
    }

    // Metodos
    private int calcularEdad(String fechaNac){
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
