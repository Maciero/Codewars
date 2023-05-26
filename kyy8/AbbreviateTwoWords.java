package org.Codewars.kyy8;

public class AbbreviateTwoWords {

    public static String abbrevName(String name) {

        StringBuilder initials = new StringBuilder();

        
        String[] words = name.split(" ");

        for (String i : words) {
            initials.append(i.charAt(0) + ".");
        }

        initials.deleteCharAt(initials.length() - 1);
        String initialsWithUpperCase = initials.toString().toUpperCase();

        return initialsWithUpperCase;
    }
}