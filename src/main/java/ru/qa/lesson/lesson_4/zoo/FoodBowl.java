package ru.qa.lesson.lesson_4.zoo;

public class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialAmount) {
        this.foodAmount = initialAmount;
    }

    public synchronized int takeFood(int requested) {
        int taken = Math.min(requested, foodAmount);
        foodAmount -= taken;
        return taken;
    }

    public void addFood(int amount) {
        foodAmount += amount;
        System.out.println("В миску добавлено " + amount + " еды. Теперь: " + foodAmount);
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}