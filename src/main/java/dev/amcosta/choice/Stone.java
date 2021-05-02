package dev.amcosta.choice;

import dev.amcosta.exception.DrawException;

public class Stone extends Choice {
    @Override
    public ChoiceEnum getChoice() {
        return ChoiceEnum.STONE;
    }

    @Override
    ChoiceEnum getWinsFrom() {
        return ChoiceEnum.SCISSOR;
    }
}
