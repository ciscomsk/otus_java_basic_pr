package ru.otus.java.oop.hw.v2;

import java.util.Scanner;

public class Poll {
    private Question[] questions;
    private String[] userAnswers;
    private int correctAnswersNumber = 0;
    private int wrongAnswersNumber = 0;

    Scanner sc = new Scanner(System.in);

    public Poll(Question[] questions) {
        this.questions = questions;
        this.userAnswers = new String[questions.length];
    }

    public void startPoll() {
        for (int i = 0; i < questions.length; i++) {
            UserConsoleInteraction.showQuestion(questions[i]);
            UserConsoleInteraction.showAnswers(questions[i]);
            userAnswers[i] = getUserAnswer(i);

            if (userAnswers[i].equals(questions[i].getCorrectAnswer())) {
                correctAnswersNumber++;
                UserConsoleInteraction.outputStr("Правильно\n");
            }
            else {
                wrongAnswersNumber++;
                UserConsoleInteraction.outputStr("Неправильно\n");
            }
        }
    }

    public int getCorrectAnswersNumber() {
        return correctAnswersNumber;
    }

    public int getWrongAnswersNumber() {
        return wrongAnswersNumber;
    }

    private String getUserAnswer(int answerNumber) {
        return questions[answerNumber].getAnswer(sc.nextInt() - 1).getText();
    }
}
