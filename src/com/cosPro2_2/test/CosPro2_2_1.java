package com.cosPro2_2.test;
/* [1] Cos Pro 2 급 2차
 * #문제 1
 * 작성자 : godwook
 * 작성일 : 2023.01.10
 * 배열 문제
 */


class CosPro2_2_1 {
    final int maxProductNumber = 10;

    public int[] func_a(int[] gloves){
        int[] counter = new int[maxProductNumber+1];
        for(int i = 0 ; i< gloves.length;i++){
                counter[gloves[i]]++;
        }
        return counter;
    }
    public int solution(int[] leftGloves , int[] rightGloves){
        int[] leftCounter = func_a(leftGloves);
        int[] rightCounter = func_a(rightGloves);
        int total = 0 ;
        for(int i = 1 ; i <=maxProductNumber; i++){
            total += Math.min(leftCounter[i],rightCounter[i]);
        }
        return total;
    }

    public static void main(String[] args){
        CosPro2_2_1 sol = new CosPro2_2_1();
        int[] leftGloves = {2,1,2,2,4};
        int[] rightGloves = {1,2,2,4,4,7};

        int ret = sol.solution(leftGloves,rightGloves);
        System.out.println(ret);
    }

}
