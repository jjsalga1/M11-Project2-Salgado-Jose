package com.company;

public class Crew extends Person {
    protected String department;

    public Crew(String firstName, String lastName, double pay, String department) {
        super(firstName, lastName, pay);
        this.department = department;
    }

    // Getters and setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
