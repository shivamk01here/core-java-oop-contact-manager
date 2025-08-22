package com.example.contactapp.model;

public class Contact {
    private int id;
    private String name;
    private String phoneNumber;

    public Contact(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters and Setters for encapsulation
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        // Example of adding logic inside a setter
        if (phoneNumber == null || phoneNumber.trim().isEmpty()) {
            System.out.println("Phone number cannot be empty.");
            return;
        }
        this.phoneNumber = phoneNumber;
    }

    // Overriding toString() for better object representation
    @Override
    public String toString() {
        return "Contact [ID=" + id + ", Name='" + name + "', Phone='" + phoneNumber + "']";
    }
}
