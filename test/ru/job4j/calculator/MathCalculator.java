package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double sumOfSubtractAndDivide(double first, double second) {
        return subtract(first, second)
                + divide(first, second);
    }

    public static double sumOfSumAndMultiplyAndSubtractAndDivide(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtract(first, second)
                + divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumOfSubtractAndDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumOfSumAndMultiplyAndSubtractAndDivide(10, 20));
    }
}
