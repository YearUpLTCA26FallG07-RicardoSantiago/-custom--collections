package com.pluralsight;

public class Main {

    public static void main(String[] args){

        FixedList<Integer> numbers = new FixedList<>(5);

        numbers.add(24);
        numbers.add(78);
        numbers.add(36);
        numbers.add(12);
        numbers.add(45);
        numbers.add(92);

        System.out.println(numbers.getItems());

        System.out.println(numbers.getItems().size());

    }
}
