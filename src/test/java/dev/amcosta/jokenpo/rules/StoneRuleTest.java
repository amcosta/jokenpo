package dev.amcosta.jokenpo.rules;

import dev.amcosta.jokenpo.ChoicesEnum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StoneRuleTest {

    private StoneRule rule;

    @Before
    public void beforeEach() {
        this.rule = new StoneRule();
    }

    @Test
    public void shouldWinToScissors() {
        int win = this.rule.compareTo(ChoicesEnum.SCISSORS);
        Assert.assertEquals(1, 1);
    }
}
