package com.eemf.earthquakereport;

/**
 * Created by OLANREWAJU  E A on 12/02/2018.
 */
public class Quakes {

    public String mMagnitude;
    public String mLocation;
    public String mDate;

    /**
     * class constructor
     * @param magnitude is the MAGNITUDE of the Earthquake
     * @param location is the LOCATION of the Earthquake
     * @param date is the DATE of the Earthquake
     */
    public Quakes(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * @return the value of variable mMagnitude
     */
    public String getmMagnitude() {
        return mMagnitude;
    }

    /**
     * @return the value of variable mLocation
     */
    public String getmLocation() {
        return mLocation;
    }

    /**
     * @return the value of variable mDate
     */
    public String getmDate() {
        return mDate;
    }

}
