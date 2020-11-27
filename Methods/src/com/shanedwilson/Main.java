package com.shanedwilson;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 1500;
        String playerName = "Bob";
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 900;
        playerName = "Chuck";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 400;
        playerName = "Don";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 50;
        playerName = "Ernie";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 1000;
        playerName = "Frank";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 500;
        playerName = "George";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);

        score = 100;
        playerName = "Hank";
        position = calculateHighScorePosition(score);
        displayHighScorePosition(playerName, position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + ".");
    }

    public static int calculateHighScorePosition(int highScore) {
//        if (highScore >= 1000) {
//            return 1;
//        } else if (highScore >= 500) {
//            return 2;
//        } else if (highScore >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4;
        if (highScore >= 1000) {
            position = 1;
        } else if (highScore >= 500) {
            position = 2;
        } else if (highScore >= 100) {
            position = 3;
        }
        return position;
    }
}
