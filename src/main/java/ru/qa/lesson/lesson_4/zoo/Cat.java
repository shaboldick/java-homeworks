package ru.qa.lesson.lesson_4.zoo;

public class Cat extends Animal {
    private static int count = 0;
    private final FoodBowl bowl;
    private int foodEaten = 0;

    public Cat(String name, FoodBowl bowl) {
        super(name, 200, 0); // коты не плавают
        this.bowl = bowl;
        count++;
    }

    public void eat(int amount) {
        int eaten = bowl.takeFood(amount);
        foodEaten += eaten;
        if (eaten < amount) {
            System.out.println(name + " не смог съесть всё — не хватило еды.");
        }
    }

    public boolean isHungry() {
        return foodEaten < 10; // считаем голодным, если съел < 10
    }

    public int getFoodEaten() {
        return foodEaten;
    }

    public static int getCount() {
        return count;
    }
}