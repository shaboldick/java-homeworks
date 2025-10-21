package ru.qa.lesson.lesson_3;

public class Park {


    public static class Attraction {
        private String name;
        private String workingHours;
        private double ticketPrice;

        public Attraction(String name, String workingHours, double ticketPrice) {
            this.name = name;
            this.workingHours = workingHours;
            this.ticketPrice = ticketPrice;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость билета: " + ticketPrice);
            System.out.println("------------------------");
        }
    }
}