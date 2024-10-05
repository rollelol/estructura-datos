package Estructuras_SJF;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Task {
    String name;
    int burstTime;

    public Task(String name, int burstTime) {
        this.name = name;
        this.burstTime = burstTime;
    }
}

class SJF {
    List<Task> taskQueue;

    public SJF() {
        taskQueue = new ArrayList<>();
    }


    public void addTask(Task task) {
        taskQueue.add(task);
    }


    public void execute() {

        taskQueue.sort(Comparator.comparingInt(task -> task.burstTime));

        System.out.println("Orden de ejecución de las tareas (SJF):");
        for (Task task : taskQueue) {
            System.out.println("Tarea: " + task.name + ", Tiempo de Burst: " + task.burstTime);
        }
    }
}

public class MainSJF {
    public static void main(String[] args) {
        SJF scheduler = new SJF();

        scheduler.addTask(new Task("Tarea1", 5));
        scheduler.addTask(new Task("Tarea2", 3));
        scheduler.addTask(new Task("Tarea3", 8));
        scheduler.addTask(new Task("Tarea4", 2));

        scheduler.execute();
    }
}
