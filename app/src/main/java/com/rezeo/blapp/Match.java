package com.rezeo.blapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Match {

    @JsonProperty("MatchID")
    private String matchId;

    public String getMatchId() {
        return matchId;
    }
}
