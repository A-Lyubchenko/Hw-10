package goit.Task3;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final String[] STRINGS = {"1, 2, 0", "4, 5"};

    public static void main(String[] args) {

        String collect1 = Stream.of(STRINGS)
                .flatMap(number -> Stream.of(number.split(", ")))
                .sorted(Comparator.comparing(Integer::parseInt))
                .collect(Collectors.joining(", ", "\"", "\""));

        System.out.println(collect1);
    }
}
