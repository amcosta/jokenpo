package dev.amcosta.game;

import dev.amcosta.Player;
import dev.amcosta.choice.Paper;
import dev.amcosta.choice.Scissor;
import dev.amcosta.exception.DrawException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class SingleMatchTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void player1ShouldWin() {
        Player p1 = new Player("p1", new Scissor());
        Player p2 = new Player("p2", new Paper());
        SingleMatch game = new SingleMatch(p1, p2);
        game.execute();

        assertEquals(p1.getName(), game.getWinner().getName());
    }

    @Test
    public void shouldThrowAExceptionOnDraw() {
        thrown.expect(DrawException.class);

        Player p1 = new Player("p1", new Scissor());
        Player p2 = new Player("p2", new Scissor());
        SingleMatch game = new SingleMatch(p1, p2);
        game.execute();
    }
}
