package com.company;

public class Result {
    public static boolean checkForPalindrome(String example) {

        StringBuilder str = new StringBuilder(example);

        return str.reverse().toString().equals(example);
    }

    public static void returnResult(String example) {

        boolean result = checkForPalindrome(example);

        if (result == true)
            System.out.println("Это палиндром");
        else
            System.out.println("Это не палиндром");
        return;
    }

}
