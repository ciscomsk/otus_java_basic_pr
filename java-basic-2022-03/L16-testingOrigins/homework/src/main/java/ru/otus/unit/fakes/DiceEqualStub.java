package ru.otus.unit.fakes;

import ru.otus.game.Dice;

public class DiceEqualStub implements Dice {
    private final int rollValue;

    public DiceEqualStub(int value) {
        this.rollValue = value;
    }

    @Override
    public int roll() {
        return rollValue;
    }
}
