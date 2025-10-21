package ru.qa.lesson.lesson_4;

public interface Figure {
    double calculatePerimeter();
    double calculateArea();

    default String getFillColor() {
        return "white";
    }

    default String getBorderColor() {
        return "black";
    }

    default void printInfo() {
        System.out.printf("Периметр: %.2f%n", calculatePerimeter());
        System.out.printf("Площадь: %.2f%n", calculateArea());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
        System.out.println("------------------------");
    }
}