package com.hackerranktimeconversion.app;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //Variable declaration
        String cadTime = "12:05:45AM";

        //Object declaration
        Scanner in = new Scanner(System.in);

        //Input
        cadTime = in.nextLine();

        //Call function
        System.out.println(timeConversion(cadTime));
    }

    static String timeConversion(String s) {
        //Variables declaration
        int hourInt = Integer.parseInt(s.substring(0,2)) ;
        String timeType = s.substring(s.length()-2,s.length());
        String minutesandSeconds = s.substring(2,s.length()-2);
        String hourString = s.substring(0,2);
        String militaryTime = s.substring(0,2);

        //Validate type time
        if(timeType.equals("AM") && hourInt == 12)
        {
            hourString = "00";
        }
        else if(timeType.equals("PM") && hourInt != 12)
        {
            hourString = Integer.toString(hourInt + 12);
        }

        //Concat new hour with time
        militaryTime = hourString + minutesandSeconds;
        return  militaryTime;
    }

}
