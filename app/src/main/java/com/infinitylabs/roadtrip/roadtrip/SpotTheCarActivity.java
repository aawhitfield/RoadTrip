package com.infinitylabs.roadtrip.roadtrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SpotTheCarActivity extends AppCompatActivity {

    public void sankShip(View view)
    {
         Toast.makeText(this, "You sank my Battleship", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spot_the_car);
    }
}
