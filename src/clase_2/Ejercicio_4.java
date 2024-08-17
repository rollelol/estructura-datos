package clase_2;
import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso en (kg)");
        int peso = sc.nextInt();



        System.out.println("Ingrese su altura");
        float altura = sc.nextFloat();

        float IMC = peso / (altura * altura);

         if (IMC < 18.5){
             System.out.println("Bajo peso");
         }
         else if (IMC >= 25 & IMC <=30){
             System.out.println("Sobre peso");
         }
         else {
             System.out.println("Obesidad");
         }



    }

}
