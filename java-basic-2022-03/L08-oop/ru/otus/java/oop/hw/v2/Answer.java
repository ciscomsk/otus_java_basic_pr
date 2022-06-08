package ru.otus.java.oop.hw.v2;

public class Answer {
    private String text;

    public Answer(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Answer text should not be blank or null");
        }

        this.text = text;
    }

    public String getText() {
        return text;
    }
}
