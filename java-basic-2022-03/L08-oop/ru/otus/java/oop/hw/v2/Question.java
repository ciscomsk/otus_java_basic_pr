package ru.otus.java.oop.hw.v2;

public class Question {
    private String text;
    private Answer[] answers;
    private Answer correctAnswer;

    public Question(String text, Answer[] answers, Answer correctAnswer) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Question text should not be blank/null");
        }

        if (correctAnswer == null) {
            throw new IllegalArgumentException("Correct answer text should not be null");
        }

        if (answers == null || answers.length == 0) {
            throw new IllegalArgumentException("Answers array should not be blank/empty");
        }

        this.text = text;
        this.answers = answers;
        this.correctAnswer = correctAnswer;
    }

    public String getText() {
        return text;
    }

    public Answer[] getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer.getText();
    }

    public Answer getAnswer(int answerNumber) {
        return answers[answerNumber];
    }
}
