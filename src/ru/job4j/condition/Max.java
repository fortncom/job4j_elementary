package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int trird) {
        return max(first, max(second, trird));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, second, max(third, fourth));
    }

}
