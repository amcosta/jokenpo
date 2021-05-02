package dev.amcosta.choice;

import dev.amcosta.exception.DrawException;

public class Scissor implements IChoice {
    @Override
    public Choice getChoice() {
        return Choice.SCISSOR;
    }

    @Override
    public Boolean compare(IChoice choice) {
        if (choice.getChoice().equals(Choice.SCISSOR)) {
            throw new DrawException();
        }

        return choice.getChoice().equals(Choice.PAPER);
    }
}
