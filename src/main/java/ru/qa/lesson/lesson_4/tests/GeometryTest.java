package ru.qa.lesson.lesson_4.tests;

import ru.qa.lesson.lesson_4.geometry.*;

public class GeometryTest {

    public static void testFigures() {
        Figure[] figures = {
                new Circle("красный", "чёрный", 5.0),
                new Rectangle("синий", "белый", 4.0, 7.0),
                new Triangle("зелёный", "жёлтый", 3.0, 4.0, 5.0)
        };

        System.out.println("\n=== Тестирование геометрических фигур ===");
        for (Figure figure : figures) {
            System.out.println("Фигура: " + figure);
            figure.printInfo(); // Используем дефолтный метод
            System.out.println("---------------");
        }
    }
}