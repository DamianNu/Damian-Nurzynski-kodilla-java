package com.kodilla.rps;

import java.util.Scanner;

public class Game {
    private final int round;

    public Game(final int round) {
        this.round = round;
    }

    public int getRound() {
        return round;
    }



    public static void getStatistic() {
        System.out.println("Game statistics");
    }

    public static void panel() {

        Scanner sc = new Scanner(System.in);
        boolean end = false;
        MovePlayers movePlayers = new MovePlayers();
        Scoring scoring = new Scoring();
        StarterGames starterGames = new StarterGames();
        String stats = ("\n \u001B[34mCurrent game statistics: " + "Player > \u001B[33m");
        String stats2 = ("\u001B[34m < Computer\u001B[0m");
        while (!end) {
            if (scoring.getPointsComputer() == starterGames.getRound() ||
                    scoring.getPointsPlayer() == starterGames.getRound()) {
                System.out.println("\nEnd of the game\n");
                if(scoring.getPointsPlayer()>scoring.getPointsComputer()) {
                    System.out.println(stats + scoring.getPointsPlayer() + ":" + scoring.getPointsComputer() + stats2
                    + "\nPlayer wins \u001B[35mCong\u001B[34mratu\u001B[33mlati\u001B[31mons!!\u001B[0m\n");

                }else {
                    System.out.println(stats + scoring.getPointsPlayer() + ":" + scoring.getPointsComputer() + stats2
                    + "\n  > You lose <\n");
                }
                starterGames.newGame2();
            } else {
                System.out.println("\n \u001B[33mSelect options:\u001B[0m");
                System.out.println(">1< Rock");
                System.out.println(">2< Paper");
                System.out.println(">3< Scissors");
                System.out.println(">x< Quit the game");
                System.out.println(">n< New game");
                System.out.println(stats + scoring.getPointsPlayer() + ":" + scoring.getPointsComputer() + stats2);


                String s = sc.nextLine();
                while (s.length() == 0 || s.length() > 1) {
                    s = sc.nextLine();
                }
                char choice = s.charAt(0);
                switch (choice) {
                    case '1' -> movePlayers.vs(0);
                    case '2' -> movePlayers.vs(1);
                    case '3' -> movePlayers.vs(2);
                    case 'x' -> Game.endGame();
                    case 'n' -> starterGames.newGame();
                    default -> panel();
                }
            }
        }
    }

    public static void endGame() {
        Scanner sc = new Scanner(System.in);
        boolean end2 = false;
        while (!end2) {
            System.out.println("Are you sure to end the game? \ny/n?");
            String x = sc.nextLine();
            while (x.length()==0 || x.length()>1){
                x = sc.nextLine();
            }
            char choice3 = x.charAt(0);
            switch (choice3) {
                case 'y' -> {
                    System.exit(1);
                }
                case 'n' -> Game.panel();
                default -> Game.endGame();
            }
        }
    }
}