package org.Codewars.kyu6;

import java.util.ArrayList;
import java.util.List;

public class Persist {
    public static int persistence(long n) {

        int counter = 0;

        while (n > 9) {

            long newN = n;
            List<Long> listNumbers = new ArrayList<>();

            while (newN != 0) {
                listNumbers.add(newN % 10);
                newN = newN / 10;
            }

            n = 1;
            for (Long listNumber : listNumbers) {
                n *= listNumber;
            }
            listNumbers.clear();
            counter++;
        }
        return counter;
    }
}
//	long m = 1, r = n;
//
//    if (r / 10 == 0)
//      return 0;
//
//    for (r = n; r != 0; r /= 10)
//      m *= r % 10;
//
//    return persistence(m) + 1;