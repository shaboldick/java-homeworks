package ru.qa.lesson.lesson_3;

public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5999.0, true);
        products[1] = new Product("iPhone 16 Pro", "15.03.2025", "Apple Inc.", "USA", 7999.0, false);
        products[2] = new Product("Xiaomi 14", "10.01.2025", "Xiaomi Corporation", "China", 3999.0, true);
        products[3] = new Product("Huawei Pura 70", "20.04.2025", "Huawei Technologies", "China", 4999.0, false);
        products[4] = new Product("OnePlus 12", "05.05.2025", "OnePlus", "China", 4499.0, true);

        System.out.println("=== Товары ===");
        for (Product product : products) {
            product.printInfo();
        }

        System.out.println("=== Аттракционы ===");
        Park.Attraction rollerCoaster = new Park.Attraction("колесо обрезания", "10:00 - 20:00", 150.0);
        rollerCoaster.printInfo();

        Park.Attraction ferrisWheel = new Park.Attraction("русская рулетка", "09:00 - 22:00", 100.0);
        ferrisWheel.printInfo();
    }
}