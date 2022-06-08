package ru.otus.unit;

import ru.otus.game.DiceImpl;

public class DiceImplTest {
    private final DiceImpl dice = new DiceImpl();

    public void testRollValues() {
        String scenario = "Dice roll value bounds test";

        try {
            int rollValue = dice.roll();

            if ((rollValue > 6) || (rollValue < 1)) {
                throw new AssertionError("Dice roll value should be in range 1 to 6");
            }

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" failed with message \"%s\" %n", scenario, e.getMessage());
        }
    }

}
