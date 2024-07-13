package com.example.yourapp.utils;

public class Utils {
    public static String capitalize(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
}