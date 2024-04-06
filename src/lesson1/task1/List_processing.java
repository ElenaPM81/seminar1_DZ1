package lesson1.task1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class List_processing {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 8, 12, 2, 2);
        OptionalDouble average = numbers.stream()
                .filter(n -> n % 2 == 0)
                .mapToDouble(n -> n)
                .average();
        if (average.isPresent())
            System.out.println(average.getAsDouble());
    }
}