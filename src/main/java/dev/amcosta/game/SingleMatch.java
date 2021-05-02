package dev.amcosta.game;

import dev.amcosta.Player;

public class SingleMatch {
    private final Player player1;
    private final Player player2;
    private Player winner;

    public SingleMatch(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void execute() {
        winner = player1.getChoice().compare(player2.getChoice()) ? player1 : player2;
    }

    public Player getWinner() {
        return winner;
    }
}
