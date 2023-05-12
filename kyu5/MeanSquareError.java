package org.Codewars.kyu5;

import java.util.Arrays;

public class MeanSquareError {
    public static double solution(int[] arr1, int[] arr2) {


        int[] numbers = new int[arr1.length];
        double solution;

        for (int i = 0; i < arr1.length; i++) {
            numbers[i] = arr1[i] - arr2[i];
            numbers[i] = numbers[i] * numbers[i];
        }

        solution = Arrays.stream(Arrays.stream(numbers).toArray()).asDoubleStream().sum();
        solution = solution / arr1.length;

        return solution;
    }
}


//        double dif = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            dif += (Math.pow(Math.abs(arr1[i] - arr2[i]),2));
//        }
//        return dif / arr1.length;

// return java.util.stream.IntStream.range(0, arr1.length).map(i -> arr1[i] - arr2[i]).map(diff -> diff * diff).average().getAsDouble();