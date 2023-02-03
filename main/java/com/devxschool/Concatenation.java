package com.devxschool;

public class Concatenation {

    public static void main(String[] args) {
        /**
         * Write a function that concatenates two words into single,
         * however if the concatenation creates a similar double char, then omit one of the character's
         * ex:
         * "abc" "cat" -> "abcat"
         *
         * ex2:
         * abc", "xyz" -> "abcxyz"
         *
         * ex3:
         * "happy", "yolk" -> happyolk
         */

        String word1 = "String";
        String word2 = "gMethod";
        System.out.println();
        System.out.println(concat(word1, word2));

    }

    public static String concat(String word1, String word2) {
        if (word1.charAt(word1.length()-1) == word2.charAt(0)) {
            return word1.substring(0, word1.length()-1) + word2.substring(0);
        }
        return word1 + word2;
    }
}
