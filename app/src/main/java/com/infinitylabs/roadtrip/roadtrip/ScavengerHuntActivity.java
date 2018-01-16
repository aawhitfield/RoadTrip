package com.infinitylabs.roadtrip.roadtrip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static java.util.Arrays.asList;

public class ScavengerHuntActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scavenger_hunt);

        ListView scavengerListView = findViewById(R.id.scavengerListView);

        final ArrayList<String> myScavenger = new ArrayList<String>(asList("Train", "Bridge Over Water"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, myScavenger);

        scavengerListView.setAdapter(arrayAdapter);

    }
}
