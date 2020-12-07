package dev.amcosta.jokenpo;

public class Player implements Comparable {

    private final String name;
    private final String choice;

    public Player(String name, String choice) {
        this.name = name;
        this.choice = choice;
    }

    public String getName() {
        return this.name;
    }

    public String getChoice() {
        return this.choice;
    }
}
