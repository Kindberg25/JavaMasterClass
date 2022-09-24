package com.carlKindberg;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePositions("Carl", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePositions("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePositions("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(600);
        displayHighScorePositions("Gilbert", highScorePosition);



    }

    public static void displayHighScorePositions(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
        + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;

    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }

}
