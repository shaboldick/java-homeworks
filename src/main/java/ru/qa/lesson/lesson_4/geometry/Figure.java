package ru.qa.lesson.lesson_4.geometry;

public interface Figure {
    double calculatePerimeter();
    double calculateArea();

    default void printInfo() {
        System.out.printf("Фигура: %s%n", getClass().getSimpleName());
        System.out.printf("Периметр: %.2f%n", calculatePerimeter());
        System.out.printf("Площадь: %.2f%n", calculateArea());
        System.out.println("------------------------");
    }
}