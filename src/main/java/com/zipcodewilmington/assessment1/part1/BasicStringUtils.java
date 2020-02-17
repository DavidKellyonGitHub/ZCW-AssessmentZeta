package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
       String firstLetter = str.substring(0,1).toUpperCase();
       String restOfString = str.substring(1);
       return firstLetter+restOfString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String reversed = "";
        for(int i = str.length()-1;i>=0;i--){
            reversed+= str.charAt(i);
        }
        return reversed;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String reversed = "";
        for(int i = str.length()-1;i>=0;i--){
            reversed+= str.charAt(i);
        }
        String firstLetter = reversed.substring(0,1).toUpperCase();
        String restOfString = reversed.substring(1);

        return firstLetter + restOfString;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }
}
