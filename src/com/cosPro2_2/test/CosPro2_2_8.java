package com.cosPro2_2.test;
/*
 * 작성일 : 2023.01.12
 * 작성자 : godwook
 * 문제  :  소수 알고리즘
 *
 */
public class CosPro2_2_8 {
    public int solution(int number){
        int answer = 0 ;
        while(number>1){
            if(number%10==2 || number%10==3 || number%10==5 || number%10 ==7){
                answer++;
                //System.out.println(number);
            }
            number = number /10 ;
        }
        return answer;
    }
    public static void main(String[] args){
        CosPro2_2_8 sol = new CosPro2_2_8();
        int number = 29022531 ;
        int ret = sol.solution(number);
        System.out.println(ret);
    }

}
