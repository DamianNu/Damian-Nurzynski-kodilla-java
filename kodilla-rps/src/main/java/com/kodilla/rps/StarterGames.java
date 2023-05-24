package com.kodilla.rps;

import java.util.Scanner;

public class StarterGames {
    private static int round;
    public int getRound() {
        return round;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\u001B[34m" + "> Welcome to RPS <\n");
        System.out.println("\u001B[0m" + "Please enter your first name!\n");
        String name = sc.nextLine();
            while (name.length() == 0) {
                name = sc.nextLine();
            }
        Players player = new Players(name);
        System.out.println("\n" + "Enter the number of rounds!");
        round = sc.nextInt();
            while (round < 1) {
                System.out.println("Incorrect data.\nEnter the number of rounds!");
                round = sc.nextInt();
            }
        Game game = new Game(round);
        Scoring scoring = new Scoring();
            scoring.setPointsComputer(0);
            scoring.setPointsPlayer(0);
        System.out.println("\nSo " + game.getRound() + " rounds. Good luck " + player.getFirstName() + "!");
        Game.panel();
    }

    public void newGame() {
        System.out.println("Are you sure you want to end the current game? \ny/n?");
        Scanner sc = new Scanner(System.in);
        boolean end = false;
            while (!end) {
                String x = sc.nextLine();
                    while (x.length() == 0 || x.length() > 1) {
                        x = sc.nextLine();
                    }
                char choice2 = x.charAt(0);
                    switch (choice2) {
                        case 'y' -> end = true;
                        case 'n' -> Game.panel();
                        default -> newGame();
                }
            }
        System.out.println("\n" + "Enter the number of rounds!");
            round = sc.nextInt();
                while (round < 1) {
                    System.out.println("Incorrect data.\nEnter the number of rounds!");
                    round = sc.nextInt();
                }
            Game game = new Game(round);
        Scoring scoring = new Scoring();
            scoring.setPointsComputer(0);
            scoring.setPointsPlayer(0);
        System.out.println("\nSo " + game.getRound() + " rounds. Good luck !!");
        Game.panel();
    }

    public void newGame2() {
        System.out.println("Do you want to start a new game y/n?");
        Scanner sc = new Scanner(System.in);
            boolean end = false;
            while (!end) {
                String x = sc.nextLine();
                    while (x.length() == 0 || x.length() > 1) {
                        x = sc.nextLine();
                    }
                char choice2 = x.charAt(0);
                    switch (choice2) {
                        case 'y' -> end = true;
                        case 'n' -> System.exit(1);
                        default -> newGame2();
                    }
            }
        System.out.println("\n" + "Enter the number of rounds!");
        round = sc.nextInt();
            while (round < 1) {
                System.out.println("Incorrect data.\nEnter the number of rounds!");
                round = sc.nextInt();
            }
        Game game = new Game(round);
        Scoring scoring = new Scoring();
            scoring.setPointsComputer(0);
            scoring.setPointsPlayer(0);
        System.out.println("\nSo " + game.getRound() + " rounds. Good luck !!");
        Game.panel();
    }
}

