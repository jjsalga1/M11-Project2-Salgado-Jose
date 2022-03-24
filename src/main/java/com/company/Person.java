package com.company;

public class Person {
    protected String firstName;
    protected String lastName;
    protected double pay;
    protected double earned;

    public Person(String firstName, String lastName, double pay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pay = pay;
        this.earned = 0;
    }

    public void updateMoneyEarned() {
        /** When this method is called, a person's pay is added to their money earned. **/
        earned += pay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getEarned() {
        return earned;
    }

    public void setEarned(double earned) {
        this.earned = earned;
    }
}
