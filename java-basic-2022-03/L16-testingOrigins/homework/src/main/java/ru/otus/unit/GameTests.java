package ru.otus.unit;

import ru.otus.assertions.Assertions;
import ru.otus.game.Dice;
import ru.otus.game.Game;
import ru.otus.game.Player;
import ru.otus.unit.fakes.DiceEqualStub;
import ru.otus.unit.fakes.DiceNonEqualStub;
import ru.otus.unit.fakes.GameWinnerStreamPrinter;

public class GameTests {
    public void testGameWithEqualDiceValues() {
        String scenario = "In case of equal values of the players - the game must end in a draw";

        try {
            Dice dice = new DiceEqualStub(3);
            GameWinnerStreamPrinter winnerPrinter = new GameWinnerStreamPrinter();
            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));

            String expected = "Победитель: Ничья";
            String actual = winnerPrinter.getOutputStreamAsString();
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" failed with message \"%s\" %n", scenario, e.getMessage());
        }
    }

    public void testGameWithNonEqualsDiceValues() {
        String scenario = "In case of non equal values of the players - player with the higher value should be the winner";

        try {
            Dice dice = new DiceNonEqualStub();
            GameWinnerStreamPrinter winnerPrinter = new GameWinnerStreamPrinter();
            Game game = new Game(dice, winnerPrinter);
            game.playGame(new Player("Вася"), new Player("Игорь"));

            String expected = "Победитель: Вася";
            String actual = winnerPrinter.getOutputStreamAsString();
            Assertions.assertEquals(expected, actual);

            System.out.printf("\"%s\" passed %n", scenario);
        } catch (Throwable e) {
            System.err.printf("\"%s\" failed with message \"%s\" %n", scenario, e.getMessage());
        }
    }
}
