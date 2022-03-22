package com.company;

public class Crew extends Person {
    protected String department;

    public Crew(String firstName, String lastName, double pay, double earned, String department) {
        super(firstName, lastName, pay, earned);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
