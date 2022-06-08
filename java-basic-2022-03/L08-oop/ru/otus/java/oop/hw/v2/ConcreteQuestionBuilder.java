package ru.otus.java.oop.hw.v2;

public class ConcreteQuestionBuilder implements QuestionBuilder {
    private String text;
    private Answer[] answers;
    private Answer correctAnswer;

    @Override
    public QuestionBuilder setQuestionText(String text) {
        System.out.println("Adding question text");
        this.text = text;
        return this;
    }

    @Override
    public QuestionBuilder setAnswers(Answer[] answers) {
        System.out.println("Adding possible answers");
        this.answers = answers;
        return this;
    }

    @Override
    public QuestionBuilder setCorrectAnswer(Answer answer) {
        System.out.println("Adding correct answer");
        this.correctAnswer = answer;
        return this;
    }

    @Override
    public Question build() {
        return new Question(text, answers, correctAnswer);
    }
}
