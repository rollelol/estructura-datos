package Animal;

public class Main {


        public static void main(String[] args) {
            ListaEnlazada listaAnimales = new ListaEnlazada();

            Animal aguila = new Animal("Águila", 5, "Ave");
            Animal pantera = new Animal("Pantera", 7, "Felino");
            Animal vaca = new Animal("Vaca", 4, "Mamífero");

            listaAnimales.agregar(aguila);
            listaAnimales.agregar(pantera);
            listaAnimales.agregar(vaca);
            listaAnimales.agregar(aguila);

            System.out.println("\nMostrar animales con bucle:");
            listaAnimales.mostrarConBucle();

            System.out.println("\nMostrar animales con recursión:");
            listaAnimales.mostrarConRecursion();
        }



}
