package com.careerdevs;

public class ReverseTheString {


    private static int ascii, oppLetter;
    private static char letter;

    public static void solution(String input) {
        StringBuilder reverseInput = new StringBuilder();
        String[] reversed=new String[input.length()];
//        reverseInput.append(input);
//        reverseInput.reverse();
        char[] inputArr = new char[input.length()];
        for (int i = 0; i < input.length(); i++)
            inputArr[i] = input.charAt(i);

        for (char c : inputArr)
            System.out.print(c);

        int inputIdx= inputArr.length-1;
        for (int idx= 0; idx<inputArr.length-1; idx++){
            reversed[idx]= String.valueOf(inputArr[inputIdx]);
            inputIdx--;
        }
        System.out.println();
        System.out.println();
        for(String s : reversed)
        System.out.print(s);

        //  System.out.println(reverseInput);
    }

    private static char getLetters(char c) {
        int a = 0;
        if (c >= 'A' && c <= 'Z') {
            a = 1;
        }
        if (c >= 'a' && c <= 'z')
            a = 2;

        switch (a) {
            case 1: {
                ascii = c - 65;
                oppLetter = 26 - ascii + 64;
                letter = (char) oppLetter;
                return letter;
            }
            case 2: {
                ascii = c - 97;
                oppLetter = 26 - ascii + 96;
                letter = (char) oppLetter;
                return letter;
            }
            default:
                return c;
        }
    }
}
