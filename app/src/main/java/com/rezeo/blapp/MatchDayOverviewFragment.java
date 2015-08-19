package com.rezeo.blapp;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

public class MatchDayOverviewFragment extends Fragment {

    public static MatchDayOverviewFragment newInstance() {
        return new MatchDayOverviewFragment();
    }

    public MatchDayOverviewFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Context applicationContext = getActivity().getApplicationContext();
        RelativeLayout layout = new RelativeLayout(applicationContext);


        ObjectMapper om = new ObjectMapper();
        try {
            List<Match> matches = om.readValue(getResources().openRawResource(R.raw.test), new TypeReference<List<Match>>() {
            });
            createTextView(matches.get(1), layout, applicationContext);

        } catch (IOException e) {
            e.printStackTrace();
        }


        return layout;
    }

    private void createTextView(Match match, RelativeLayout layout, Context applicationContext) {
        TextView matchId = new TextView(applicationContext);
        matchId.setId(1);
        TextView matchDateTime = new TextView(applicationContext);

        RelativeLayout.LayoutParams matchIdParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams matchDateTimeParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        matchIdParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        matchDateTimeParams.addRule(RelativeLayout.BELOW, matchId.getId());
        matchDateTimeParams.addRule(RelativeLayout.CENTER_HORIZONTAL);

        matchId.setTextColor(Color.rgb(0, 0, 0));
        matchDateTime.setTextColor(Color.rgb(0, 0, 0));

        matchId.setText("MatchID: " + match.getMatchId());
        matchDateTime.setText("Match Time: " + match.getMatchDateTime());

        layout.addView(matchId, matchIdParams);
        layout.addView(matchDateTime, matchDateTimeParams);
    }

}
