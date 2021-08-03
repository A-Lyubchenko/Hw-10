package goit.Task2;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    private static final List<String> LIST_OF_NAMES = List.of("Экран", "Клавиатура", "Мышка", "Процессор", "Колонки", "Камера");

    public static void main(String[] args) {
        String collect = LIST_OF_NAMES.stream()
                .map(String::toUpperCase)
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining(", "));
        System.out.println(collect);

    }

}

