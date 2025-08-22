package com.example.contactapp.service;

import com.example.contactapp.model.Contact;
import java.util.List;

public interface ContactService {
    void addContact(Contact contact);
    Contact getContact(int id);
    List<Contact> getAllContacts();
    boolean updateContact(int id, Contact updatedContact);
    boolean deleteContact(int id);
}
