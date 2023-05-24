package com.kodilla.rps;

public class Scoring {
    private static int pointsPlayer;
    private static int pointsComputer;

    public void setPointsPlayer(int pointsPlayer) {
        this.pointsPlayer = pointsPlayer;
    }

    public void setPointsComputer(int pointsComputer) {
        this.pointsComputer = pointsComputer;
    }

    public int getPointsPlayer() {
        return pointsPlayer;
    }

    public void addPointsPlayer() {
        pointsPlayer = pointsPlayer +1;
    }

    public int getPointsComputer() {
        return pointsComputer;
    }

    public void addPointsComputer() {
        pointsComputer = pointsComputer + 1;
    }
}
