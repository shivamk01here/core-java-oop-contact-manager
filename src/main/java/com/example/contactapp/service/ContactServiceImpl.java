package com.example.contactapp.service;

import com.example.contactapp.exception.ContactNotFoundException;
import com.example.contactapp.model.Contact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactServiceImpl implements ContactService {
    // Using a Map for efficient O(1) average time complexity for lookups.
    private final Map<Integer, Contact> contactDatabase = new HashMap<>();

    @Override
    public void addContact(Contact contact) {
        if (contact != null) {
            contactDatabase.put(contact.getId(), contact);
            System.out.println("Added: " + contact);
        }
    }

    @Override
    public Contact getContact(int id) {
        Contact contact = contactDatabase.get(id);
        if (contact == null) {
            throw new ContactNotFoundException("Contact with id " + id + " not found!");
        }
        return contact;
    }

    @Override
    public List<Contact> getAllContacts() {
        return new ArrayList<>(contactDatabase.values());
    }

    @Override
    public boolean updateContact(int id, Contact updatedContact) {
        if (contactDatabase.containsKey(id)) {
            contactDatabase.put(id, updatedContact);
            System.out.println("Updated: " + updatedContact);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteContact(int id) {
        Contact removed = contactDatabase.remove(id);
        if (removed != null) {
            System.out.println("Deleted: " + removed);
            return true;
        }
        return false;
    }
}
