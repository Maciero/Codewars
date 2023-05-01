package org.Codewars.kyu7;

public class SquareDigit {
    public static int squareDigits(int n) {

        if (n == 0) {
            return 0;
        }

        int x = 0;
        int number = n;

        while (n != 0) {
            n = n / 10;
            x++;
        }
        int[] numbers = new int[x + 1];

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < numbers.length - 1; i++) {

            numbers[i] = number % 10;
            numbers[i] = numbers[i] * numbers[i];
            stringBuilder.insert(0, numbers[i]);
            number = number / 10;
        }

        Integer integer = Integer.valueOf(String.valueOf(stringBuilder));

        int y = integer;

        return y;

        //  return Integer.parseInt(String.valueOf(n)
        //                                      .chars()
        //                                      .map(i -> Integer.parseInt(String.valueOf((char) i)))
        //                                      .map(i -> i * i)
        //                                      .mapToObj(String::valueOf)
        //                                      .collect(Collectors.joining("")));
    }
}