package com.company;

public class PA extends Crew {
    private double hoursWorked;

    public PA(String firstName, String lastName, double pay, double earned, String department, double hoursWorked) {
        super(firstName, lastName, pay, earned, department);
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
