package dev.amcosta.choice;

import dev.amcosta.exception.DrawException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class PaperTest {
    IChoice choice;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void initialize() {
        choice = new Paper();
    }

    @Test
    public void shouldWinToStone() {
        assertTrue(choice.compare(new Stone()));
    }

    @Test
    public void shouldLoseToScissor() {
        assertFalse(choice.compare(new Scissor()));
    }

    @Test
    public void shouldThrowAExceptionOnDraw() {
        thrown.expect(DrawException.class);
        choice.compare(new Paper());
    }
}
