package org.Codewars.kyy8;

public class BeginnerReduceButGrow {
    public static int grow(int[] x) {
        int b = 1;

        for (int i = 0; i < x.length; i++) {
            b *= x[i];
        }
        return b;
    }
}
