package com.mycompany.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamsBasicOperations {

    public static void main(String[] args) {

        int n;

        List<Integer> numbers = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Add 10 numbers");

            n = scanner.nextInt();

            numbers.add(n);
        }

        System.out.println("Sorted even numbers: ");

        List<Integer> evenNumbers = numbers.stream().filter((e) -> (e % 2 == 0)).sorted().collect(Collectors.toList());
        evenNumbers.stream().forEach(x -> System.out.println(x));

        System.out.println("Sorted odd numbers: ");

        numbers.stream().filter((e) -> (!(e % 2 == 0))).sorted().forEach(x -> System.out.println(x));

        System.out.println("Sorted positive numbers: ");

        numbers.stream().filter((e) -> (e > 0)).sorted().forEach(x -> System.out.println(x));

        System.out.println("Sorted negative numbers: ");

        numbers.stream().filter((e) -> (e < 0)).sorted().forEach(x -> System.out.println(x));

        System.out.println("Sorted positive even numbers: ");
        evenNumbers.stream().filter((e) -> (e > 0)).sorted().forEach(x -> System.out.println(x));

        System.out.println("Sorted negative odd numbers: ");
        numbers.stream().filter((e) -> (!(e % 2 == 0) && (e < 0))).sorted().forEach(x -> System.out.println(x));

    }

}
