package com.cosPro2_2.test;
/*
 * 작성일 : 2023.01.11
 * 작성자 : godwook
 * 문제  : 엘레베이터 문제
 */
class CosPro2_2_6 {
    public int solution( int[] floors){
        int answer = 0  ;
        for(int i = 0 ; i<floors.length-1;i++){
            answer += Math.abs(floors[i+1]-floors[i]);
        }
        return answer ;

    }

    public static void main(String[] args){
        CosPro2_2_6 sol = new CosPro2_2_6();
        int[] floors ={1,2,5,4,2};
        int ret = sol.solution(floors);
        System.out.println(ret);
    }

}
