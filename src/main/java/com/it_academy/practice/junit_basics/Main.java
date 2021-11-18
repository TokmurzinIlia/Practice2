package com.it_academy.practice.junit_basics;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = Integer.parseInt(sc.next());
        int n2 = Integer.parseInt(sc.next());

        Calculator calculator = new Calculator(n1, n2);

        System.out.println("Plus result: " + calculator.calculate('+'));
        System.out.println("Minus result: " + calculator.calculate('-'));
        System.out.println("Division result: " + calculator.calculate('/'));
        System.out.println("Multiply result: " + calculator.calculate('*'));

        StringRandom stringRandom = new StringRandom();
        String [] array = stringRandom.fillInArray(5);
        Stream streamFromArrays = Arrays.stream(array);

        streamFromArrays
                .forEach(System.out::println);

        System.out.println();

        array = stringRandom.toLowerCase();

        Stream streamFromArrays2 = Arrays.stream(array);

        streamFromArrays2
                .forEach(System.out::println);

        array = stringRandom.capitalize();

        System.out.println();

        Stream streamFromArrays3 = Arrays.stream(array);
        streamFromArrays3
                .forEach(System.out::println);


    }
}
