package ru.qa.lesson.lesson_4;

public class Main {
    public static void main(String[] args) {
        // Запуск зоопарка
        Zoo zoo = new Zoo();
        zoo.runSimulation();

        // Запуск демонстрации фигур
        GeometryDemo.runDemo();
    }
}