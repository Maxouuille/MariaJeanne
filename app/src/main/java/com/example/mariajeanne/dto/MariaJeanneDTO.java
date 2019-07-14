package com.example.mariajeanne.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MariaJeanneDTO {

    @SerializedName("id") int id;
    @SerializedName("race") String race;
    @SerializedName("flavors")
    List<String> flavors;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public List<String> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<String> flavors) {
        this.flavors = flavors;
    }
}
