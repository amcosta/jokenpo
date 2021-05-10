package dev.amcosta;

import dev.amcosta.choice.IChoice;

import java.util.Arrays;
import java.util.List;

public class Player {

    private final String name;
    private final List<IChoice> choices;

    public Player(String name, IChoice choice) {
        this.name = name;
        this.choices = Arrays.asList(choice);
    }

    public Player(String name, List<IChoice> choices) {
        this.name = name;
        this.choices = choices;
    }

    public String getName() {
        return name;
    }

    public IChoice getChoice() throws ArrayIndexOutOfBoundsException {
        if (this.choices.iterator().hasNext()) {
            return this.choices.iterator().next();
        }

        throw new ArrayIndexOutOfBoundsException();
    }
}
