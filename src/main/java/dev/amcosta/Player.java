package dev.amcosta;

import dev.amcosta.choice.IChoice;

public class Player {

    private final String name;
    private final IChoice choice;

    public Player(String name, IChoice choice) {
        this.name = name;
        this.choice = choice;
    }

    public String getName() {
        return name;
    }

    public IChoice getChoice() {
        return choice;
    }
}
