package com.cosPro2_2.test;
/*
 * 작성일 : 2023.01.12
 * 작성자 : godwook
 * 문제 :  투표 결과가 들어있는 리스트 votes , 후보의 수 N , 표의수 K가 주어질 때, k표를 받은 후보는 몇명인지 return
 */
class CosPro2_2_9 {
    public int solution(int[] arr , int N , int K){
        int answer = 0 ;
        int[] tempArr = new int[N];
        // 초기화
        for(int i = 0 ; i< N ; i++){
            tempArr[i] = 0;
        }
        for(int i = 0 ; i < arr.length ; i++){
            tempArr[arr[i]-1]++;
        }
        for(int i = 0 ; i < tempArr.length; i++){
            if(tempArr[i] == K){
                answer++;
            }
        }
        return answer ;
    }

    public static void main(String[] args){
        CosPro2_2_9 sol = new CosPro2_2_9();
        int[] votes = {2,5,3,4,1,5,1,5,5,3};
        int N = 5;
        int K = 2;
        int ret = sol.solution(votes,N,K);
        System.out.println(ret);

    }
}
