package ru.otus.unit.fakes;

import ru.otus.game.GameWinnerPrinter;
import ru.otus.game.Player;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameWinnerStreamPrinter implements GameWinnerPrinter {
    private final ByteArrayOutputStream outputStream;

    public String getOutputStreamAsString() {
        return outputStream.toString();
    }

    public GameWinnerStreamPrinter() {
        this.outputStream = new ByteArrayOutputStream();
    }
    @Override
    public void printWinner(Player winner) {
        new PrintStream(outputStream).printf("Победитель: %s", winner.getName());
    }
}
