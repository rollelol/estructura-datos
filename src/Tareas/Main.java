package Tareas;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ListaTareas lista = new ListaTareas();


        lista.agregarTarea("Tarea 1", 2, LocalDate.of(2024, 9, 30));
        lista.agregarTarea("Tarea 2", 1, LocalDate.of(2024, 9, 25));
        lista.agregarTarea("Tarea 3", 3, LocalDate.of(2024, 10, 5));
        lista.agregarTarea("Tarea 4", 1, LocalDate.of(2024, 9, 27));


        System.out.println("Tareas actuales:");
        lista.mostrarTareas();


        System.out.println("\nBuscar 'Tarea 2':");
        Tarea encontrada = lista.buscarTarea("Tarea 2");
        if (encontrada != null) {
            System.out.println(encontrada);
        } else {
            System.out.println("Tarea no encontrada.");
        }


        System.out.println("\nEliminar 'Tarea 3':");
        lista.eliminarTarea("Tarea 3");
        lista.mostrarTareas();


        System.out.println("\nMarcar 'Tarea 2' como completada:");
        lista.marcarComoCompletada("Tarea 2");
        lista.mostrarTareas();
    }
}
