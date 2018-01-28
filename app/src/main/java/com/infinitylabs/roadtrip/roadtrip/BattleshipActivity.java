package com.infinitylabs.roadtrip.roadtrip;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import static com.infinitylabs.roadtrip.roadtrip.R.id.battleshipView;
import static com.infinitylabs.roadtrip.roadtrip.R.id.buttonA2;
import static com.infinitylabs.roadtrip.roadtrip.R.id.buttonA3;
import static com.infinitylabs.roadtrip.roadtrip.R.string.snackbar_miss;

public class BattleshipActivity extends AppCompatActivity {

    String selection = "";
    ArrayList<Integer> shipLocations;



    public void returnHome(View view)
    {
        finish();
    }



    public void displayResult(View view)
    {
        if((view.getId() == buttonA2) || (view.getId() == buttonA3))

        {
            Snackbar.make(findViewById(battleshipView), R.string.snackbar_hit,
                    Snackbar.LENGTH_SHORT)
                    .show();
        }

        else
        {
            Snackbar.make(findViewById(battleshipView), snackbar_miss,
                    Snackbar.LENGTH_SHORT)
                    .show();
        }

        View b = findViewById(view.getId());
        b.setVisibility(View.GONE);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battleship);

        shipLocations = new ArrayList<Integer>();

        shipLocations.add(R.id.buttonA2);
        shipLocations.add(R.id.buttonA3);
    }
}
