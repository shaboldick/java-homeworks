package ru.qa.lesson.lesson_3;

public class Park {
    private Attraction[] attractions;

    public Park() {
        attractions = new Attraction[3];
        attractions[0] = new Attraction("Roller Coaster", "10:00 - 20:00", 150.0);
        attractions[1] = new Attraction("Ferris Wheel", "09:00 - 22:00", 100.0);
        attractions[2] = new Attraction("Carousel", "10:00 - 18:00", 50.0);
    }

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

    public void printAllAttractions() {
        System.out.println("=== Аттракционы в парке ===");
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }
}