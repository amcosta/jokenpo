package dev.amcosta.game;

import dev.amcosta.Player;
import dev.amcosta.choice.Paper;
import dev.amcosta.choice.Scissor;
import dev.amcosta.choice.Stone;
import dev.amcosta.exception.DrawException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;

public class BestOf3Test {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void player2ShouldWin() {

        Player player1 = new Player("p1", Arrays.asList(new Stone(), new Stone(), new Paper()));
        Player player2 = new Player("p2", Arrays.asList(new Paper(), new Stone(), new Scissor()));

        BestOf3 game = new BestOf3(player1, player2);
        Player winner = game.play();

        Assert.assertEquals(player2.getName(), winner.getName());
    }

    @Test
    public void shouldThrowDrawException() {
        this.thrown.expect(DrawException.class);

        Player player1 = new Player("p1", Arrays.asList(new Stone(), new Stone(), new Stone()));
        Player player2 = new Player("p2", Arrays.asList(new Paper(), new Stone(), new Scissor()));

        BestOf3 game = new BestOf3(player1, player2);
        game.play();
    }
}
