package com.cosPro2_1.test;
/* [1] Cos Pro 2 급 1차
 * #문제 7
 * 작성자 : godwook
 * 작성일 : 2023.01.09
 * 틀린 코드 고치기
 */
class CosPro2_1_7 {
    public int solution(int[] scores){
        int count = 0 ;
        for(int i = 0; i <scores.length;i++){
            if(650<=scores[i] && scores[i] < 800){
                count +=1;
            }
        }
        return count ;
    }

    public static void main(String args[]){
        CosPro2_1_7 sol = new CosPro2_1_7();
        int[] scores = {650,722,914,558,714,803,650,679,669,800};
        int ret = sol.solution(scores);

        System.out.println(ret);
    }
}
