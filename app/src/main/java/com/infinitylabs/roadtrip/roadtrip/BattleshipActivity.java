package com.infinitylabs.roadtrip.roadtrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BattleshipActivity extends AppCompatActivity {

    public void returnHome(View view)
    {
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battleship);
    }
}
