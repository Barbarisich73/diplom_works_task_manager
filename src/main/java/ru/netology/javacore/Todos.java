package ru.netology.javacore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Todos {
    List<String> todos = new ArrayList<>();

    @Override
    public String toString() {
        return "Todos{" +
                "todos=" + todos + '}';
    }

    public void addTask(String task) {
        todos.add(task);
    }

    public void removeTask(String task) {
        todos.remove(task);
    }

    public String getAllTasks() {
        return todos.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.joining(" "));
    }

}