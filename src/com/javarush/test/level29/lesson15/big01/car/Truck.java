package com.javarush.test.level29.lesson15.big01.car;

/**
 * Created by Dmitry on 28.02.2016.
 */
public class Truck extends Car
{
    int numberOfPassengers;
    public Truck(int numberOfPassengers)
    {
        super(Car.TRUCK,numberOfPassengers);
    }
}
