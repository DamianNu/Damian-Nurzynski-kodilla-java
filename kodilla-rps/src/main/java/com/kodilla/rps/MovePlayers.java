package com.kodilla.rps;

import java.util.Random;

public class MovePlayers {

    private final String[] rps = new String[3];
    private final String rock = "ROCK";
    private final String paper = "PAPER";
    private final String scissors = "SCISSORS";

    private String p;
    private String c;

    public MovePlayers(){

    }
    public String movePlayer(int a) {
        rps[0] = rock;
        rps[1] = paper;
        rps[2] = scissors;
        p = rps[a];
        return p;
    }

    public String moveComputer(){
        Random rand = new Random();
        int selected = rand.nextInt(0,3);
        c = rps[selected];
        return c;
    }

   public void vs(int b){
        movePlayer(b);
        moveComputer();
        if(p.equals(c)){
            System.out.println("Player =>> " + p + " Computer =>> " + c + ": Draw round.");
        }else if((p.equals("ROCK") && c.equals("SCISSORS")) || (p.equals("SCISSORS") && c.equals("ROCK")) || (p.equals("PAPER") && c.equals("ROCK"))){
            System.out.println("Player =>> " + p + " Computer =>> " + c + ": Player won round.");
            Scoring scoring = new Scoring();
            scoring.addPointsPlayer();
        }else {
            System.out.println("Player =>> " + p + " Computer =>> " + c + ": Computer won round.");
            Scoring scoring = new Scoring();
            scoring.addPointsComputer();
        }
   }
}
