package Clase_5;

public class ConversionTemperatura {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = convertirCelsiusAFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
    }

    public static double convertirCelsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
