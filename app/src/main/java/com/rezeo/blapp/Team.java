package com.rezeo.blapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {

    @JsonProperty("TeamId")
    private int teamId;

    @JsonProperty("TeamName")
    private String teamName;

    @JsonProperty("TeamIconUrl")
    private String teamIconUrl;

    public int getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTeamIconUrl() {
        return teamIconUrl;
    }
}
