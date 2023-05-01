package org.Codewars.kyu7;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        return str.replaceAll("a", "")
                .replaceAll("e", "")
                .replaceAll("i", "")
                .replaceAll("o", "")
                .replaceAll("u", "")
                .replaceAll("A", "")
                .replaceAll("E", "")
                .replaceAll("I", "")
                .replaceAll("O", "")
                .replaceAll("U", "");

        // return Z.replaceAll("(?i)[aeiou]" , "");
        //return str.replaceAll("[aAeEiIoOuU]", "");
    }
}