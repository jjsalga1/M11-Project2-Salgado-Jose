package com.company;

public class Director extends Crew {
    private double royalty;

    public Director(String firstName, String lastName, double pay, String department) {
        super(firstName, lastName, pay, department);
    }

    public void updateRoyaltyEarned() {
        /** This method updates a director's earned pay by adding their 1% royalty **/
        this.royalty = Movie.getProfit() * .01;
        this.earned += royalty;
    }

    // Getters and setters
    public double getRoyalty() {
        return royalty;
    }

    public void setRoyalty(double royalty) {
        this.royalty = royalty;
    }
}
