package clase_2;
import java.util.Scanner;
public class Ejercicio_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvendo al programa");

        System.out.println("Ingrese un numero");
        int Numero = sc.nextInt();

        if (Numero %2 == 0){

            System.out.println("Es par");

        }
        else {
            System.out.println("Es impar");
        }

    }

}
