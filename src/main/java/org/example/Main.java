package org.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
    public static boolean isPalindrome(int number) {

        number = Math.abs(number);
        String word = String.valueOf(number);
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }
    public static boolean isPerfectNumber(int number) {
        if (number <= 1) return false;

        int sum = 1;
        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }
        String numStr = String.valueOf(number);
        StringBuilder result = new StringBuilder();
        String[] words = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"};
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            result.append(words[digit]);
            if (i < numStr.length() - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
