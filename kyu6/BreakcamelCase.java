package org.Codewars.kyu6;

public class BreakcamelCase {
    public static String camelCase(String input) {

        StringBuilder stringBuilder = new StringBuilder();

        String[] splited = input.split("(?=[A-Z])");

        for (String s : splited) {
            stringBuilder.append(s + " ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder.toString();
    }
}
//   return input.replaceAll("([A-Z])", " $1");

//  return String.join(" ", input.split("(?=[A-Z])"));