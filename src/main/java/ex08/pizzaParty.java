/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */

package ex08;

import java.util.Scanner;

public class pizzaParty {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for inputs
        System.out.print("How many people? ");
        String numberPeople = in.nextLine();
        System.out.print("How Many pizzas do you have? ");
        String numberPizzas = in.nextLine();
        System.out.print("How Many slices per pizza? ");
        String numberSlices = in.nextLine();


        // Numerical Conversion from string to type int because a slice can't be a decimal
        int people = Integer.parseInt(numberPeople);
        int pizzas = Integer.parseInt(numberPizzas);
        int slices = Integer.parseInt(numberSlices);

        // Various calculations to find ratios of people to slices and a mod function to find the leftovers
        int totalSlices = pizzas * slices;
        int slicesPerson = totalSlices / people;
        int leftovers = totalSlices % people;

        // Associated Outputs
        System.out.print(people + " people with " + pizzas + " pizzas ( " + totalSlices + " slices )\n");
        System.out.print("Each person gets " + slicesPerson + " pieces of pizza.\n");
        System.out.print("There are " + leftovers + " leftovers.");

    }

}
