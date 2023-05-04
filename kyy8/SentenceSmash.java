package org.Codewars.kyy8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SentenceSmash {
    public static String smash(String... words) {

        StringBuilder stringBuilder = new StringBuilder();
        List<String> listWithWords = new ArrayList<>(Arrays.asList(words));

        for (String listWithWord : listWithWords) {
            stringBuilder.append(listWithWord).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
//  return String.join(" ", words);
//
