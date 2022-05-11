package com.company.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx {
    public static void main(String[] args) {
        int sum = Stream.of(1, 2, 3, 4, 5).reduce(Integer::sum).stream().findAny().get();
        System.out.println("sum: " + sum);

        System.out.println(Stream.of(1, 8, 3, -2, 0).allMatch(x -> x > 0));

        System.out.println(Stream.of(8, 2, 38, 4).collect(Collectors.counting()));

        System.out.println(Stream.of("i", "g", "o", "r").collect(Collectors.joining()));
        System.out.println(Stream.of("i", "g", "o", "r").collect(Collectors.joining("-")));
        System.out.println(Stream.of("i", "g", "o", "r").collect(Collectors.joining("->", "[", "]")));

        System.out.println(Stream.of(2, 9, 23, 55).mapToInt(Integer::intValue).summaryStatistics().getMax());

        Stream.generate(() -> 2).limit(20).forEach(System.out::println);

        List<String> stringList = new ArrayList<>(Arrays.asList("igor", "gruntov", "sergeevich"));

        List<String> collect = stringList.stream().map(s -> s + "_hello").collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(stringList);

        List<String> collect2 = stringList.stream().map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
        System.out.println(collect2);
        System.out.println(stringList);

        String strForDelim = "Mashina";

        String[] arrStr = Stream.of(strForDelim).flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);
        System.out.println(Arrays.toString(arrStr));

        Collection<String> collection = Arrays.asList("1,2,0", "4,5");

        int sum1 = collection.stream().flatMapToInt((p) -> Arrays.asList(p.split(",")).stream().mapToInt(Integer::parseInt)).sum();
        System.out.println(sum1);


    }
}
