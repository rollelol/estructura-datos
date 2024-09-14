package Clase_4;

public class Vehiculo {

    public String getMarca() {
        return Marca;
    }


    public String getCombustible() {
        return Combustible;
    }



    private String Marca;
    private String Combustible;

    public void Ingresar(String _Marca, String _Combustible){

        Marca=_Marca;
        Combustible=_Combustible;

    }


}
