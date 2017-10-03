package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

	Circle bestCircle = new Circle(15);

        Circle worstCircle =  new Circle(15);

double combined = worstCircle.area() + bestCircle.area();

        System.out.println(worstCircle.area());

        System.out.println(bestCircle.area());

        System.out.println(combined);

        worstCircle.setRadius(57);

        Circle averageCircle = new Circle();
        System.out.println(averageCircle);
    }
}
