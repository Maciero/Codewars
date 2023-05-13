package org.Codewars.kyu6;

public class DetectPangram {
    public boolean check(String sentence) {
        sentence = sentence.toLowerCase();

        boolean allLetterPresent = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!sentence.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }
        return allLetterPresent;
    }
}
//     for (char c = 'a'; c<='z'; c++)
//            if (!sentence.toLowerCase().contains("" + c))
//                return false;
//        return true;

//	return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;