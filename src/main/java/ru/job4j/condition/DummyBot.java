package ru.job4j.condition;

public class DummyBot {

    public static String answer(String question) {
        String answer;
        if ("Hi, Bot.".equals(question)) {
            answer = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) {
            answer = "See you later.";
        } else {
            answer = "I don't know. Please, ask another question.";
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