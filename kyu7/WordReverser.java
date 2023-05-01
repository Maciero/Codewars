package org.Codewars.kyu7;

public class WordReverser {
    public static String reverseWords(final String original) {

        String[] words = original.split(" ");

        if (words.length == 0){
            return original;
        }

        StringBuilder sb = new StringBuilder();
        StringBuilder sbr = new StringBuilder();

        for (String word : words) {
            {
                sbr.append(word);
                sbr.reverse();
                sb.append(sbr).append(" ");
                sbr.delete(0, sbr.length());
            }
        }


        return String.valueOf(sb).trim();

//        return original.trim().isEmpty() ? original : Stream.of(original.split(" "))
//                .map(word -> new StringBuffer(word).reverse())
//                .collect(Collectors.joining(" "));
    }
}

