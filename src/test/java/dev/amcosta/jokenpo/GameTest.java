package dev.amcosta.jokenpo;

import org.junit.Assert;
import org.junit.Test;

public class GameTest {

    @Test
    public void scissorsShouldWin() {
        Game game = new Game();
        game.addPlayer(new Player("Jogador 1", "TS"));
        game.addPlayer(new Player("Jogador 2", "PP"));
        game.execute();

        Player winner = game.getWihher();

        Assert.assertEquals("Jogador 1", winner.getName());
        Assert.assertEquals("TS", winner.getChoice());
    }

    @Test
    public void paperShouldWin() {
        Game game = new Game();
        game.addPlayer(new Player("Jogador 1", "PD"));
        game.addPlayer(new Player("Jogador 2", "PP"));
        game.execute();

        Player winner = game.getWihher();

        Assert.assertEquals("Jogador 2", winner.getName());
        Assert.assertEquals("PP", winner.getChoice());
    }
}
