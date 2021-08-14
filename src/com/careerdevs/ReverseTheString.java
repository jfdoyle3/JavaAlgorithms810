package com.careerdevs;

public class ReverseTheString {

    public static void solution(String input){
        StringBuilder reverseInput=new StringBuilder();

        reverseInput.append(input);
        reverseInput.reverse();

        System.out.println(reverseInput);
    }
}
