package com.company;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // instantiate all classes
        Person person = new Person("Jose", "Salgado", 20000.00, 0);
        Crew crew = new Crew("John", "Doe", 2000.00, 0, "Stunts");
        Actor actor = new Actor("Ryan", "Reynolds", 10000.00, 0, "Superhero");
        PA pa = new PA("Peter", "Prod", 50.00, 0, "Cameras", 40);
        Director director = new Director("Michael", "Bay", 40000, 0, "Film");

        // TODO create actor list
        List <Actor> actorList = new ArrayList<>();

        // TODO create crew list
        List <Crew> crewList = new ArrayList<>();

        Movie movie = new Movie("Action", director, actorList, crewList, 500000.00, 0, 100000.00, 0);



        movie.calculateProfit();
        movie.Payday();
    }
}
