package clase_2;
import java.util.Scanner;
public class clase2_condiciones {

    public static void main (String[] args){

        System.out.println("Bienvenido a tu programa");
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese un numero 1:");
        int Num1 = sc.nextInt();

        System.out.println("Ingrese un numero 2:");
        int Num2 = sc.nextInt();

        System.out.println("Ingrese un numero 3:");
        int Num3 = sc.nextInt();


        if (Num1 > Num2 & Num1 > Num3){
            System.out.println("El numero 1 es mayor ");
        }
        else if (Num2 > Num1 & Num2 > Num3){
            System.out.println("El numero 2 es mayor");
        }
        else if (Num3>Num1 & Num3 > Num2){
            System.out.println("El numero 3 es mayor ");
        }
        else {
            System.out.println("error-------------------");
        }


    }

}
