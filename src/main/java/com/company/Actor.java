package com.company;

public class Actor extends Person {
    private String role;

    public Actor(String firstName, String lastName, double pay, String role) {
        super(firstName, lastName, pay);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
