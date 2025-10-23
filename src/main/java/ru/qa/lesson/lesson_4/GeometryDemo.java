package ru.qa.lesson.lesson_4;

public class GeometryDemo {
    public static void runDemo() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("=== ЗАДАНИЕ 2: ГЕОМЕТРИЧЕСКИЕ ФИГУРЫ ===");
        System.out.println("=".repeat(50));

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("Круг:");
        circle.printInfo();

        System.out.println("Прямоугольник:");
        rectangle.printInfo();

        System.out.println("Треугольник:");
        triangle.printInfo();
    }
}