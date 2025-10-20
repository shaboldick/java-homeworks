package ru.qa.lesson.lesson_3;

public class Product {
    private final String name;
    private final String productionDate;
    private final String manufacturer;
    private final String countryOfOrigin;
    private final double price;
    private final boolean isBooked;

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
}