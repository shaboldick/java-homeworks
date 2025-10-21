package ru.qa.lesson.lesson_4;

public class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialFood) {
        this.foodAmount = initialFood;
    }

    // Метод, чтобы добавить еду в миску
    public void addFood(int amount) {
        if (amount < 0) {
            System.out.println(" Нельзя добавить отрицательное количество еды!");
            return;
        }
        this.foodAmount += amount;
        System.out.println(" Добавлено " + amount + " еды. В миске теперь: " + foodAmount);
    }

    // Метод, чтобы взять еду из миски
    public boolean takeFood(int amount) {
        if (amount < 0) {
            System.out.println(" Нельзя взять отрицательное количество еды!");
            return false;
        }

        if (foodAmount >= amount) {
            foodAmount -= amount;
            System.out.println(" Взято " + amount + " еды. В миске осталось: " + foodAmount);
            return true;
        } else {
            System.out.println(" Недостаточно еды в миске. Требуется: " + amount + ", доступно: " + foodAmount);
            return false;
        }
    }

    // Получить текущее количество еды
    public int getFoodAmount() {
        return foodAmount;
    }
}