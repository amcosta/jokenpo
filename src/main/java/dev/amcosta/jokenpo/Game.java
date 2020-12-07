package dev.amcosta.jokenpo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Game {

    private List<Player> players = new ArrayList<>();
    private Player winner;

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void execute() {

//        this.winner = this.players.stream().reduce(null, (Player previousWinner, Player currentPlayer) -> {
//
//        });

        this.players.forEach(player -> {
            if (player.getChoice().equals("TS")) {
                this.winner = player;
            } else if (player.getChoice().equals("PD")) {
                this.winner = player;
            } else {
                this.winner = player;
            }
        });
    }

    public Player getWihher() {
        return this.winner;
    }
}
