package com.example;

import java.util.ArrayList;

public class Sport{
    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList<>();
        teams.add(new Team("Red"));
        teams.add(new Team("Green"));
        teams.add(new Team("Blue"));

        ArrayList<Player> players = new ArrayList<>();
        players.add(new Player("Alice", 1));
        players.add(new Player("Bob", 2));
        players.add(new Player("Charlie", 3));

        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            Team team = teams.get(i % teams.size());
            player.setTeam(team);
        }
    }
}

class Team {
    String name;

    public Team(String name) {
        this.name = name;
    }
}

class Player {
    String name;
    int playerId;
    Team team;

    public Player(String name, int playerId) {
        this.name = name;
        this.playerId = playerId;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
