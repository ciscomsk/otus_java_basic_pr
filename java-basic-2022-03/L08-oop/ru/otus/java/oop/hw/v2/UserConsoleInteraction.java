package ru.otus.java.oop.hw.v2;

public class UserConsoleInteraction {
    static void outputStr(String str) {
        System.out.println(str);
    }

    static void showQuestion(Question question) {
        outputStr(question.getText());
    }

    static void showAnswers(Question question) {
        var answers = question.getAnswers();
        for (int i = 0; i < answers.length; i++) {
            System.out.println((i + 1) + ". " + answers[i].getText());
        }
    }

    static void showPollResults(Poll poll) {
        outputStr("Результат: правильно " + poll.getCorrectAnswersNumber() + ", неправильно " + poll.getWrongAnswersNumber());
    }
}
