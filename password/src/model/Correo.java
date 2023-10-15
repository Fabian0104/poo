package model;

public class Correo extends Persona {

    private String direccion;
    private String compania;
    private String password;

    public Correo (String nombre, String apellido, String compania, String password) {
        super();
        this.direccion = generarCuenta(nombre, apellido, compania);
        this.compania = compania;
        this.password = password;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Metodos
    public String generarCuenta(String nombre, String apellido, String compania) {
        String cuenta = nombre + "." + apellido + "@" + compania + ".com";
        return cuenta.toLowerCase();
    }

    @Override
    public String toString() {
        return "Correo [direccion=" + direccion + ", password=" + password + "]";
    }

    
    
}
