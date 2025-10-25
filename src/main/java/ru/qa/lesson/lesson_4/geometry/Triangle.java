package ru.qa.lesson.lesson_4.geometry;

public class Triangle implements Figure {
    private double sideA;
    private double sideB;
    private double sideC;
    private String fillColor;
    private String borderColor;

    public Triangle(String fillColor, String borderColor, double sideA, double sideB, double sideC) {
        this.fillColor = fillColor;
        this.borderColor = borderColor;

        if (!isValidTriangle(sideA, sideB, sideC)) {
            throw new IllegalArgumentException("Треугольник с такими сторонами невозможен.");
        }

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double calculateArea() {
        double p = calculatePerimeter() / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    @Override
    public String getFillColor() {
        return fillColor;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public String toString() {
        return "Треугольник (цвет фона: " + fillColor + ", цвет границы: " + borderColor + ")";
    }
}