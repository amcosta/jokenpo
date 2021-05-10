package dev.amcosta.game;

import dev.amcosta.Player;
import dev.amcosta.exception.DrawException;

import java.util.HashMap;

public class BestOf3 implements IGame {

    private static final int MATCHES = 3;

    private final Player player1;
    private final Player player2;
    private Player winner;
    private final HashMap<Player, Integer> score = new HashMap<>();

    public BestOf3(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

        this.score.put(this.player1, 0);
        this.score.put(this.player2, 0);
    }

    @Override
    public Player play() throws DrawException {
        for (int round = 1; round <= MATCHES; round++) {
            SingleMatch match = new SingleMatch(this.player1, this.player2);
            try {
                Player winner = match.play();
                Integer currentScore = this.score.get(winner);
                currentScore++;
                this.score.replace(winner, currentScore);
            } catch (DrawException ignored) {
            }
        }

        if (this.score.get(this.player1).equals(this.score.get(this.player2))) {
            throw new DrawException();
        }

        return this.score.get(this.player1) > this.score.get(this.player2) ? this.player1 : this.player2;
    }
}
