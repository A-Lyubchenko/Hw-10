package goit.Task1;

import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    private static final List<String> LIST_OF_NAMES = List.of("Экран", "Клавиатура", "Мышка", "Процессор", "Колонки", "Камера");
    private static final int[] i = {0};

    public static void main(String[] args) {
        Map<Integer, String> collect = LIST_OF_NAMES.stream()
                .collect(Collectors.toMap(number -> i[0]++, name -> name));





        String collect1 = collect.entrySet().stream()
                .filter(s -> s.getKey() % 2 == 1)
                .map(s -> s.getKey() + ". " + s.getValue() + ", ")
                .collect(Collectors.joining());


        System.out.println(collect1.replaceAll("[, ]*$", ""));



    }

}

