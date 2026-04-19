package com.codegnan.oop;

class Person {
    int id;
    String name;
    int age;

    // No-argument constructor with sample data
    Person() {
        id = 100;
        name = "neel";
        age = 39;
    }

    // Parameterized constructor
    Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        // Using No-Argument Constructor (with sample data)
        Person p1 = new Person();
        p1.display();

        // Using Parameterized Constructor
        Person p2 = new Person(101, "tarak", 41);
        p2.display();
    }
}