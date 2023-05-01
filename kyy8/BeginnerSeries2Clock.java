package org.Codewars.kyy8;

public class BeginnerSeries2Clock {
    public static int Past(int h, int m, int s) {
        return h <= 23 && m <= 59 && s <= 59 ? (s * 1000) + m * (60 * 1000) + h * (60 * 1000 * 60) : 0;
    }
}
