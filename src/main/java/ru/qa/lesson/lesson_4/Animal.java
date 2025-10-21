package ru.qa.lesson.lesson_4;

public abstract class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public abstract void run(int distance);
    public abstract void swim(int distance);

    @Override
    public String toString() {
        return name;
    }
}