package org.Codewars.kyu7;

import java.util.Arrays;

public class FindShortestWord {
    public static int findShort(String s) {

        String[] words = s.split(" ");
        return Arrays.stream(words).mapToInt(String::length).min().getAsInt();

//        return Stream.of(s.split(" "))
//                .mapToInt(String::length)
//                .min()
//                .getAsInt();
    }
}
