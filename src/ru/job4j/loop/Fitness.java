package ru.job4j.loop;

public class Fitness {

    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan * Math.pow(3, month) <= nik * Math.pow(2, month)) {
            month += 1;
        }
        return month;
    }

}

