package ru.job4j.loop;

public class Mortgage {

    public static int year(int amount, int salary, double percent) {
        int year = 0;
        int currentSum = amount;
        while (currentSum > 0) {
            year++;
            currentSum += currentSum / 100 * percent - salary;
        }
        return year;
    }

}
