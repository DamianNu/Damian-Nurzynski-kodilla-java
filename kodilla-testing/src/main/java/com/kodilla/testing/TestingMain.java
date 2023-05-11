package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.List;




public class TestingMain {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(2);
        numbers.add(0);
        numbers.add(12);
        numbers.add(-8);

        OddNumbersExterminator odd = new OddNumbersExterminator();
        List<Integer> list = odd.exterminate(numbers);
        System.out.println(list.size());


    }
}


