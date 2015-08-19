package com.rezeo.blapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Goals {
    @JsonProperty("ScoreTeam1")
    private int scoreTeam1;

    @JsonProperty("ScoreTeam2")
    private int scoreTeam2;

    @JsonProperty("MatchMinute")
    private int matchMinute;

    @JsonProperty("GoalGetterName")
    private String goalGetterName;

    @JsonProperty("IsPenalty")
    private boolean isPenalty;

    @JsonProperty("IsOwnGoal")
    private boolean isOwnGoal;

    @JsonProperty("IsOvertime")
    private boolean isOvertime;

    public int getScoreTeam1() {
        return scoreTeam1;
    }

    public int getScoreTeam2() {
        return scoreTeam2;
    }

    public int getMatchMinute() {
        return matchMinute;
    }

    public String getGoalGetterName() {
        return goalGetterName;
    }

    public boolean isPenalty() {
        return isPenalty;
    }

    public boolean isOwnGoal() {
        return isOwnGoal;
    }

    public boolean isOvertime() {
        return isOvertime;
    }
}
