package org.Codewars.kyy8;

public class FakeBinary {
    public static String fakeBin(String numberString) {

        StringBuilder stringBuilder = new StringBuilder();

        char a[] = numberString.toCharArray();
        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = Character.getNumericValue(a[i]);
        }

        for (int j : b) {
            if (j >= 5) {
                stringBuilder.append("1");
            } else {
                stringBuilder.append("0");
            }
        }

        return String.valueOf(stringBuilder);
    }
    // return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
}