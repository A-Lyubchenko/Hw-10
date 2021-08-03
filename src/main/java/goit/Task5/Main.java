package goit.Task5;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static long mix;
    private static final List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5);
    private static final List<Integer> integerList2 = Arrays.asList(6, 7, 8, 9);

    public static void main(String[] args) {

        int firstListLength = integerList1.size();
        int secondListLength = integerList2.size();
        if (firstListLength > secondListLength) {
            mix = secondListLength;
        }
        if (firstListLength < secondListLength) {
            mix = firstListLength;
        }
        Stream<Integer> stream1 = integerList1.stream();
        Stream<Integer> stream2 = integerList2.stream();

        zip(stream1, stream2).forEach(System.out::print);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        return Stream.concat(first.limit(mix).parallel(), second.limit(mix).parallel());
    }
}