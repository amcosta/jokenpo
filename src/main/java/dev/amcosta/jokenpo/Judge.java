package dev.amcosta.jokenpo;

public class Judge {

    public Player analyse(Player player1, Player player2) {

    }

    private boolean scissorsRule(String choice) {
        if (choice.equals("PD")) {
            return false;
        }

        if (choice.equals("PP")) {
            return true;
        }

        if (choice.equals("TS")) {
            throw new DrawException();
        }
    }
}
