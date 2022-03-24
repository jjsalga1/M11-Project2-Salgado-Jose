package com.company;

public class PA extends Crew {
    private double hoursWorked;

    public PA(String firstName, String lastName, double pay, String department, double hoursWorked) {
        super(firstName, lastName, pay, department);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void updateMoneyEarned() {
        /** This updateMoneyEarned method is overridden because PAs are paid hourly, but it still behaves the
         * same as the base Person class, where pay is added to earned. **/
        earned += pay * hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
