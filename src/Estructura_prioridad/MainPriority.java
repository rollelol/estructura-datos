package Estructura_prioridad;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class TaskWithPriority {
    String name;
    int burstTime;
    int priority;

    public TaskWithPriority(String name, int burstTime, int priority) {
        this.name = name;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}

class PriorityScheduler {
    List<TaskWithPriority> taskQueue;

    public PriorityScheduler() {
        taskQueue = new ArrayList<>();
    }


    public void addTask(TaskWithPriority task) {
        taskQueue.add(task);
    }

    public void execute() {

        taskQueue.sort(Comparator.comparingInt(task -> task.priority));

        System.out.println("Orden de ejecución de las tareas (Prioridad):");
        for (TaskWithPriority task : taskQueue) {
            System.out.println("Tarea: " + task.name + ", Tiempo de Burst: " + task.burstTime + ", Prioridad: " + task.priority);
        }
    }
}

public class MainPriority {
    public static void main(String[] args) {
        PriorityScheduler scheduler = new PriorityScheduler();

        scheduler.addTask(new TaskWithPriority("Tarea1", 5, 2));
        scheduler.addTask(new TaskWithPriority("Tarea2", 3, 1));
        scheduler.addTask(new TaskWithPriority("Tarea3", 8, 4));
        scheduler.addTask(new TaskWithPriority("Tarea4", 2, 3));

        scheduler.execute();
    }
}
