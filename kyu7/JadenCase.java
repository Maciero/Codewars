package org.Codewars.kyu7;

public class JadenCase {
    public String toJadenCase(String phrase) {

        String wordsAfterUpperCase = "";

        if (phrase != null && !phrase.equals("")) {

            String[] words = phrase.split(" ");
            StringBuilder stringBuilder = new StringBuilder();

            for (String word : words) {
                stringBuilder.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
            wordsAfterUpperCase = String.valueOf(stringBuilder);

            return wordsAfterUpperCase.trim();
        }
        return null;
    }
}
//public String toJadenCase(String phrase) {
//		if(phrase == ""){
//      return null;
//    }
//    else{
//		  return WordUtils.capitalize(phrase);