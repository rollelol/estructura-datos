package Clase_3;
import java.util.Scanner;

public class Ciclos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        System.out.println("Ingrese Maximo de boletos");
        int max = sc.nextInt();
        int opc;

        int contador = 0;

        do{

            System.out.println("Ingrese el nombre del boleto");
            System.out.println("1. Cine");
            System.out.println("2. Parque diversiones");
            System.out.println("3. Salir");
            opc = sc.nextInt();


            switch (opc){

                case 1:
                    System.out.println("Registro de boleto");
                    System.out.println("Ha registado un boleto cine:"+suma);
                    System.out.println("recuento"+contador);
                    suma += 1;
                    contador +=1;
                    break;



                case 2:
                    System.out.println("Registro de boleto Parque diversiones");
                    System.out.println("Ha registado un boleto parque diversiones:"+suma);
                    System.out.println("recuento"+contador);
                    suma += 1;
                    contador +=1;
                    break;

                case 3:
                    System.out.println("Gracias por usar el servicio ");
                    break;

                default:
                    System.out.println("Ingrese un boleto valido");
            }


        }while(opc !=3 && contador < max);



    }

}
