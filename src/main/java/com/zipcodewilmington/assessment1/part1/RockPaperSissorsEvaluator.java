package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        if (handSign == "rock"){
            return "paper";
        } else if (handSign == "paper"){
            return "scissor";
        } else if (handSign == "scissor"){
            return "rock";
        }
        return "nuke";
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        if (handSign == "rock"){
            return "scissor";
        } else if (handSign == "paper"){
            return "rock";
        } else if (handSign == "scissors"){
            return "paper";
        }
        return "quitting";
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        if (handSignOfPlayer1 == getWinningMove(handSignOfPlayer2)){
            return handSignOfPlayer1;
        } else if (handSignOfPlayer2 == getLosingMove(handSignOfPlayer1)){
            return handSignOfPlayer2;
        }
        return "tie";
    }
}
