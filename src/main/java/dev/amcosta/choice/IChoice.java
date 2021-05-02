package dev.amcosta.choice;

public interface IChoice {
    public ChoiceEnum getChoice();
    public Boolean compare(IChoice choice);
}
