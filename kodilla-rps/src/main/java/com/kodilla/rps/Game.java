package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private final int round;
    private int pointsPlayer;
    private int pointsComputer;

    public Game(final int round) {
        this.round = round;
    }

    public int getRound() {
        return round;
    }

    public int getPointsPlayer() {
        return pointsPlayer;
    }

    public void setPointsPlayer(int pointsPlayer) {
        this.pointsPlayer = pointsPlayer;
    }

    public int getPointsComputer() {
        return pointsComputer;
    }

    public void setPointsComputer(int pointsComputer) {
        this.pointsComputer = pointsComputer;
    }

    public static void getStatistic() {
        System.out.println("Game statistics");
    }

    public static void panel() {

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("\n Select options:");
            System.out.println(">1< Rock");
            System.out.println(">2< Paper");
            System.out.println(">3< Scissors");
            System.out.println(">x< Quit the game");
            System.out.println(">n< New game");




            String s = sc.nextLine();
            char choice = s.charAt(0);
            switch (choice) {
                case '1' -> System.out.println("1");
                case '2' -> System.out.println("2");
                case '3' -> System.out.println("3");
                case 'x' -> Game.endGame();
                case 'n' -> System.out.println("n");
                default -> panel();
            }
        }
    }

    public static void endGame() {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        while (!end) {
            System.out.println("Are you sure to end the game? \ny/n?");
            String x = sc.nextLine();
            char choice2 = x.charAt(0);
            switch (choice2) {
                case 'y' -> {
                    System.exit(1);
                }
                case 'n' -> Game.panel();
                default -> Game.endGame();
            }
        }
    }
}