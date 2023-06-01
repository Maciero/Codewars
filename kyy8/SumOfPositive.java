package org.Codewars.kyy8;

import java.util.Arrays;

public class SumOfPositive {
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(n->n>=0).sum();
    }
}
