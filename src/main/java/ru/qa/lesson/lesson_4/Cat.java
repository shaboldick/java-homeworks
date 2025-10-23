package ru.qa.lesson.lesson_4;

public class Cat extends Animal {
    private static int count = 0;
    private boolean isHungry = true;
    private FoodBowl bowl; // ссылка на общую миску
    private int foodEaten = 0; // сколько еды съел кот

    public Cat(String name, FoodBowl bowl) {
        super(name, 200, 0); // Кот не умеет плавать
        this.bowl = bowl;
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    // Метод, чтобы кот мог есть из миски
    public void eat(int amount) {
        if (amount < 0) {
            System.out.println(name + " не может съесть отрицательное количество еды!");
            return;
        }

        if (!isHungry) {
            System.out.println(name + " не голоден.");
            return;
        }

        if (bowl.takeFood(amount)) {
            isHungry = false;
            foodEaten = amount;
            System.out.println(name + " поел " + amount + " еды.");
        } else {
            System.out.println(name + " хочет есть, но еды нет.");
        }
    }

    // Метод, чтобы проверить, голоден ли кот
    public boolean isHungry() {
        return isHungry;
    }

    // Метод, чтобы получить, сколько кот съел
    public int getFoodEaten() {
        return foodEaten;
    }

    public static int getCount() {
        return count;
    }
}