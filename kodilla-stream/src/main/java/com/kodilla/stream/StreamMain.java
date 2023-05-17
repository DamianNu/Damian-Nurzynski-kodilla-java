package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;




public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        String result1 = poemBeautifier.beautify("", a -> "ABC " + a + " ABC");
        System.out.println(result1);

        String result2 = poemBeautifier.beautify(" kot czy kod ", a -> a.toUpperCase());
        System.out.println(result2);

        String result3 = poemBeautifier.beautify(" kot czy kod ", a -> "\u001B[34m" + a + "\u001B[0m");
        System.out.println(result3);

        String result4 = poemBeautifier.beautify(" kot czy kod ", a -> {
            char[] tab = a.toCharArray();
            String text = "";
            int b = 0;
            for(int i = 0;i< tab.length;i++){
                text = text + tab[tab.length-1-i];
            }
            return text;
        });
        System.out.println(result4);
    }

}