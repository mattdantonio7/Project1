package com.company;
import java.util.*;

public class main {
    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");

        int mPG = scan.nextInt();
        if(mPG <= 0) {
            System.err.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        }

        System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number:");

        double tankCapacity = scan.nextDouble();
        if(tankCapacity <= 0) {
            System.err.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            return;
        }

        System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%):");

        double percentFilled = scan.nextDouble();
        if (percentFilled < 0 || percentFilled > 100) {
            System.err.println("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            return;
        }

        double rawRange = 0.0;
        rawRange = (mPG * tankCapacity * (percentFilled * .01));

        if (rawRange <= 25) {
            System.out.println("Attention! Your current estimated range is running low: " + (int) rawRange + " miles left!!!");
        }
        else  {
            System.out.println("Keep driving! Your current estimated range is: " + (int) rawRange + " miles!");
        }




    }
}






