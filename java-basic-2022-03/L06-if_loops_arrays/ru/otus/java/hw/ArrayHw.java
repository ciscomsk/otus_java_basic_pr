package ru.otus.java.hw;

import java.util.Scanner;

public class ArrayHw {
    public static void main(String[] args) {
        int rightAns = 0;
        int wrongAns = 0;

        // v1 - 1 two-dimensional array
//        String[][] pollData = {
//                {"Если тип данных является монадой - справедливо ли утверждение, что он является функтором?",
//                        "да",
//                        "нет",
//                        "возможно",
//                        "1"},
//                {"Выберете правильную сигнатуру метода FlatMap в Scala",
//                        "flatMap[B](f: A => B): F[B]",
//                        "flatMap[B](f: A => F[B]): F[B]",
//                        "flatmap[B](f: A => Unit): Unit",
//                        "2"},
//                {"В Scala тип данных Future является не ленивым(eager) по умолчанию - возможно ли сделать его ленивым(lazy)?",
//                        "нет",
//                        "да - с помощью () => Future",
//                        "да - при объявлении его в for-comprehension",
//                        "верны варианты 2 и 3",
//                        "4"
//                }
//        };
//
//        for (String[] question : pollData) {
//            for (int i = 0; i < question.length - 1; i++) {
//                if (i == 0) System.out.println(question[i]);
//                else System.out.println(i +". " + question[i]);
//
//                if (i == question.length - 2) {
//                    System.out.println("Ваш ответ: ");
//                    String answer = new Scanner(System.in).nextLine().trim();
//
//                    if (answer.equals(question[question.length - 1])) {
//                        System.out.println("Правильно");
//                        rightAns++;
//                    }
//                    else {
//                        System.out.println("Неправильно");
//                        wrongAns++;
//                    }
//                    System.out.println();
//                }
//            }
//        }

        // v2 - multiple arrays
//        String[] questions = {
//                "Если тип данных является монадой - справедливо ли утверждение, что он является функтором?",
//                "Выберете правильную сигнатуру метода FlatMap в Scala",
//                "В Scala тип данных Future является не ленивым(eager) по умолчанию - возможно ли сделать его ленивым(lazy)?"
//        };
//
//        String[][] answerOptions = {
//                {
//                        "да",
//                        "нет",
//                        "возможно"
//                },
//                {
//                        "flatMap[B](f: A => B): F[B]",
//                        "flatMap[B](f: A => F[B]): F[B]",
//                        "flatmap[B](f: A => Unit): Unit"
//                },
//                {
//                        "нет",
//                        "да - с помощью () => Future",
//                        "да - при объявлении его в for-comprehension",
//                        "верны варианты 2 и 3",
//                }
//        };
//
//        String[] correctAnswers = {"1", "2", "4"};
//
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i < questions.length; i++) {
//            System.out.println(questions[i]);
//            for (int j = 0; j <answerOptions[i].length; j++) {
//                System.out.println((j + 1) + ". " + answerOptions[i][j]);
//            }
//
//            System.out.println("Ваш ответ: ");
//            String answer = sc.nextLine().trim();
//
//            if (answer.equals(correctAnswers[i])) {
//                System.out.println("Правильно");
//                rightAns++;
//            } else {
//                System.out.println("Неправильно");
//                wrongAns++;
//            }
//
//            System.out.println();
//        }

        // v3 - 1 three-dimensional array
//        String[][][] pollData =
        Object[][][] pollData =
                {
                        {
                                {"Если тип данных является монадой - справедливо ли утверждение, что он является функтором?"},
                                {
                                        "да",
                                        "нет",
                                        "возможно"
                                },
//                                {"1"}
                                {Integer.valueOf(1)}
                        },
                        {
                                {"Выберете правильную сигнатуру метода FlatMap в Scala"},
                                {
                                        "flatMap[B](f: A => B): F[B]",
                                        "flatMap[B](f: A => F[B]): F[B]",
                                        "flatmap[B](f: A => Unit): Unit"
                                },
//                                {"2"}
                                {Integer.valueOf(2)}
                        },
                        {
                                {"В Scala тип данных Future является не ленивым(eager) по умолчанию - возможно ли сделать его ленивым(lazy)?"},
                                {
                                        "нет",
                                        "да - с помощью () => Future",
                                        "да - при объявлении его в for-comprehension",
                                        "верны варианты 2 и 3"
                                },
//                                {"4"}
                                {Integer.valueOf(4)}
                        }
                };

        Scanner sc = new Scanner(System.in);

        for (Object[][] question : pollData) {
            for (int i = 0; i < question.length - 1; i++) {
                for (int j = 0; j < question[i].length; j++) {

                    if (i == 0) System.out.println(question[i][j]);
                    else System.out.println((j + 1) + ". " + question[i][j]);

                    if (i == 1 && j == question[i].length - 1) {
                        System.out.println("Ваш ответ: ");
                        String answer = sc.nextLine().trim();

//                        if (answer.equals(question[2][0])) {
                        if (answer.equals(question[2][0].toString())) {
                            System.out.println("Правильно");
                            rightAns++;
                        } else {
                            System.out.println("Неправильно");
                            wrongAns++;
                        }
                        System.out.println();
                    }
                }
            }
        }

        System.out.println("Результат: правильно " + rightAns + ", неправильно " + wrongAns);
    }
}

