package com.company;


public class Circle {

    public double radius;

    public Circle() // Does if no value supplied
    {
    double radius = 1;
    }
    public Circle(double r){ //Does if a value is supplied
        radius = r;
    }
    public double circumference()
    {
        double c = 2 * Math.PI * radius;
        return c;
    }
    public double area()
    {
        double a = Math.PI * radius * radius;
        return a;
    }

    public void setRadius(double newRad){
        radius = newRad;
    }
}
