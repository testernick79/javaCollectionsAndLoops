package com.javaCollectionsAndLoops;

public class Main {

    public static void main(String[] args) {
	// testing git
        System.out.println("Hello Test");

        // arrays

        String[] bandMembers = {"Bobby", "Frank", "Leroy", "Paul"};
        // first item in array
        System.out.println(bandMembers[3]);

        // list of food items
        String[] foodList = new String[4];
            foodList[0] = "beer";
            foodList[1] = "milk";
            foodList[2] = "eggs";
            foodList[3] = "garbage bags";
            foodList[1] = "goat milk";

            System.out.println(foodList[1]);

            int[] fastestSpeeds = {120, 100, 122, 188};
            System.out.println(fastestSpeeds[2]);
    }
}
