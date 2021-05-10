package dev.amcosta.game;

import dev.amcosta.Player;
import dev.amcosta.choice.Paper;
import dev.amcosta.choice.Scissor;
import dev.amcosta.choice.Stone;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BestOf3Test {

    @Test
    public void player2ShouldWin() {

        Player player1 = new Player("p1", Arrays.asList(new Stone(), new Stone(), new Paper()));
        Player player2 = new Player("p2", Arrays.asList(new Scissor(), new Stone(), new Stone()));

        BestOf3 game = new BestOf3(player1, player2);
        game.play();

        Assert.assertEquals(player2.getName(), game.getWinner().getName());
    }
}
