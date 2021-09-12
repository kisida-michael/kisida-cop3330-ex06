package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
import java.util.Calendar;
public class RetirementCalculator
{
    public static void main( String[] args )
    {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What is your current age? ");
        String curAgeStr = input.nextLine();  // Read user input
        System.out.print("At what age would you like to retire? ");
        String retireAgeStr  = input.nextLine();  // Read user input
        int curAge = Integer.parseInt(curAgeStr);
        int retireAge = Integer.parseInt(retireAgeStr);
        int yrsLeft = retireAge - curAge;
        int retireYr = year + yrsLeft;
        String output1 = String.format("You have %d years left until you can retire.\n", yrsLeft);
        String output2 = String.format("It's %d, so you can retire in %d.", year, retireYr);
        System.out.println(output1 + output2);
        input.close();
    }
}
