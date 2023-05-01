package org.Codewars.kyy8;

public class BeginnerSeries1SchoolPaperwork {
    public static int paperWork(int n, int m) {
        if (n > 0 && m > 0) {
            return n * m;
        }
        return 0;

        //return (n < 0) || (m < 0) ? 0 : n * m;
        //return n>0&&m>0 ? m*n : 0;
    }
}

