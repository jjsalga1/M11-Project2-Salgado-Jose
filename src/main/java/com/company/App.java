package com.company;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // instantiate all classes
        Person person = new Person("Jose", "Salgado", 20000.00);
        Crew crew1 = new Crew("John", "Doe", 2000.00, "Stunts");
        Crew crew2 = new Crew("Nallely", "Hermosillo", 3000.00, "Makeup");
        Actor actor1 = new Actor("Ryan", "Reynolds", 10000.00, "Superhero");
        Actor actor2 = new Actor("Dwayne", "Johnson", 10000.00, "Villain");
        Actor actor3 = new Actor("Peter", "Anteater", 1.00, "Mascot");
        PA pa = new PA("Peter", "Prod", 50.00, "Cameras", 40);
        Director director = new Director("Michael", "Bay", 40000.00, "Film");

        // creating actor list
        List <Actor> actorList = new ArrayList<>();
        actorList.add(actor1);
        actorList.add(actor2);
        actorList.add(actor3);

        // creating crew list
        List <Crew> crewList = new ArrayList<>();
        crewList.add(crew1);
        crewList.add(crew2);
        crewList.add(pa);

        // instantiate movie
        Movie movie = new Movie("Action", director, actorList, crewList, 500000.00);

        // update movie's gross earnings, pay those involved, calculate profit
        movie.updateGrossMoneyEarned(500000.00);
        movie.Payday();
        movie.calculateProfit();

        // Demonstrate payday method
        System.out.format("Money earned by PA: $%.2f\n", pa.getEarned());
        System.out.format("Money spent from budget: $%.2f\n", movie.getMoneySpent());
        System.out.format("Movie profit: $%.2f\n", movie.getProfit());
        System.out.format("Director royalty: $%.2f\n", movie.getProfit() * .01);
    }
}
