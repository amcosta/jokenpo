package dev.amcosta.choice;

import dev.amcosta.exception.DrawException;

public class Paper implements IChoice {
    @Override
    public Choice getChoice() {
        return Choice.PAPER;
    }

    @Override
    public Boolean compare(IChoice choice) {
        if (choice.getChoice().equals(this.getChoice())) {
            throw new DrawException();
        }

        return choice.getChoice().equals(Choice.STONE);
    }
}
