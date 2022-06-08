package ru.otus.unit.fakes;

import ru.otus.game.Dice;

public class DiceNonEqualStub implements Dice {
    private boolean firstRoll = true;

    @Override
    public int roll() {
        if (firstRoll) {
            firstRoll = false;
            return 5;
        }

        return 3;
    }
}
