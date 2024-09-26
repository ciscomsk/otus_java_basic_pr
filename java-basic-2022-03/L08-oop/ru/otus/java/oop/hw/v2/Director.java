package ru.otus.java.oop.hw.v2;

public class Director {
    private QuestionBuilder builder;

    public Director(QuestionBuilder builder) {
        if (builder == null) throw new IllegalArgumentException("Question builder should not be null");
        this.builder = builder;
    }

    public Question createQuestion(String text, Answer[] answers, Answer correctAnswer) {
        return builder.setQuestionText(text).setAnswers(answers).setCorrectAnswer(correctAnswer).build();
    }
}
