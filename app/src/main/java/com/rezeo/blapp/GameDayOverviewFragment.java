package com.rezeo.blapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class GameDayOverviewFragment extends Fragment{

    public static GameDayOverviewFragment newInstance() {
        GameDayOverviewFragment fragment = new GameDayOverviewFragment();
        return fragment;
    }

    public GameDayOverviewFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_current_game_day, container, false);
        return rootView;
    }

}
