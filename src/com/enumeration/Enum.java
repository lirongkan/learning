package com.enumeration;

import java.util.Enumeration;
import java.util.Vector;


public class Enum{

    public static void main(String[] args) {

        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thusday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}