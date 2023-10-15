package model;

public class Password {

    //Atributos

    private final static int LONG_DEF = 8;
    private int longitud;
    private String contrasenia;


    // Getters & Setter

    public int getLongitud() {
        return longitud;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    
    // Constructores
    public Password() {
        this(LONG_DEF);
    }

    public Password(int longitud){
        this.longitud = longitud;
        this.contrasenia = generaContrasenia();
    }


    //Metodos
    public String generaContrasenia(){
        String password = "";

        for (int i = 0; i < longitud; i++) {
            int eleccion = ((int)Math.floor(Math.random()*3+1));
            char character;

            if (eleccion == 1) {
                //Se asigna una letra minuscula
                character = (char)((int)Math.floor(Math.random()*(26)+97));
            } else if(eleccion == 2) {
                //Se asigna una letra mayuscula
                character = (char)((int)Math.floor(Math.random()*(26)+65));
            } else {
                //Se asigna una numero
                character = (char)((int)Math.floor(Math.random()*(10)+48));
            }
            password += character;
        }
        return password;
    }

    public boolean esFuerte(){
        int cuentaNumero = 0;
        int cuentaMinusculas = 0;
        int cuentaMayusculas = 0;

        for (int i = 0; i < contrasenia.length(); i++) {
            if (contrasenia.charAt(i) >= 97 && contrasenia.charAt(i) <= 122) {
                cuentaMinusculas += 1;
            } else if (contrasenia.charAt(i) >= 65 && contrasenia.charAt(i) <= 90) {
                cuentaMayusculas += 1;
            } else {
                cuentaNumero += 1;
            }
        }

        return (cuentaNumero > 4 && cuentaMinusculas > 0 && cuentaMayusculas > 1);
    }
}
