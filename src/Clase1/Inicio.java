package Clase1;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args){

        int x = 22;

        Scanner sc = new Scanner (System.in);

        if(x >= 18){
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }


        System.out.println("Ingrese su nombre");
        String Nombre = sc.nextLine();

        System.out.println("Ingrese su edad ");
        int edad_=sc.nextInt();

        System.out.println("Su edad es  de "+edad_);


    }


}

