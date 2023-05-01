package org.Codewars.kyy8;

public class ReversedSequence {
    public static int[] reverse(int n) {

        int[] array = new int[n];
        int j = n;

        for (int i = 0; i < j; i++) {
            array[i] = n;
            n--;
        }
        return array;
    }
}
