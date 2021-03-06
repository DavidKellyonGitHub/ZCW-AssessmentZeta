package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
//        int wordCount = 1;
//        for (int i = 0;i <sentence.length();i++){
//            if (sentence.charAt(i) == ' '){
//                wordCount++;
//            }
//        }
//        String[] parsed = new String[wordCount];
//        int counter1 = 0;
//        int counter2 = 0;
//        for (int i = 0;i< sentence.length();i++){
//            if (sentence.charAt(i) != ' '){
//                counter1++;
//            } else if (sentence.charAt(i) == ' '){
//                parsed[counter2] = sentence.substring(i-counter1,i);
//                counter1 = 0;
//                counter2++;
//            }
//        }
//        return parsed;
        return sentence.split(" ");
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        return sentence.split(" ")[0];
    }

//    /**
//     * @param sentence a string containing words delimited by spaces, representative of a sentence
//     * @return the first word in the specified sentence, with identical contents in reverse order
//     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
//     */
    public static String reverse(String str) {
        String reversed = "";
        for(int i = str.length()-1;i>=0;i--){
            reversed+= str.charAt(i);
        }
        return reversed;
    }

    public static String reverseFirstWord(String sentence) {
        return reverse(getFirstWord(sentence));
    }

//    /**
//     * @param sentence a string containing words delimited by spaces, representative of a sentence
//     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
//     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
//     */

    public static String reverseThenCamelCase(String str) {
        String reversed = "";
        for(int i = str.length()-1;i>=0;i--){
            reversed+= str.charAt(i);
        }
        String firstLetter = reversed.substring(0,1).toUpperCase();
        String restOfString = reversed.substring(1);
        return firstLetter + restOfString;
    }

    public static String reverseFirstWordThenCamelCase(String sentence) {
        return reverseThenCamelCase(getFirstWord(sentence));
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        return str.substring(0,index)+str.substring(index+1);
    }

}
