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
    private double profit;

    public Movie(String genre, Director director, List<Actor> actors, List<Crew> crew, double budget, double moneySpent, double moneyEarned, double profit) {
        this.genre = genre;
        this.director = director;
        this.actors = actors;
        this.crew = crew;
        this.budget = budget;
        this.moneySpent = moneySpent; //
        this.moneyEarned = moneyEarned; //
        this.profit = profit; //
    }

    // TODO method to update money earned

    public void calculateProfit() {
        profit = budget - moneySpent + moneyEarned;
    }

    public void Payday() {
        // pay director base pay
        director.earned += director.pay;
        // pay director 1% royalty
        director.earned += profit * .01;

        moneySpent += director.earned;

        // pay actors
        for (Actor actor : actors) {
            actor.earned += actor.pay;
            moneySpent += actor.earned;
        }

        // pay crew
        for (Crew member : crew) {
            if (member instanceof PA) {
                member.earned += member.pay * ((PA) member).getHoursWorked();
            } else {
                member.earned += member.pay;
            }
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

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
}
