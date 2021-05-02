package dev.amcosta.choice;

public interface IChoice {
    public Choice getChoice();
    public Boolean compare(IChoice choice);
}
