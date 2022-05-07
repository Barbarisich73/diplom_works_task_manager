package ru.netology.javacore;

import org.junit.jupiter.api.*;

public class TodosTest {
    Todos sut = new Todos();
    String task;

    @BeforeAll
    public static void startedAllTests() {
        System.out.println("Testing has started");
    }

    @AfterAll
    public static void finishAllTest() {
        System.out.println("Testing completed");
    }

    @BeforeEach
    public void startedEachTest() {
        System.out.println("Test started");
    }

    @AfterEach
    public void finishEachTest() {
        System.out.println("The test is over");
    }

    @Test
    public void testAddTask() {
        task = "Учеба";
        sut.addTask(task);
        boolean expResult = sut.todos.contains("Учеба");
        boolean result = true;
        Assertions.assertEquals(expResult, result);
    }

    @Test
    public void testRemoveTask() {
        task = "Акробатика";
        sut.removeTask(task);
        boolean expResult = sut.todos.isEmpty();
        boolean result = true;
        Assertions.assertEquals(expResult, result);
    }

    @Test
    public void testGetAllTasks() {
        sut.addTask("Учеба");
        sut.addTask("Акробатика");
        sut.addTask("Плавание");
        String expResult = "Акробатика Плавание Учеба";
        String result = sut.getAllTasks();
        Assertions.assertEquals(expResult, result);
    }

}