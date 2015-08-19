package com.rezeo.blapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {

    @JsonProperty("MatchID")
    private String matchId;

    @JsonProperty("MatchDateTime")
    private String matchDateTime;

    @JsonProperty("Team1")
    private Team team1;

    @JsonProperty("Team2")
    private Team team2;

    @JsonProperty("MatchIsFinished")
    private boolean matchIsFinished;

    @JsonProperty("MatchResults")
    private List<MatchResults> matchResults;

    @JsonProperty("Goals")
    private List<Goals> goals;

    public String getMatchId() {
        return matchId;
    }

    public String getMatchDateTime() {
        return matchDateTime;
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public boolean isMatchIsFinished() {
        return matchIsFinished;
    }

    public List<MatchResults> getMatchResults() {
        return matchResults;
    }

    public List<Goals> getGoals() {
        return goals;
    }
}
