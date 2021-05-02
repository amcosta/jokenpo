package dev.amcosta.choice;

import dev.amcosta.exception.DrawException;

public abstract class Choice implements IChoice {
    @Override
    public Boolean compare(IChoice choice) {
        if (choice.getChoice().equals(this.getChoice())) {
            throw new DrawException();
        }

        return choice.getChoice().equals(this.getWinsFrom());
    }

    abstract ChoiceEnum getWinsFrom();
}
