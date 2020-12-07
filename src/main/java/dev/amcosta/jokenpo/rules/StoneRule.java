package dev.amcosta.jokenpo.rules;

import dev.amcosta.jokenpo.ChoicesEnum;

public class StoneRule implements Comparable {

    @Override
    public int compareTo(Object o) {
        ChoicesEnum choice = ChoicesEnum.valueOf(o);

        if (choice == ChoicesEnum.SCISSORS) {
            return 1;
        }

        if (choice == ChoicesEnum.PAPER) {
            return -1;
        }

        return 0;
    }
}
