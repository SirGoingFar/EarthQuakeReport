package com.eemf.earthquakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by OLANREWAJU  E A on 12/02/2018.
 */
public class QuakeAdapter extends ArrayAdapter<Quakes> {

    ArrayList<Quakes> mQuakesObject;

    /**
     * class constructor
     * @param activity is the current activity
     * @param quakes the object instance of {@link Quakes}
     */
    public QuakeAdapter(Activity activity, ArrayList<Quakes> quakes){
        super(activity,0,quakes);
    }

    /**
     * @param position is the position of the requested {@link Quakes} object
     * @param convertView is the Recyclable View
     * @param parent is the AdapterView
     * @return
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //recycled view
        View childView = convertView;

        //confirm if there is a view to recycle or not
        if(childView == null){
            childView = LayoutInflater.from(getContext()).inflate(R.layout.quakes_list, parent, false);
        }

        //get the {@link Quakes} instance from the ArrayList at index "position"
        Quakes currentObject = getItem(position);

        //set the Quake's Magnitude
        TextView magnitude = (TextView) childView.findViewById(R.id.magnitude);
        magnitude.setText(currentObject.getmMagnitude());

        //set the Quake's Location
        TextView location = (TextView) childView.findViewById(R.id.location);
        location.setText(currentObject.getmLocation());

        //set the Quake's Date
        TextView date = (TextView) childView.findViewById(R.id.date);
        date.setText(currentObject.getmDate());

        //return the recycled view
        return childView;
    }
}
