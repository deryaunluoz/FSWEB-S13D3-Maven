package org.example;

public class Person {
    // Instance variables
    private String firstName;
    private String lastName;
    private int age;

    // Ekstra instance variable'lar
    private String email;
    private String phoneNumber;
    private String address;

    // Constructor 1 - sadece temel bilgiler
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = "Bilinmiyor";
        this.phoneNumber = "Bilinmiyor";
        this.address = "Bilinmiyor";
    }

    // Constructor 2 - tüm bilgiler (overloading)
    public Person(String firstName, String lastName, int age, String email, String phoneNumber, String address) {
        this(firstName, lastName, age); // constructor chaining
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter metodları
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    // isTeen metodu
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}