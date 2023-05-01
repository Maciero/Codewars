package org.Codewars.kyu5;

public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder sentenceStringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i]);

            if (words[i].matches("\\p{P}")) {
                sentenceStringBuilder.append(words[i]);
            } else {
                String x = String.valueOf(stringBuilder.charAt(0));
                words[i] = words[i].substring(1);
                words[i] = words[i].concat(x + "ay");
                sentenceStringBuilder.append(words[i]).append(" ");
                stringBuilder.delete(0, stringBuilder.length());
            }
            str = String.valueOf(sentenceStringBuilder).trim();
        }
        return str;
    }
}