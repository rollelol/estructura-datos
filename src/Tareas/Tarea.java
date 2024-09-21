package Tareas;

import java.time.LocalDate;

public class Tarea {
    String descripcion;
    int prioridad;
    LocalDate fechaVencimiento;
    Tarea siguiente;

    public Tarea(String descripcion, int prioridad, LocalDate fechaVencimiento) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fechaVencimiento = fechaVencimiento;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "Tarea: " + descripcion + ", Prioridad: " + prioridad + ", Vencimiento: " + fechaVencimiento;
    }
}

