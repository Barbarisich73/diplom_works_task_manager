package ru.netology.javacore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TodosTests {
    Todos sut = new Todos();
    String task;

    @Test
    public void testAddTask() {
        task = "Учеба";
        sut.addTask(task);
        boolean expResult = sut.todos.contains("Учеба");
        boolean result = true;
        assertEquals(expResult, result);
    }

    @Test
    public void testRemoveTask() {
        task = "Акробатика";
        sut.removeTask(task);
        boolean expResult = sut.todos.isEmpty();
        boolean result = true;
        assertEquals(expResult, result);
    }

    @Test
    public void testGetAllTasks() {
        sut.addTask("Учеба");
        sut.addTask("Акробатика");
        sut.addTask("Плавание");
        String expResult = "Акробатика Плавание Учеба";
        String result = sut.getAllTasks();
        assertEquals(expResult, result);
    }

}
