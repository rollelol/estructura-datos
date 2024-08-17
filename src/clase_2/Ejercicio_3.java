package clase_2;
import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese ( + ) para sumar");
        System.out.println("Ingrese ( - ) para sumar");
        System.out.println("Ingrese ( / ) para sumar");
        System.out.println("Ingrese ( * ) para sumar");
        String Opcion = sc.nextLine();

        int Numero1 = 0;
        int Numero2 = 0;


        if (Opcion.equals("+")){
            System.out.println("Ingrese un numero");
             Numero1 = sc.nextInt();

            System.out.println("Ingrese un numero");
            Numero2 = sc.nextInt();

            int Resultado = Numero1 + Numero2;

            System.out.println("El resultado de la suma es de :"+Resultado);


        }
        else if (Opcion.equals("-")){

            System.out.println("Ingrese un numero");
             Numero1 = sc.nextInt();

            System.out.println("Ingrese un numero");
             Numero2 = sc.nextInt();

            int Resultado2 = Numero1 - Numero2;

            System.out.println("El resultado de la resta es de :"+Resultado2);


        }
        else if (Opcion.equals("/")){

            System.out.println("Ingrese un numero");
            Numero1 = sc.nextInt();

            System.out.println("Ingrese un numero");
            Numero2 = sc.nextInt();

            if (Numero2 == 0){
                System.out.println("No pueder dividir por cero");
            }

            int Resultado3 = Numero1 / Numero2;

            System.out.println("El resultado de la resta es de :"+Resultado3);

        }
        else if (Opcion.equals("*")){

            System.out.println("Ingrese un numero");
            Numero1 = sc.nextInt();

            System.out.println("Ingrese un numero");
            Numero2 = sc.nextInt();

            int Resultado4 = Numero1 * Numero2;

            System.out.println("El resultado de la multiplicacion es de :"+Resultado4);

        }
        else {
            System.out.println("-..................error.............");
        }


    }

}
