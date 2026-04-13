/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.loops_demo_app;

/**
 * Loops Demo App
 *
 * This program demonstrates the three main loop types in Java:
 * 1. while loop
 * 2. do-while loop
 * 3. for loop
 *
 * Analogy used: Boarding passengers onto a plane.
 *
 * Each loop repeats an action, just like calling passengers one by one.
 */
public class Loops_Demo_App {

    public static void main(String[] args) {

        /*
         * =========================================================
         * 1. WHILE LOOP
         * =========================================================
         *
         * A while loop is a PRE-TEST loop.
         *
         * PRE-TEST means:The condition is checked BEFORE the loop body runs.
         *
         * Question asked first: "Is there still space on the plane?"
         *
         * If the answer is YES, the loop runs.
         * If the answer is NO, the loop does not run at all.
         */

        int passengersOnBoard = 0;
        int maxSeats = 5;

        // Keep looping while the number of passengers on board
        // is less than the number of available seats.
        while (passengersOnBoard < maxSeats) {

            // Increase the number of passengers by 1
            // because one more passenger has boarded.
            passengersOnBoard++;

            // Display the current passenger number that boarded
            System.out.println("Passenger " + passengersOnBoard + " boarded.");
        }

        // This line runs after the while loop is finished
        System.out.println("Plane is now full!");

        System.out.println(); // blank line for neat output

        /*
         * COMMON WHILE LOOP MISTAKE:
         *
         * Forgetting to update the loop variable.
         *
         * Example:
         *
         * while (passengersOnBoard < maxSeats) {
         *     System.out.println("Passenger boarded.");
         * }
         *
         * Problem: passengersOnBoard never changes, so the condition stays true forever.
         *
         * Result: INFINITE LOOP
         */

        /*
         * =========================================================
         * 2. DO-WHILE LOOP
         * =========================================================
         *
         * A do-while loop is a POST-TEST loop.
         *
         * POST-TEST means:  code runs FIRST, then the condition is checked.
         *
         * This means the loop body always runs AT LEAST ONCE.
         *
         * Plane analogy: "Let one passenger board first, then check whether more passengers should continue boarding."
         */

        int passenger = 1;
        int maxPassengers = 5;

        do {
            // This code runs before the condition is checked
            System.out.println("Passenger " + passenger + " boarded.");

            // Move to the next passenger
            passenger++;

        } while (passenger <= maxPassengers);

        // This line runs after the do-while loop ends
        System.out.println("Boarding complete!");

        System.out.println(); // blank line for neat output

        /*
         * COMMON DO-WHILE LOOP MISTAKE:
         *
         * Forgetting the semicolon after the condition.
         *
         * Correct:
         * } while (passenger <= maxPassengers);
         *
         * Wrong:
         * } while (passenger <= maxPassengers)
         *
         * The semicolon is required in Java.
         */

        /*
         * =========================================================
         * 3. FOR LOOP
         * =========================================================
         *
         * A for loop is also a PRE-TEST loop.
         *
         * It is best used when you know exactly how many times the loop should run.
         *
         * In this example, we know there are 5 passengers.
         *
         * Structure of a for loop:
         *
         * for (initialization; condition; update) {
         *     // code
         * }
         *
         * Meaning:
         * 1. initialization -> where to start
         * 2. condition      -> when to continue
         * 3. update         -> how to move to the next value
         */

        int totalPassengers = 5;

        for (int passengerNumber = 1; passengerNumber <= totalPassengers; passengerNumber++) {

            // This statement repeats for each passenger
            System.out.println("Passenger " + passengerNumber + " is boarding the plane.");
        }

        // This line runs after the for loop finishes
        System.out.println("All passengers have boarded!");

        System.out.println(); // blank line for neat output

        /*
         * COMMON FOR LOOP MISTAKES:
         *
         * 1. Wrong condition
         * Example:
         * for (int i = 1; i < 5; i++)
         *
         * This prints 1 to 4, not 1 to 5.
         *
         * 2. Wrong update
         * Example:
         * for (int i = 1; i <= 5; i--)
         *
         * This decreases instead of increasing and can cause an infinite loop.
         */

        /*
         * =========================================================
         * PRE-TEST VS POST-TEST
         * =========================================================
         *
         * PRE-TEST LOOPS:
         * - while
         * - for
         *
         * In a pre-test loop, the condition is checked first.
         *
         * Example thought: "Should the next passenger board?"
         *
         * If false from the start, the loop runs zero times.
         *
         * POST-TEST LOOP:
         * - do-while
         *
         * In a post-test loop, the code runs first.
         *
         * Example thought:
         * "Let one passenger board, then check whether another passenger should board."
         *
         * Because the test comes after the code, the do-while loop runs at least once.
         */

        
    }
}