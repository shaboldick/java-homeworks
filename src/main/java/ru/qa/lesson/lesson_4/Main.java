package ru.qa.lesson.lesson_4;

import ru.qa.lesson.lesson_4.zoo.Zoo;
import ru.qa.lesson.lesson_4.geometry.Circle;
import ru.qa.lesson.lesson_4.geometry.Rectangle;
import ru.qa.lesson.lesson_4.geometry.Triangle;

public class Main {
    public static void main(String[] args) {
        // Запуск зоопарка
        Zoo zoo = new Zoo();
        zoo.simulateDay();

        // Демонстрация геометрических фигур
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ДЕМОНСТРАЦИЯ ГЕОМЕТРИЧЕСКИХ ФИГУР");
        System.out.println("=".repeat(50));

        new Circle(5.0).printInfo();
        new Rectangle(4.0, 6.0).printInfo();
        new Triangle(3.0, 4.0, 5.0).printInfo();
    }
}