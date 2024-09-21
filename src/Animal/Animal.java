package Animal;

public class Animal {

        private String nombre;
        private int edad;
        private String tipo;
        public Animal(String nombre, int edad, String tipo) {
            this.nombre = nombre;
            this.edad = edad;
            this.tipo = tipo;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public String getTipo() {
            return tipo;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Animal animal = (Animal) obj;
            return nombre.equals(animal.nombre) && tipo.equals(animal.tipo);
        }

        @Override
        public String toString() {
            return "Animal: " + nombre + ", Edad: " + edad + ", Tipo: " + tipo;
        }




}
