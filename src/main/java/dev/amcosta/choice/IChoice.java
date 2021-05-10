package dev.amcosta.choice;

import dev.amcosta.exception.DrawException;

public interface IChoice {
    public ChoiceEnum getChoice();
    public Boolean compare(IChoice choice) throws DrawException;
}
