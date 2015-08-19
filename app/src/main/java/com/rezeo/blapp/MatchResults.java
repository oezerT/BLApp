package com.rezeo.blapp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchResults {

    @JsonProperty("ResultName")
    private String resultName;

    @JsonProperty("PointsTeam1")
    private int pointsTeam1;

    @JsonProperty("PointsTeam2")
    private int pointsTeam2;

    @JsonProperty("ResultOrderID")
    private int resultOrderId;

    public String getResultName() {
        return resultName;
    }

    public int getPointsTeam1() {
        return pointsTeam1;
    }

    public int getPointsTeam2() {
        return pointsTeam2;
    }

    public int getResultOrderId() {
        return resultOrderId;
    }
}
