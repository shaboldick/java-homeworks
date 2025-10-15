package ru.qa.lesson.lesson_2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Задание 1: Вывести три слова ===");
        printThreeWords();
        System.out.println("---");

        System.out.println("=== Задание 2: Проверить знак суммы ===");
        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();
        checkSumSign(a, b);
        System.out.println("---");

        System.out.println("=== Задание 3: Вывести цвет по значению ===");
        System.out.print("Введите значение: ");
        int value = scanner.nextInt();
        printColor(value);
        System.out.println("---");

        System.out.println("=== Задание 4: Сравнить два числа ===");
        System.out.print("Введите a: ");
        a = scanner.nextInt();
        System.out.print("Введите b: ");
        b = scanner.nextInt();
        compareNumbers(a, b);
        System.out.println("---");

        System.out.println("=== Задание 5: Проверить сумму в диапазоне [10,20] ===");
        System.out.print("Введите a: ");
        a = scanner.nextInt();
        System.out.print("Введите b: ");
        b = scanner.nextInt();
        System.out.println("Сумма в диапазоне [10,20]: " + isSumInRange(a, b));
        System.out.println("---");

        System.out.println("=== Задание 6: Вывести знак числа ===");
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        printNumberSign(number);
        System.out.println("---");

        System.out.println("=== Задание 7: Проверить, отрицательное ли число ===");
        System.out.print("Введите число: ");
        number = scanner.nextInt();
        System.out.println("Число отрицательное: " + isNegative(number));
        System.out.println("---");

        System.out.println("=== Задание 8: Вывести строку N раз ===");
        System.out.print("Введите строку: ");
        String str = scanner.nextLine(); // нужно дважды, потому что nextInt() не забирает перенос
        str = scanner.nextLine();
        System.out.print("Введите количество раз: ");
        int n = scanner.nextInt();
        printStringNTimes(str, n);
        System.out.println("---");

        System.out.println("=== Задание 9: Проверить високосный год ===");
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        System.out.println("Год високосный: " + isLeapYear(year));
        System.out.println("---");

        System.out.println("=== Задание 10: Заменить 0 на 1, 1 на 0 в массиве ===");
        flipArray();
        System.out.println("---");

        System.out.println("=== Задание 11: Заполнить массив числами от 1 до 100 ===");
        fillArray100();
        System.out.println("---");

        System.out.println("=== Задание 12: Умножить числа < 6 на 2 ===");
        multiplyLessThan6();
        System.out.println("---");

        System.out.println("=== Задание 13: Заполнить диагонали единицами ===");
        fillDiagonal();
        System.out.println("---");

        System.out.println("=== Задание 14: Создать массив с начальным значением ===");
        System.out.print("Введите длину массива: ");
        int len = scanner.nextInt();
        System.out.print("Введите начальное значение: ");
        int initialValue = scanner.nextInt();
        int[] arr = createArray(len, initialValue);
        System.out.print("Массив: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        scanner.close();
    }

    /**
     * Выводит три слова: Orange, Banana, Apple.
     */
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    /**
     * Проверяет знак суммы двух чисел.
     * @param a первое число
     * @param b второе число
     */
    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    /**
     * Выводит цвет в зависимости от значения.
     * @param value значение
     */
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /**
     * Сравнивает два числа.
     * @param a первое число
     * @param b второе число
     */
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    /**
     * Проверяет, попадает ли сумма в диапазон [10, 20].
     * @param a первое число
     * @param b второе число
     * @return true, если сумма в диапазоне
     */
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /**
     * Выводит знак числа.
     * @param number число
     */
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    /**
     * Проверяет, отрицательное ли число.
     * @param number число
     * @return true, если отрицательное
     */
    public static boolean isNegative(int number) {
        return number < 0;
    }

    /**
     * Выводит строку n раз.
     * @param str строка
     * @param n количество раз
     */
    public static void printStringNTimes(String str, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    /**
     * Определяет, является ли год високосным.
     * @param year год
     * @return true, если високосный
     */
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    /**
     * Заменяет 0 на 1, 1 на 0 в массиве.
     */
    public static void flipArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Заполняет массив числами от 1 до 100.
     */
    public static void fillArray100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Умножает числа меньше 6 на 2.
     */
    public static void multiplyLessThan6() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /**
     * Заполняет диагонали квадратного массива единицами.
     */
    public static void fillDiagonal() {
        int size = 5;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;
            matrix[i][size - 1 - i] = 1;
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Создаёт массив заданной длины с начальным значением.
     * @param len длина массива
     * @param initialValue начальное значение
     * @return созданный массив
     */
    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }
}