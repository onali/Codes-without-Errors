package com.example;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Cinema{
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Godfather", 1));
        movies.add(new Movie("The Shawshank Redemption", 2));
        movies.add(new Movie("The Dark Knight", 3));
        movies.add(new Movie("Pulp Fiction", 4));

        Map<String, Actor> actors = new HashMap<>();
        actors.put("Marlon Brando", new Actor("Marlon Brando", 101));
        actors.put("Robert De Niro", new actor("Robert De Niro", 102));
        actors.put("Morgan Freeman", new actor("Morgan Freeman", 103));
        actors.put("Samuel L. Jackson", new actor("Samuel L. Jackson", 104));

        for (Movie movie : movies) {
            ArrayList<actor> movieActors = new ArrayList<>();
            for (int i = 0; i < movie.getName().length() % 4; i++) {
                movieActors.add(actors.get(movie.getName().substring(i, i + 2)));
            }
            movie.setActors(movieActors);
        }
    }
}

class Movie {
    String name;
    int movieId;
    ArrayList<actor> actors;

    public Movie(String name, int movieId) {
        this.name = name;
        this.movieId = movieId;
    }

    public String getName() {
        return name;
    }

    public void setActors(ArrayList<actor> actors) {
        this.actors = actors;
    }
}

class actor {
    String name;
    int actorId;

    public actor(String name, int actorId) {
        this.name = name;
        this.actorId = actorId;
    }
}
