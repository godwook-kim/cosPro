package com.cosPro2_1.test;
/*
 * [1] Cos Pro 2 급 1차
 * #문제 3
 * 작성자 : godwook
 * 작성일 : 2023.01.08
 * 시작 날짜와 끝 날짜가 주어질 떄, 두 날짜가 며칠만큼 떨어져 있는지를 구하려 합니다. (단, 윤년은 고려하지 않는다)
 * 1단계 시작날짜가 1월 1일로 부터 며칠만큼 떨어져 있는지 구합니다.
 * 2단계 끝날짜가 1월1일로부터 며칠만큼 떨어져 있는지 구합니다.
 * 3단계 (2단계에서 구한 날짜) - (1단계에서 구한날짜) 극 구합니다.
 */
class CosPro2_1_3 {
    public int func_a(int month , int day ){
        int monthList[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int total = 0 ;
        for(int i = 0 ; i < month - 1 ; i++){
            total+= monthList[i];
        }
        total += day ;
        return total - 1 ;
    }
    public int solution(int startMonth, int startDay , int endMonth , int endDay){
        int startTotal = func_a(startMonth,startDay);
        int endTotal = func_a(endMonth,endDay);
        return endTotal-startTotal;
    }



    public static void main(String args[]) {
        CosPro2_1_3 sol = new CosPro2_1_3();
        int startMonth = 1;
        int startDay = 2;
        int endMOnth = 2;
        int endDay = 2;

        int ret = sol.solution(startMonth, startDay, endMOnth, endDay);
        System.out.println("Solution: return value of the method is " + ret + " .");

    }
}

