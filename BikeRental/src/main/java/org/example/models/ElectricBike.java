package org.example.models;

import org.example.models.Bike;

public class ElectricBike extends Bike {
    private float batteryLevel;

    void charge(){
        batteryLevel = 100;
    }
}
