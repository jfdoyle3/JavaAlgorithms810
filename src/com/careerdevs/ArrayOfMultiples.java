package com.careerdevs;

import java.util.Arrays;

public class ArrayOfMultiples {


    public static void solution(int num,int length){
        int[] multiples=new int[length];
        int counter=1;
        for (int idx=0; idx<length; idx++) {
            multiples[idx] = num * (idx+counter);
            System.out.println(multiples[idx]);
        }
        System.out.println(Arrays.toString(multiples));
    }
}
