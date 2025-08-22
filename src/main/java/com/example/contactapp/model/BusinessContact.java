package com.example.contactapp.model;

// BusinessContact "is-a" Contact
public class BusinessContact extends Contact {
    private String companyName;

    public BusinessContact(int id, String name, String phoneNumber, String companyName) {
        // Call the parent class constructor
        super(id, name, phoneNumber);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    // Method Overriding for Polymorphism
    @Override
    public String toString() {
        return "BusinessContact [ID=" + getId() + ", Name='" + getName() + "', Phone='" + getPhoneNumber() + "', Company='" + companyName + "']";
    }
}
