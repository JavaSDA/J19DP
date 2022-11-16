package com.company.adapter.exercises;

public class VideoGame {
    private String pegiName;
    private int ageRating;
    private int coresNeeded;
    private int pingTime;

    public VideoGame(String pegiName, int ageRating, int coresNeeded, int pingTime) {
        this.pegiName = pegiName;
        this.ageRating = ageRating;
        this.coresNeeded = coresNeeded;
        this.pingTime = pingTime;
    }

    public String getPegiName() {
        return pegiName;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public int getCoresNeeded() {
        return coresNeeded;
    }

    public int getPingTime() {
        return pingTime;
    }
}
