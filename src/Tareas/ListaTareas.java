package Tareas;

import java.time.LocalDate;

public class ListaTareas {
    private Tarea cabeza;


    public void agregarTarea(String descripcion, int prioridad, LocalDate fechaVencimiento) {
        Tarea nuevaTarea = new Tarea(descripcion, prioridad, fechaVencimiento);
        if (cabeza == null || compararTareas(nuevaTarea, cabeza) < 0) {
            nuevaTarea.siguiente = cabeza;
            cabeza = nuevaTarea;
        } else {
            Tarea actual = cabeza;
            while (actual.siguiente != null && compararTareas(nuevaTarea, actual.siguiente) >= 0) {
                actual = actual.siguiente;
            }
            nuevaTarea.siguiente = actual.siguiente;
            actual.siguiente = nuevaTarea;
        }
    }


    private int compararTareas(Tarea t1, Tarea t2) {
        if (t1.prioridad != t2.prioridad) {
            return t1.prioridad - t2.prioridad;
        } else {
            return t1.fechaVencimiento.compareTo(t2.fechaVencimiento);
        }
    }


    public void eliminarTarea(String descripcion) {
        if (cabeza == null) return;

        if (cabeza.descripcion.equals(descripcion)) {
            cabeza = cabeza.siguiente;
            return;
        }

        Tarea actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.descripcion.equals(descripcion)) {
            actual = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
        }
    }


    public void mostrarTareas() {
        if (cabeza == null) {
            System.out.println("No hay tareas.");
            return;
        }

        Tarea actual = cabeza;
        while (actual != null) {
            System.out.println(actual);
            actual = actual.siguiente;
        }
    }


    public Tarea buscarTarea(String descripcion) {
        Tarea actual = cabeza;
        while (actual != null) {
            if (actual.descripcion.equals(descripcion)) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }


    public void marcarComoCompletada(String descripcion) {
        eliminarTarea(descripcion);
        System.out.println("Tarea completada y eliminada: " + descripcion);
    }
}
