package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] rsl = new int[size][size];
        for (int row = 0; row < rsl.length; row++) {
            for (int cell = 0; cell < rsl.length; cell++) {
                rsl[row][cell] = (cell + 1) * (row + 1);
            }
        }
        return rsl;
    }
}
