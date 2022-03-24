package com.company;

public class Director extends Crew {
    private double royalties;
    public Director(String firstName, String lastName, double pay, String department) {
        super(firstName, lastName, pay, department);
    }

    // TODO create function to update royalties
    public void updateRoyalty() {
        royalties = Movie.getProfit() * .01;
        earned += royalties;
    }
}
