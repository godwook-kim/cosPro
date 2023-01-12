package com.cosPro2_2.test;
/*
 * 작성일 : 2023.01.12
 * 작성자 : godwook
 * 문제  : 상품권 지급문제
 */
class CosPro2_2_10 {
    public int solution(int[] purchase){
        int answer = 0 ;
        for(int amt : purchase){
            if(amt >= 1000000){
                answer+=50000;
            }else if(amt >= 600000){
                answer+=30000;
            }else if(amt >= 400000){
                answer+=20000;
            }else if(amt >= 200000){
                answer+=10000;
            }
        }
        return answer;
    }
    public static void main(String[] args){
        CosPro2_2_10 sol = new CosPro2_2_10();
        int[] purchase = {150000,210000,399990,990000,1000000};
        int ret = sol.solution(purchase);
        System.out.println(ret);
    }
}
