package org.Codewars.kyy8;

import java.util.Arrays;

public class FindMaximumandMinimumValuesOfAList {
    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return Arrays.stream(list).max().getAsInt();
    }
}
