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
    private static int ascii, oppLetter;
    private static char letter;

    public static void solution(String input) {
        StringBuilder cipher = new StringBuilder();

        char[] inputArr = new char[input.length()];
        for (int i = 0; i < input.length(); i++)
            inputArr[i] = input.charAt(i);

        for(char c : inputArr){
            if(c>='A' && c<='Z')
              cipher.append(upperCaseLetter(c));

            if(c>='a' && c<='z')
                cipher.append(lowerCaseLetter(c));
//            else
//                cipher.append(c);

        }

        System.out.println(cipher.toString());



    }

        private static char lowerCaseLetter ( char c){

            ascii = c - 97;
            oppLetter = 26 - ascii + 96;
            letter = (char) oppLetter;
            return letter;
        }

        private static char upperCaseLetter (char c){

            ascii = c - 65;
            oppLetter = 26 - ascii + 64;
            letter = (char) oppLetter;
            return letter;
        }
    }
