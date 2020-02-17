package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input) {

        int counter = 0;
        for (int i = 0;i<=input.length();i++){
            for (int j=0;j<=input.length();j++){
                if (j>i) {
                    if (input.substring(i,j).equals(reverse(input.substring(i,j)))){
                        counter++;
                    }
                }
            }
        }
        return counter;
        }






    public static String reverse(String str) {
        String reversed = "";
        for(int i = str.length()-1;i>=0;i--){
            reversed+= str.charAt(i);
        }
        return reversed;
    }
}
