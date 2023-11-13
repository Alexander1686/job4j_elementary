package ru.job4j.loop;

 public class Mortgage {
  public static int year(double amount, int salary, double percent) {
      int year = 0;
        while (amount > 0) {
            amount = amount + (amount * percent);
            amount -= salary;
            year++;
      }
      return year;

    }

     public static void main(String[] args) {
         System.out.println(Mortgage.year(1000, 1200, 0.1));
         System.out.println(Mortgage.year(100, 120, 0.5));
         System.out.println(Mortgage.year(100, 120, 0.2));
     }
 }
