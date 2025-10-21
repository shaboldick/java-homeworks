package ru.qa.lesson.lesson_4;

public class Main {
    public static void main(String[] args) {

        FoodBowl bowl = new FoodBowl(20); // начальное количество еды

        Animal[] animals = new Animal[5];

        animals[0] = new Dog("Бобик");
        animals[1] = new Cat("Мурзик", bowl);
        animals[2] = new Dog("Шарик");
        animals[3] = new Cat("Васька", bowl);
        animals[4] = new Dog("Дружок");

        System.out.println("=== Статистика ===");
        System.out.println("Всего  собак: " + Dog.getCount());
        System.out.println("Всего  котов: " + Cat.getCount());

        System.out.println("\n=== Действия животных ===");
        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(5);
        }

        Cat cat1 = (Cat) animals[1];
        Cat cat2 = (Cat) animals[3];

        System.out.println("\n=== Кормление котов ===");
        cat1.eat(10);
        cat2.eat(5);

        System.out.println("\n=== Добавление еды в миску ===");
        bowl.addFood(10);

        System.out.println("\n=== Попытка съесть больше еды ===");
        cat1.eat(15);

        System.out.println("\n=== Информация о котах ===");
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println(cat.name + " — голоден: " + cat.isHungry() + ", съел: " + cat.getFoodEaten() + " еды.");
            }
        }

        System.out.println("\n=== Остаток еды в миске ===");
        System.out.println("В миске осталось: " + bowl.getFoodAmount() + " еды.");

        if (bowl.getFoodAmount() < 10) {
            System.out.println(" В миске мало еды!");
        } else {
            System.out.println(" В миске достаточно еды.");
        }


        System.out.println("\n" + "=".repeat(50));
        System.out.println("=== ГЕОМЕТРИЧЕСКИЕ ФИГУРЫ ===");
        System.out.println("=".repeat(50));

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        System.out.println("Круг:");
        circle.printInfo();

        System.out.println("Прямоугольник:");
        rectangle.printInfo();

        System.out.println("Треугольник:");
        triangle.printInfo();
    }
}