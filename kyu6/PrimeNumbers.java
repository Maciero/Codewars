package org.Codewars.kyu6;

public class PrimeNumbers {
    public static boolean isPrime(int num) {

        int counter = 0;

        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                counter += 1;
            }
        }
        return counter == 2;
    }
}
//best solution
// return number > 1
//         && IntStream.rangeClosed(2, (int) Math.sqrt(number))
//         .noneMatch(n -> (number % n == 0));

