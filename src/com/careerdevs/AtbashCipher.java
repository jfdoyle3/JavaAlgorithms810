package com.careerdevs;

public class AtbashCipher {
    // 97 = a   -/+ 32    65 = A
    // 122 = z   -/+ 32   90 = Z
    // a-z=25             A-Z=25
    //
    // a=0   z=26;
    // a=1   z=25;
    //
    //
    public static void solution(String input) {
        char[] inputArr = new char[input.length()];
        for (int i = 0; i < input.length(); i++)
            inputArr[i] = input.charAt(i);

        int ascii;
        char letter;
        for (char c : inputArr) {
           ascii = c - 26;
          letter = (char) ascii;
            System.out.print(letter+" ");
        }



    }
}
