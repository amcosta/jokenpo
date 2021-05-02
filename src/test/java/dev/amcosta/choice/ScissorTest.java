package dev.amcosta.choice;

import dev.amcosta.exception.DrawException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ScissorTest {
    IChoice choice;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void initialize() {
        choice = new Scissor();
    }

    @Test
    public void shouldWinToPaper() {
        assertTrue(choice.compare(new Paper()));
    }

    @Test
    public void shouldLoseToStone() {
        assertFalse(choice.compare(new Stone()));
    }

    @Test
    public void shouldThrowAExceptionOnDraw() {
        thrown.expect(DrawException.class);
        choice.compare(new Scissor());
    }
}
