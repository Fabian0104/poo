import javax.swing.JOptionPane;

import model.Correo;
import model.Password;

public class App {
    public static void main(String[] args) throws Exception {

        String nombre = JOptionPane.showInputDialog("Cual es su nombre?");
        String apellido = JOptionPane.showInputDialog("Cual es su apellido?");
        String compania = JOptionPane.showInputDialog("A que compañia pertenece?");
        
        Password password = new Password(12);
        Correo correo = new Correo(nombre, apellido, compania, password.getContrasenia());

        System.out.println(correo);


        /* String texto = JOptionPane.showInputDialog("Introduce un tamaño para el array");
        int tamanio = Integer.parseInt(texto);

        texto = JOptionPane.showInputDialog("Introduce la longitud del password");
        int longitud = Integer.parseInt(texto);

        Password listaPasswords[] = new Password[tamanio];
        boolean fortalezaPassword[] = new boolean[tamanio];

        for (int i = 0; i < listaPasswords.length; i++) {
            listaPasswords[i] = new Password(longitud);
            fortalezaPassword[i] = listaPasswords[i].esFuerte();
            System.out.println(listaPasswords[i].getContrasenia() + " " + fortalezaPassword[i]);
        } */

    }
}
