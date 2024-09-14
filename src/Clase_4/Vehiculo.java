package Clase_4;

public class Vehiculo {

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getCombustible() {
        return Combustible;
    }

    public void setCombustible(String combustible) {
        Combustible = combustible;
    }

    private String Marca;
    private String Combustible;

    public void Ingresar(String _Marca, String _Combustible){

        Marca=_Marca;
        Combustible=_Combustible;

    }


}
