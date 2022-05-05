package ru.netology.javacore;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Todos todos = new Todos();
        TodoServer server = new TodoServer(8989, todos);
        server.start();

        /*Код для проверки реализации класса Todos
        Todos todos = new Todos();
        todos.addTask("Учеба");
        todos.addTask("Пробежка");
        todos.addTask("Акробатика");

        System.out.println(todos);
        System.out.println("Отсортированный список задач:\n" + todos.getAllTasks());
         */
    }
}
