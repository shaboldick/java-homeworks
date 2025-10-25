package ru.qa.lesson.lesson_4.zoo;

public class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("Добавлено " + amount + " еды. Всего в миске: " + foodAmount);
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        }
    }

    public void reduceFood(int amount) {
        if (amount > 0 && foodAmount >= amount) {
            foodAmount -= amount;
        }
    }
}