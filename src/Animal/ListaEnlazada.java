package Animal;

public class ListaEnlazada {

        private Nodo cabeza;

        public ListaEnlazada() {
            this.cabeza = null;
        }

        public void agregar(Animal animal) {
            if (!contiene(animal)) {
                Nodo nuevoNodo = new Nodo(animal);
                if (cabeza == null) {
                    cabeza = nuevoNodo;
                } else {
                    Nodo temp = cabeza;
                    while (temp.siguiente != null) {
                        temp = temp.siguiente;
                    }
                    temp.siguiente = nuevoNodo;
                }
            } else {
                System.out.println("El animal ya está en la lista: " + animal.getNombre());
            }
        }

        private boolean contiene(Animal animal) {
            Nodo temp = cabeza;
            while (temp != null) {
                if (temp.animal.equals(animal)) {
                    return true;
                }
                temp = temp.siguiente;
            }
            return false;
        }

        // Mostrar la lista usando un bucle
        public void mostrarConBucle() {
            Nodo temp = cabeza;
            while (temp != null) {
                System.out.println(temp.animal);
                temp = temp.siguiente;
            }
        }

        public void mostrarConRecursion() {
            mostrarRecursivo(cabeza);
        }

        private void mostrarRecursivo(Nodo nodo) {
            if (nodo != null) {
                System.out.println(nodo.animal);
                mostrarRecursivo(nodo.siguiente);
            }
        }



}
