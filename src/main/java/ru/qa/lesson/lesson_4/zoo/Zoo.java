package ru.qa.lesson.lesson_4.zoo;

public class Zoo {
    private final FoodBowl bowl = new FoodBowl(20);
    private final Animal[] animals;

    public Zoo() {
        animals = new Animal[]{
                new Dog("Пес"),
                new Cat("Кот", bowl),
                new Dog("Псина"),
                new Cat("Кошка", bowl),
                new Dog("Собакен")
        };
    }

    public void simulateDay() {
        System.out.println("=== УТРО В ПИТОМНИКЕ ===");
        System.out.println("Собак: " + Dog.getCount() + ", Котов: " + Cat.getCount());

        System.out.println("\n--- АКТИВНОСТЬ ---");
        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(5);
        }

        System.out.println("\n--- КОРМЛЕНИЕ ---");
        for (Animal animal : animals) {
            if (animal instanceof Cat cat) {
                cat.eat(10);
            }
        }

        bowl.addFood(10);

        System.out.println("\n--- ИТОГИ ДНЯ ---");
        for (Animal animal : animals) {
            if (animal instanceof Cat cat) {
                System.out.printf("%s: съел %d, голоден: %s%n",
                        cat.name, cat.getFoodEaten(), cat.isHungry());
            }
        }
        System.out.println("Остаток еды в миске: " + bowl.getFoodAmount());
    }
}