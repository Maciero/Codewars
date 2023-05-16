package org.Codewars.kyu6;

public class DuplicateEncoder {
    public static String encode(String word) {

        int counter = 0;

        word = word.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder();

        String[] words = word.split("");

        for (String s : words) {
            for (String value : words) {
                if (s.equals(value)) {
                    counter++;
                }
            }
            if (counter == 1) {
                stringBuilder.append("(");
            } else {
                stringBuilder.append(")");
            }
            counter = 0;
        }
        return stringBuilder.toString();
    }
}

//  word = word.toLowerCase();
//    String result = "";
//    for (int i = 0; i < word.length(); ++i) {
//      char c = word.charAt(i);
//      result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
//    }
//    return result;

// return word.toLowerCase()
//                   .chars()
//                   .mapToObj(i -> String.valueOf((char)i))
//                   .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
//                   .collect(Collectors.joining());