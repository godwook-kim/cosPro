package com.cosPro2_2.test;
/*
 * 작성일 : 2023.01.11.
 * 문제 : 시작수 끝수 사이의 짝수의 제곱합 구하기
 * 작성자 : godwook
 */


class CosPro2_2_3 {
    public int solution(int N, int M){
        int answer = 0 ;
        int bigNo = 0 ;
        int smallNo = 0 ;
        if(N > M){
            bigNo = N;
            smallNo = M;
        }else{
            bigNo = M;
            smallNo = N;
        }
        for(int i = smallNo ; i <= bigNo ; i++){
            if(i%2==0){
                answer += Math.pow((int)i,(int) 2 );
            }
        }
        return answer;

    }
    public static void main(String[] args){
        CosPro2_2_3 sol = new CosPro2_2_3();
        int N = 4;
        int M = 7;
        int ret = sol.solution(N,M);

        System.out.println(ret);
    }
}
