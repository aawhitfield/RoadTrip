package com.infinitylabs.roadtrip.roadtrip;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    public void playBattleship(View view)
    {
        Intent battleship = new Intent(getApplicationContext(), BattleshipActivity.class);

        startActivity(battleship);
    }

    public void playDoodlePad(View view)
    {
        Intent doodlePad = new Intent(getApplicationContext(), DoodlePad.class);

        startActivity(doodlePad);
    }

    public void playSpotTheCar(View view)
    {
        Intent spotTheCar = new Intent(getApplicationContext(), SpotTheCarActivity.class);

        startActivity(spotTheCar);
    }

    public void playLicensePlate(View view)
    {
        Intent licensePlate = new Intent(getApplicationContext(), LicensePlateActivity.class);

        startActivity(licensePlate);
    }

    public void playiSpy(View view)
    {
        Intent iSpy = new Intent(getApplicationContext(), iSpyActivity.class);

        startActivity(iSpy);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
