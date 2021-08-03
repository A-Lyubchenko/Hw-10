package goit.Task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
streamIterate(25214903917L,11, (long) Math.pow(2,48)).limit(10).forEach(System.out::println);

    }
    public static Stream<Long> streamIterate(long a,long c,long m){
        return Stream.iterate(2L, e -> (a * e + c) % m);

    }
}
