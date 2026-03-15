package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PERSON SINIFI TESTİ ===");

        // Person nesnesi oluşturma
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("LastName: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Teen? " + person.isTeen());

        // İkinci Person nesnesi (teenager)
        Person person2 = new Person("Jane", "Smith", 16, "jane@email.com", "555-0123", "İstanbul");

        System.out.println("\nİkinci Person:");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Email: " + person2.getEmail());
        System.out.println("Is Teen? " + person2.isTeen());

        System.out.println("\n=== WALL SINIFI TESTİ ===");

        // Wall nesnesi oluşturma
        Wall wall = new Wall(5, 4);

        System.out.println("area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }
}