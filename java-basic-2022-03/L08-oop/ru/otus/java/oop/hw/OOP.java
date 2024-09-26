package ru.otus.java.oop.hw;

import java.util.Scanner;

class Poll {
    private Question[] questions;
    private String[] userAnswers;
    private int correctAnswers = 0;
    private int wrongAnswers = 0;

    Scanner sc = new Scanner(System.in);

    public Poll(Question[] questions) {
        this.questions = questions;
        this.userAnswers = new String[questions.length];
    }

    public void startPoll() {
        for (int i = 0; i < questions.length; i++) {
            questions[i].showQuestion();
            questions[i].showAnswers();
            userAnswers[i] = getUserAnswer(i);

            if (userAnswers[i].equals(questions[i].getCorrectAnswer())) {
                correctAnswers++;
                System.out.println("Правильно\n");
            }
            else {
                wrongAnswers++;
                System.out.println("Неправильно\n");
            }
        }
    }

    public void showResults() {
        System.out.println("Результат: правильно " + correctAnswers + ", неправильно " + wrongAnswers);
    }

    private String getUserAnswer(int answerNumber) {
        return questions[answerNumber].getAnswer(sc.nextInt() - 1).getText();
    }
}

class Question {
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

    public void showQuestion() {
        System.out.println(text);
    }

    public void showAnswers() {
        for (int i = 0; i < answers.length; i++) {
            System.out.println((i + 1) + ". " + answers[i].getText());
        }
    }

    public String getCorrectAnswer() {
        return correctAnswer.getText();
    }

    public Answer getAnswer(int answerNumber) {
        return answers[answerNumber];
    }
}

class Answer {
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

public class OOP {
    public static void main(String[] args) {

        Answer answer1 = new Answer("да");
        Answer answer2 = new Answer("нет");
        Answer answer3 = new Answer("возможно");

        Answer answer4 = new Answer("flatMap[B](f: A => B): F[B]");
        Answer answer5 = new Answer("flatMap[B](f: A => F[B]): F[B]");
        Answer answer6 = new Answer("flatmap[B](f: A => Unit): Unit");

        Answer answer7 = new Answer("да - с помощью () => Future");
        Answer answer8 = new Answer("да - при объявлении его в for-comprehension");
        Answer answer9 = new Answer("верны варианты 2 и 3");

        Answer[] answersArr1 = {answer1, answer2, answer3};
        Answer[] answersArr2 = {answer4, answer5, answer6};
        Answer[] answersArr3 = {answer2, answer7, answer8, answer9};

        Question question1 = new Question(
                "Если тип данных является монадой - справедливо ли утверждение, что он является функтором?",
                answersArr1,
                answer1
        );

        Question question2 = new Question(
                "Выберете правильную сигнатуру метода FlatMap в Scala",
                answersArr2,
                answer5
        );

        Question question3 = new Question(
                "В Scala тип данных Future является не ленивым(eager) по умолчанию - возможно ли сделать его ленивым(lazy)?",
                answersArr3,
                answer9
        );

        Question[] questionsArr = {question1, question2, question3};

        Poll poll = new Poll(questionsArr);
        poll.startPoll();
        poll.showResults();
    }
}
