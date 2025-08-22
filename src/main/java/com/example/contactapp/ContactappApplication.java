package com.example.contactapp;


import com.example.contactapp.model.BusinessContact;
import com.example.contactapp.model.Contact;
import com.example.contactapp.service.ContactService;
import com.example.contactapp.service.ContactServiceImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactappApplication {

	public static void main(String[] args) {
        // Programming to an interface, not an implementation (Best Practice)
        ContactService contactService = new ContactServiceImpl();

        // --- Create Operation ---
        System.out.println("--- Adding Contacts ---");
        Contact person1 = new Contact(1, "Alice", "111-222-3333");
        // Here's polymorphism: A BusinessContact object is treated as a Contact
        Contact person2 = new BusinessContact(2, "Bob", "444-555-6666", "Globex Corp");

        contactService.addContact(person1);
        contactService.addContact(person2);
        System.out.println();

        // --- Read Operation ---
        System.out.println("--- Reading All Contacts ---");
        // The list holds both Contact and BusinessContact objects
        for (Contact contact : contactService.getAllContacts()) {
            // The correct toString() method is called at runtime (Polymorphism)
            System.out.println(contact);
        }
        System.out.println();

        // --- Update Operation ---
        System.out.println("--- Updating a Contact ---");
        Contact updatedAlice = new Contact(1, "Alice Smith", "123-456-7890");
        contactService.updateContact(1, updatedAlice);
        System.out.println("Found after update: " + contactService.getContact(1));
        System.out.println();

        // --- Delete Operation ---
        System.out.println("--- Deleting a Contact ---");
        contactService.deleteContact(2);
        System.out.println();

        System.out.println("--- Final Contact List ---");
        System.out.println(contactService.getAllContacts());
	}

}
