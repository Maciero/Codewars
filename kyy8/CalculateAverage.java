package org.Codewars.kyy8;

public class CalculateAverage {
    public static double find_average(int[] array) {

        double average = 0;

        if (array != null) {
            for (int i : array) {
                average += i;
            }
            average = average / array.length;
            return average;

        } else {
            return average;
        }
    }
}