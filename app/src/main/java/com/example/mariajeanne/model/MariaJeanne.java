package com.example.mariajeanne.model;

import java.util.List;

public class MariaJeanne {

    int id;
    String name;
    String race;
    List<String> flavor;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName(){ return name;}

    public void setName(String name){ this.name = name; }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public List<String> getFlavor() {
        return flavor;
    }

    public void setFlavor(List<String> flavor) {
        this.flavor = flavor;
    }

    @Override
    public String toString() {
        return "MariaJeanne{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", flavor=" + flavor +
                '}';
    }
}
