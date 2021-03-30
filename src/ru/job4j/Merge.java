package ru.job4j;

import java.util.Arrays;

public class Merge {

    public static   int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int positionResult = 0;
        int positionLeft = 0;
        int positionRight = 0;
        while (positionLeft < left.length || positionRight < right.length) {
            if (positionLeft < left.length && positionRight < right.length) {
                if (left[positionLeft] <= right[positionRight]) {
                    rsl[positionResult++] = left[positionLeft++];
                } else {
                    rsl[positionResult++] = right[positionRight++];
                }
            } else {
                if (positionLeft < left.length) {
                    rsl[positionResult++] = left[positionLeft++];
                } else {
                    rsl[positionResult++] = right[positionRight++];
                }
            }
        }
        return rsl;
    }

}
