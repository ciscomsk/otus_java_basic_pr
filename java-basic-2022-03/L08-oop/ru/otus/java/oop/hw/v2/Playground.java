package ru.otus.java.oop.hw.v2;

public class Playground {
    public static void main(String[] args) {

        var answer1 = new Answer("да");
        var answer2 = new Answer("нет");
        var answer3 = new Answer("возможно");

        var answer4 = new Answer("flatMap[B](f: A => B): F[B]");
        var answer5 = new Answer("flatMap[B](f: A => F[B]): F[B]");
        var answer6 = new Answer("flatmap[B](f: A => Unit): Unit");

        var answer7 = new Answer("да - с помощью () => Future");
        var answer8 = new Answer("да - при объявлении его в for-comprehension");
        var answer9 = new Answer("верны варианты 2 и 3");

        // var ??
        Answer[] answersArr1 = {answer1, answer2, answer3};
        Answer[] answersArr2 = {answer4, answer5, answer6};
        Answer[] answersArr3 = {answer2, answer7, answer8, answer9};

        var builder = new ConcreteQuestionBuilder();
        var author = new Director(builder);

        var question1 = author.createQuestion(
                "Если тип данных является монадой - справедливо ли утверждение, что он является функтором?",
                answersArr1,
                answer1
        );

        var question2 = author.createQuestion(
                "Выберете правильную сигнатуру метода FlatMap в Scala",
                answersArr2,
                answer5
        );

        var question3 = author.createQuestion(
                "В Scala тип данных Future является не ленивым(eager) по умолчанию - возможно ли сделать его ленивым(lazy)?",
                answersArr3,
                answer9
        );

        Question[] questionsArr = {question1, question2, question3};

        var poll = new Poll(questionsArr);
        poll.startPoll();
        UserConsoleInteraction.showPollResults(poll);
    }
}
