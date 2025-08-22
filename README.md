# Core Java OOP Contact Manager

A simple command-line CRUD (Create, Read, Update, Delete) application built with Core Java. This project serves as a practical demonstration of the four fundamental principles of Object-Oriented Programming (OOP).

## Core Concepts Demonstrated

This project is designed to clearly illustrate the four pillars of OOP:

1.  **Encapsulation:** The `Contact` class bundles data (id, name) and methods together. Its fields are `private`, and access is controlled through `public` getters and setters.
2.  **Inheritance:** The `BusinessContact` class `extends` the `Contact` class, inheriting its properties and methods while adding its own (`companyName`). This showcases the "is-a" relationship.
3.  **Polymorphism:** The application uses a `Contact` reference to hold a `BusinessContact` object. When methods like `toString()` are called, Java's runtime polymorphism ensures the correct version of the method (from the `BusinessContact` class) is executed.
4.  **Abstraction:** The `ContactService` interface defines a contract for what operations can be performed (add, get, delete, etc.) without specifying *how* they are implemented. The `ContactServiceImpl` class provides the concrete implementation.

## Project Structure

```
.
└── src/
    └── com/
        └── example/
            └── contactapp/
                ├── model/
                │   ├── Contact.java
                │   └── BusinessContact.java
                ├── service/
                │   ├── ContactService.java
                │   └── ContactServiceImpl.java
                └── Main.java
```

## How to Compile and Run

1.  **Navigate to the `src` directory:**
    ```
    cd path/to/contact-manager/src
    ```

2.  **Compile all Java files:**
    ```
    javac com/example/contactapp/model/*.java com/example/contactapp/service/*.java com/example/contactapp/Main.java
    ```

3.  **Run the main application:**
    ```
    java com.example.contactapp.Main
    ```
```

### Part 5: Leveling Up

To take this from a basic project to something an SDE 2 would be proud of, consider these improvements:

*   **Exception Handling:** What if you try to `getContact(99)` and it doesn't exist? The current code returns `null`. A better approach is to throw a custom exception like `ContactNotFoundException`.
*   **User Input:** Turn this into an interactive console application where the user can choose to add, delete, or list contacts. Use a `Scanner` to read user input.
*   **Unit Testing (Crucial):** Use a framework like **JUnit** to write tests for your `ContactServiceImpl`. Test each method: can you add a contact? Does deleting a contact actually remove it? This is a non-negotiable skill for an SDE.
*   **Immutability:** For data objects like `Contact`, consider making them immutable (all fields `final`, no setters). This makes your program safer in multi-threaded environments, a topic highly relevant to server-side development.
