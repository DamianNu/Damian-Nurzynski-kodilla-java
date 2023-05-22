package com.kodilla.stream;


import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

public class StreamMain {

    public static void main(String[] args) {

        LocalDate a = LocalDate.now().minusDays(20);
        System.out.println(ChronoUnit.DAYS.between(a,LocalDate.now()));



    }
}
