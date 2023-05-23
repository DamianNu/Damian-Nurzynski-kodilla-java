package com.kodilla.rps;

import java.util.Scanner;

public class StarterGames {

    public void firstStartGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("> Welcome to RPS <\n");
        System.out.println("Please enter your first name!\n");
        String name = sc.nextLine();
        Players player = new Players(name);
        System.out.println("\n" + "Enter the number of rounds!");
        int round = sc.nextInt();
        Game game = new Game(round);
        System.out.println("\nSo " + game.getRound() + " rounds. Good luck " + player.getFirstName() + "!");
        Game.panel();


    }
}
