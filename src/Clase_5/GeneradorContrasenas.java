package Clase_5;

import java.util.Random;

public class GeneradorContrasenas {

    public static void main(String[] args) {
        int longitud = 12;
        String contrasena = generarContrasenaAleatoria(longitud);
        System.out.println("Contraseña generada: " + contrasena);
    }

    public static String generarContrasenaAleatoria(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=<>?";
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();

        for (int i = 0; i < longitud; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasena.append(caracteres.charAt(indice));
        }

        return contrasena.toString();
    }
}
