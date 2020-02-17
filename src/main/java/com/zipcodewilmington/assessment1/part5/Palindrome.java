package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (j>=i){
                    if (input.substring(i, j).equals(reverse(input.substring(i, j)))){
                        counter++;
                    }

                 }
                }
            }
        return counter;
        }






    public static String reverse(String str) {
        String reversed = "";
        for(int p = str.length()-1;p>=0;p--){
            reversed+= str.charAt(p);
        }
        return reversed;
    }
}
