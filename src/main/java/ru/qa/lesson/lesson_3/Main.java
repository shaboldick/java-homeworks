package ru.qa.lesson.lesson_3;

public class Main {
    public static void main(String[] args) {
        // === Товары ===
        System.out.println("=== Товары ===");
        Product[] products = Product.createProducts();
        for (Product product : products) {
            product.printInfo();
        }

        // === Парк с аттракционами ===
        System.out.println("=== Парк с аттракционами ===");
        Park park = new Park();
        park.printAllAttractions();
    }
}