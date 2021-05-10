package dev.amcosta.game;

import dev.amcosta.Player;
import dev.amcosta.exception.DrawException;

public interface IGame {
    public Player play() throws DrawException;
}
