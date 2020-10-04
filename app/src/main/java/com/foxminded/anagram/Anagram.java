package com.foxminded.anagram;

public class Anagram {
    public String reverse(String input) {

        if (input == null) {
            throw new IllegalArgumentException("input == null");
        }

        String result = "";
        String[] word = input.split(" ");
        for (int i = 0; i < word.length; i++) {
            String rewerseWord = reverseWord(word[i]);
            result += rewerseWord + " ";
        }
        return result.trim();

    }

    private String reverseWord(String word) {
        String result = "";

        for (int i = 0, j = word.length() - 1; i < word.length(); i++, j--) {

            if (Character.isLetter(word.charAt(i))) {

                if (Character.isLetter(word.charAt(j))) {
                    result += word.charAt(j);

                } else {
                    i--;
                }

            } else {
                result += word.charAt(i);
                j++;
            }
        }
        return result;
    }
}
