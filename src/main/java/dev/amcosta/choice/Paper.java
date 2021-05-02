package dev.amcosta.choice;

import dev.amcosta.exception.DrawException;

public class Paper extends Choice {
    @Override
    public ChoiceEnum getChoice() {
        return ChoiceEnum.PAPER;
    }

    @Override
    ChoiceEnum getWinsFrom() {
        return ChoiceEnum.STONE;
    }
}
