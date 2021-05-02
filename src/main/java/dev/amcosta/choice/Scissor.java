package dev.amcosta.choice;

import dev.amcosta.exception.DrawException;

public class Scissor extends Choice {
    @Override
    public ChoiceEnum getChoice() {
        return ChoiceEnum.SCISSOR;
    }

    @Override
    ChoiceEnum getWinsFrom() {
        return ChoiceEnum.PAPER;
    }
}
