package edu.course.lab02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectTaskTest {

    @Test
    public void testValidTaskAndBehavior() {
        ProjectTask task = new ProjectTask("T-1", "Написать код", 5);
        assertFalse(task.isFinished());
        task.changeStatus(TaskStatus.DONE);
        assertTrue(task.isFinished());
    }

    @Test
    public void testInvalidConstructorArguments() {
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("", "Название", 5));
        assertThrows(IllegalArgumentException.class, () -> new ProjectTask("T-2", "Название", -2));
    }

    @Test
    public void testInvalidHoursIncrease() {
        ProjectTask task = new ProjectTask("T-3", "Тест", 10);
        assertThrows(IllegalArgumentException.class, () -> task.increaseEstimatedHours(-5));
    }
}