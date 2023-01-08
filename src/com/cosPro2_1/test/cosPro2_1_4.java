package com.cosPro2_1.test;

/*
 * [1] Cos Pro 2 급 1차
 * #문제 4
 * 작성자 : godwook
 * 작성일 : 2023.01.08
 * 자연수가 들어있는 배열이 있습니다. 이 배열에서 가장 많이 등장하는 숫자의 갯수는 가정 적게 등장하느 ㄴ숫자 갯수의 몇배인지 구하려 합니다.
 * 1단계. 배열에 들어있는 각 자연수의 갯수를 셉니다.
 * 2단계. 가장 많이 등장하는 수의 갯수를 구합니다.
 * 3단계. 가장 적게 등장하는 수의 갯수를 구합니다.
 * 4단계 가장 많이 등장하는 수가 가장 적게 등장하는 수보다 몇 배 더 많은지 구합니다.

 */
class cosPro2_1_4 {
    int[] func_a(int[] arr){
        int[] counter = new int[1001];
        for(int i = 0 ; i < arr.length; i++){
            counter[arr[i]]++;
        }
        return counter;

    }
    int func_b(int[] arr){
        int ret = 0;
        for(int i = 0 ; i <arr.length;i++){
            if(ret<arr[i]){
                ret = arr[i];
            }
        }
        return ret;
    }

    int func_c(int[] arr){
        final int INF = 1001;
        int ret = INF;
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i] != 0 && ret > arr[i]){
                ret = arr[i];
            }
        }
        return ret ;
    }

    public int solution(int[] arr){
        int[] counter = func_a(arr);
        int maxCnt = func_b(counter);
        int minCnt = func_c(counter);

        return maxCnt / minCnt;
    }

    public static void main(String args[]){
        cosPro2_1_4 sol = new cosPro2_1_4();
        int[] arr = {1,2,3,3,1,3,3,2,3,2};
        int ret = sol.solution(arr);

        System.out.println("Solution: return value of the method is " + ret + " .");
    }

}
