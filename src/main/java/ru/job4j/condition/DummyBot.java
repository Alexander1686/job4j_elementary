package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String answer = "I don't know. Please, ask another question.";
        if ("Hi, Bot.".equals(question)) {
            answer = "Hi, SmartAss.";
        }
        if ("Bye.".equals(question)) {
            answer = "See you later.";
        }
        return answer;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye.");
        System.out.println(rsl);
    }
}