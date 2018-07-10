package com.eemf.earthquakereport;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONObject;

import java.util.ArrayList;

import static android.R.attr.value;
import static android.R.id.list;
import static android.R.string.no;
import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayList for holding the {@link Quakes} objects
        ArrayList<Quakes> quakeObjects = new ArrayList<>();

        quakeObjects.add(new Quakes("3.5", "California", "June 12, 1984"));
        quakeObjects.add(new Quakes("4.3", "Michigan", "April 14, 1920"));
        quakeObjects.add(new Quakes("7.5", "Los Angeles", "January 12, 1884"));
        quakeObjects.add(new Quakes("9.4", "London", "August 5, 1995"));
        quakeObjects.add(new Quakes("7.4", "Philippine", "March 10, 1958"));
        quakeObjects.add(new Quakes("3.3", "Great Britain", "November 11, 1958"));
        quakeObjects.add(new Quakes("6.7", "New Jersey", "October 10, 1992"));
        quakeObjects.add(new Quakes("3.4", "New york", "February 14, 1784"));
        quakeObjects.add(new Quakes("3.2", "New Zealand", "December 25, 345"));
        quakeObjects.add(new Quakes("2.5", "France", "June 6, 1914"));

        //QuakeAdapter to be attached to the ListView
        QuakeAdapter adapter = new QuakeAdapter(MainActivity.this, quakeObjects);

        //ListView
        ListView list = (ListView) findViewById(R.id.activity_main);

        //setting the ListView with the QuakeAdapter
        list.setAdapter(adapter);

        /**
        JSONObject()
        Creates a JSONObject with no name/value mappings.

        JSONObject(Map copyFrom)
        Creates a new JSONObject by copying all name/value mappings from the given map.

        JSONObject(JSONTokener readFrom)
        Creates a new JSONObject with name/value mappings from the next object in the tokener.

        JSONObject(String json)
        Creates a new JSONObject with name/value mappings from the JSON string.

        JSONObject(JSONObject copyFrom, String[] names)
        Creates a new JSONObject by copying mappings for the listed names from the given object.

         =====Don't assume that YOU ARE when YOU ARE NOT: duly follow the "TO BE" process so as to SINCERELY BECOME===
         */
    }
}
