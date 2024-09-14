package Clase_4;

public class Creacion {

    public static void main(String[] args) {

        Vehiculo objvehiculo = new Vehiculo();

        objvehiculo.Ingresar("Ferrari","Desel");

        System.out.println("Registro finalizado");
        System.out.println("Marca del vehiculo: "+objvehiculo.getMarca());
        System.out.println("Marca combustible:"+objvehiculo.getCombustible());



    }

}
