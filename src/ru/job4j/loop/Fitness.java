package ru.job4j.loop;

public class Fitness {

    public static int calc(int ivan, int nik) {
        int month = 0;
        int powerIvan = ivan;
        int powerNik = nik;
        while (powerIvan <= powerNik) {
            month += 1;
            powerIvan *= 3;
            powerNik *= 2;
        }
        return month;
    }

}

