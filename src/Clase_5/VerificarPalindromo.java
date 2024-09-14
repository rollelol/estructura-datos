package Clase_5;

public class VerificarPalindromo {
    public static void main(String[] args) {
        String palabra = "anilina";
        if (esPalindromo(palabra)) {
            System.out.println(palabra + " es un palíndromo.");
        } else {
            System.out.println(palabra + " no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String palabra) {
        String palabraLimpia = palabra.replaceAll("\\s+", "").toLowerCase(); // Quita espacios y convierte a minúsculas
        int longitud = palabraLimpia.length();

        for (int i = 0; i < longitud / 2; i++) {
            if (palabraLimpia.charAt(i) != palabraLimpia.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
