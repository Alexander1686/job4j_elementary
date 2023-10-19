package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "вторник", "tuesday" -> 2;
            case "среда", "wednesday" -> 3;
            case "четверг", "thursday" -> 4;
            case "пятница", "friday" -> 5;
            case "суббота", "saturday" -> 6;
            case "воскресенье", "sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        int rsl = numberOfDay("tuesday");
        System.out.println(rsl);
    }
}