package dev.amcosta.choice;

import dev.amcosta.exception.DrawException;

public class Stone implements IChoice {
    @Override
    public Choice getChoice() {
        return Choice.STONE;
    }

    @Override
    public Boolean compare(IChoice choice) {
        if (choice.getChoice().equals(Choice.STONE)) {
            throw new DrawException();
        }

        return choice.getChoice().equals(Choice.SCISSOR);
    }
}
