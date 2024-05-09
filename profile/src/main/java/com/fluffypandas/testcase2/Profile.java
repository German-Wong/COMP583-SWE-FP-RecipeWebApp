package com.fluffypandas.testcase2;

public class Profile {
    private final String id;
    private final String name;
    private final String email;

    public Profile(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getId() {
        return id;
    }

    // Getters for id, name, and email
    // Other setters or methods as needed
}