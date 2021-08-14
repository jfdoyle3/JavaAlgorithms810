package com.careerdevs;

import java.util.Arrays;

public class PerfectSquarePatch {

    public static void solution(int num){
        int[][] patch=new int [num][num];
        if (num==0) {
            System.out.println(Arrays.deepToString(patch));
            return;
        }

        for(int idx1=0; idx1<num; idx1++){
            for(int idx2=0; idx2<num; idx2++){
                patch[idx1][idx2]=num;

            }
        }


    }
}
