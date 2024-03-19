package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

        System.out.println("***************************");

        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

        System.out.println("***************************");

        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }


    public static boolean isPalindrome(int number) {
        int numberTemp = number;
        int newNumber = 0;

        while (number != 0) {
            int value = number % 10;
            newNumber = newNumber * 10 + value;
            number /= 10;
        }
        if (numberTemp == newNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0)
            return false;
        else {
            int total = 0;
            for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0)
                    total += i;
            }

            return total == number;
        }
    }

    public static String numberToWords(int number) {
        if (number < 0)
            return "Invalid Value";

        String[] numbersString = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String result = "";

        while (number > 0) {
            int digit = number % 10;
            result = numbersString[digit] + " " + result;
            number /= 10;
        }

        return result.trim();
    }
}
