package ru.qa.lesson.lesson_4.tests;

import ru.qa.lesson.lesson_4.zoo.*;

public class AnimalTest {

    public static void testCatsAndFoodBowl() {
        FoodBowl bowl = new FoodBowl(50);

        Cat[] cats = {
                new Cat("Мурзик"),
                new Cat("Барсик"),
                new Cat("Рыжик"),
                new Cat("Пушок")
        };

        System.out.println("=== Кормим котов ===");
        for (Cat cat : cats) {
            cat.eat(bowl);
        }

        System.out.println("\n=== Статус котов после кормления ===");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " - сыт: " + cat.isFull());
        }

        System.out.println("\nВ миске осталось: " + bowl.getFoodAmount() + " еды.");
    }

    public static void testDog() {
        System.out.println("\n=== Тестирование собаки ===");
        Dog dog = new Dog("Бобик");
        dog.run(150);
        dog.swim(5);
        dog.swim(15);
    }
}