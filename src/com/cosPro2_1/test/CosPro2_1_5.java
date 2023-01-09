package com.cosPro2_1.test;
/* [1] Cos Pro 2 급 1차
        * #문제 5
        * 작성자 : godwook
        * 작성일 : 2023.01.09
        * 배열의 순서 뒤집기
*/
import java.util.Arrays;

class CosPro2_1_5 {
    public int[] solution(int[] arr){
        int left = 0 ;
        int right = arr.length -1 ;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left+=1;
            right-=1;
        }
        return arr;
    }
    public static void main(String args[]){
        CosPro2_1_5 sol = new CosPro2_1_5();
        int[] arr = {1,4,2,3};
        int[] ret = sol.solution(arr);

        System.out.println(Arrays.toString(arr));
    }
}
