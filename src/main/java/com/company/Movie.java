package com.company;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String genre;
    private Director director;
    private List <Actor> actors;
    private List <Crew> crew;
    private double budget;
    private double moneySpent;
    private double moneyEarned;
    private static double profit;

    public Movie(String genre, Director director, List<Actor> actors, List<Crew> crew, double budget) {
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.crew = crew;
        this.budget = budget;
        this.moneySpent = 0;
        this.moneyEarned = 0;
        this.profit = 0;
    }

    // method to update gross money earned
    public void updateGrossMoneyEarned(double moneyEarned) {
        /** This function is used to pass the gross money earned for a movie. This method updated the
         * moneyEarned parameter. Note: moneyEarned for movie is how much it made in sales. This is
         * different from a Person object's earned. **/
        this.moneyEarned = moneyEarned;
    }

    public void calculateProfit() {
        profit = budget - moneySpent + moneyEarned;
    }

    // TODO fix payday for director
    public void Payday() {
        /** This function is used to pay everyone who was involved in the movie. It updates the moneySpent property. **/
        // pay director
        director.updateMoneyEarned();

        // pay director 1% royalty
        director.earned += profit * .01;
        moneySpent += director.earned;

        // pay actors
        for (Actor actor : actors) {
            actor.updateMoneyEarned();
            moneySpent += actor.earned;
        }

        // pay crew
        for (Crew member : crew) {
            member.updateMoneyEarned();
            moneySpent += member.earned;
        }


    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<Crew> crew) {
        this.crew = crew;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public static double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
