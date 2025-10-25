package ru.qa.lesson.lesson_4.geometry;

public interface Figure {

    default double calculatePerimeter() {
        throw new UnsupportedOperationException("Метод calculatePerimeter должен быть реализован.");
    }

    default double calculateArea() {
        throw new UnsupportedOperationException("Метод calculateArea должен быть реализован.");
    }

    String getFillColor();
    String getBorderColor();

    default void printInfo() {
        System.out.printf(
                "Периметр: %.2f, Площадь: %.2f, Цвет фона: %s, Цвет границы: %s%n",
                calculatePerimeter(),
                calculateArea(),
                getFillColor(),
                getBorderColor()
        );
    }
}