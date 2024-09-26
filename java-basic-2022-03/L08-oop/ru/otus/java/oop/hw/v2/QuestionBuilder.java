package ru.otus.java.oop.hw.v2;

public interface QuestionBuilder {
    public QuestionBuilder setQuestionText(String text);
    public QuestionBuilder setAnswers(Answer[] answers);
    public QuestionBuilder setCorrectAnswer(Answer answer);

    public Question build();
}
