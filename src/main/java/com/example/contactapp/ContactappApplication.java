package com.example.contactapp;


import com.example.contactapp.model.BusinessContact;
import com.example.contactapp.model.Contact;
import com.example.contactapp.service.ContactService;
import com.example.contactapp.service.ContactServiceImpl;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactappApplication {

    public static void main(String[] args) {
        ContactService service = new ContactServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. View All Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // buffer clear

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = scanner.nextLine();
                    service.addContact(new Contact(id, name, phone));
                    break;
                case 2:
                    System.out.println(service.getAllContacts());
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    int deleteId = scanner.nextInt();
                    service.deleteContact(deleteId);
                    break;
                case 4:
                    System.out.println("Bye!");
                    return;
            }
        }
    }

}
