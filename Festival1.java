package com.example;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

class Festival {
    private String name;
    private Queue<Stage> stages;

    public Festival(String name) {
        this.name = name;
        this.stages = new LinkedList<Stage>();
    }

    public void addStage(Stage stage) {
        stages.add(stage);
    }

    public String getName() {
        return name;
    }

    public Queue<Stage> getStages() {
        return stages;
    }


}

class Stage {
    private String name;
    private List<Band> bands;

    public Stage(String name) {
        this.name = name;
        this.bands = new LinkedList<Band>();
    }
    public void addBand(Band band) {
        bands.add(band);
    }

    public String getName() {
        return name;
    }

    public List<Band> getBands() {
        return bands;
    }
}

class Band {
    private String name;
    private String genre;

    public Band(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }
}

public class Festival1 {

    public static void main(String[] args) {
        Festival coachella = new Festival("Coachella");

        Stage mainStage = new Stage("Main Stage");
        mainStage.addBand(new Band("The Strokes", "Rock"));
        mainStage.addBand(new Band("Tame Impala", "Psychedelic Rock"));
        coachella.addStage(mainStage);

        Stage indieStage = new Stage("Indie Stage");
        indieStage.addBand(new Band("Vampire Weekend", "Indie Rock"));
        indieStage.addBand(new Band("The 1975", "Indie Pop"));
        coachella.addStage(indieStage);

    }
}