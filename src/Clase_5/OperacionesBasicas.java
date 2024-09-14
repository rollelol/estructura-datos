package Clase_5;

public class OperacionesBasicas {
    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        System.out.println("Suma: " + realizarOperacion(num1, num2, "suma"));
        System.out.println("Resta: " + realizarOperacion(num1, num2, "resta"));
        System.out.println("Multiplicación: " + realizarOperacion(num1, num2, "multiplicacion"));
        System.out.println("División: " + realizarOperacion(num1, num2, "division"));
    }

    public static double realizarOperacion(double num1, double num2, String operacion) {
        switch (operacion.toLowerCase()) {
            case "suma":
                return num1 + num2;
            case "resta":
                return num1 - num2;
            case "multiplicacion":
                return num1 * num2;
            case "division":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return 0;
                }
            default:
                System.out.println("Operación no válida.");
                return 0;
        }
    }
}
