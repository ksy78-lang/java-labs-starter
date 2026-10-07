package edu.course.lab02;

public class ProjectTask {
    private String id;
    private String title;
    private TaskStatus status;
    private int estimatedHours;


    public ProjectTask(String id, String title, int estimatedHours) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID не может быть пустым");
        }
       
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Название не может быть пустым");
        }
 
        if (estimatedHours <= 0) {
            throw new IllegalArgumentException("Время должно быть больше нуля");
        }

        this.id = id;
        this.title = title;
        this.estimatedHours = estimatedHours;
        
        this.status = TaskStatus.TODO;
    }

    public void changeStatus(TaskStatus newStatus) {
        if (newStatus == null) {
            throw new IllegalArgumentException("Статус не может быть пустым");
        }
        this.status = newStatus;
    }

    public boolean isFinished() {
        return this.status == TaskStatus.DONE;
    }

    public void increaseEstimatedHours(int hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("Можно добавить только положительное число часов");
        }
        this.estimatedHours += hours;
    }
} 