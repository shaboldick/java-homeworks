package ru.qa.lesson.lesson_4.zoo;

public class Cat extends Animal {
    private boolean isFull = false;

    public Cat(String name) {
        super(name, 200, 0);
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(FoodBowl bowl) {
        if (isFull) {
            System.out.println(name + " уже сыт и не ест.");
            return;
        }

        int foodNeeded = (int) (Math.random() * 11) + 10; // 10-20
        if (bowl.getFoodAmount() >= foodNeeded) {
            bowl.reduceFood(foodNeeded);
            isFull = true;
            System.out.println(name + " поел и насытился! Съел: " + foodNeeded + " еды.");
        } else {
            System.out.println(name + " хотел поесть " + foodNeeded + " еды, но в миске только " + bowl.getFoodAmount() + ". Не хватило!");
        }
    }
}