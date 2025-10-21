package ru.qa.lesson.lesson_3;

public class Product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isBooked;

    public Product(String name, String productionDate, String manufacturer,
                   String countryOfOrigin, double price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price);
        System.out.println("Бронирование покупателем: " + (isBooked ? "Да" : "Нет"));
        System.out.println("------------------------");
    }

    // Статический метод для получения массива товаров
    public static Product[] createProducts() {
        Product[] products = new Product[5];
        products[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5999.0, true);
        products[1] = new Product("iPhone 16 Pro", "15.03.2025", "Apple Inc.", "USA", 7999.0, false);
        products[2] = new Product("Xiaomi 14", "10.01.2025", "Xiaomi Corporation", "China", 3999.0, true);
        products[3] = new Product("Huawei Pura 70", "20.04.2025", "Huawei Technologies", "China", 4999.0, false);
        products[4] = new Product("OnePlus 12", "05.05.2025", "OnePlus", "China", 4499.0, true);
        return products;
    }
}