package ru.qa.lesson.lesson_3;

public class Main {
    public static void main(String[] args) {
        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
                "Samsung Corp.", "Korea", 5999.0, true);

        productsArray[1] = new Product("iPhone 16 Pro", "15.03.2025",
                "Apple Inc.", "USA", 7999.0, false);

        productsArray[2] = new Product("Xiaomi 14", "10.01.2025",
                "Xiaomi Corporation", "China", 3999.0, true);

        productsArray[3] = new Product("Huawei Pura 70", "20.04.2025",
                "Huawei Technologies", "China", 4999.0, false);

        productsArray[4] = new Product("OnePlus 12", "05.05.2025",
                "OnePlus", "China", 4499.0, true);

        System.out.println("=== Товары ===");
        for (Product product : productsArray) {
            product.printInfo();
        }

        System.out.println("=== Аттракционы ===");
        Park rollerCoaster = new Park("Колесо Обрезания", "10:00 - 20:00", 150.0);
        rollerCoaster.printInfo();

        Park ferrisWheel = new Park("Русская Рулетка", "09:00 - 22:00", 100.0);
        ferrisWheel.printInfo();
    }

    static class Park {
        private String attractionName;
        private String workingHours;
        private double ticketPrice;

        public Park(String attractionName, String workingHours, double ticketPrice) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.ticketPrice = ticketPrice;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + attractionName);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость билета: " + ticketPrice);
            System.out.println("------------------------");
        }
    }
}