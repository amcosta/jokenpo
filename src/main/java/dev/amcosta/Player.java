package dev.amcosta;

import dev.amcosta.choice.IChoice;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Player {

    private final String name;
    private final List<IChoice> choices;
    private final ListIterator<IChoice> iterator;

    public Player(String name, IChoice choice) {
        this.name = name;
        this.choices = Arrays.asList(choice);
        this.iterator = this.choices.listIterator();
    }

    public Player(String name, List<IChoice> choices) {
        this.name = name;
        this.choices = choices;
        this.iterator = this.choices.listIterator();
    }

    public String getName() {
        return name;
    }

    public IChoice getChoice() throws ArrayIndexOutOfBoundsException {
        if (this.iterator.hasNext()) {
            return this.iterator.next();
        }

        throw new ArrayIndexOutOfBoundsException();
    }
}
