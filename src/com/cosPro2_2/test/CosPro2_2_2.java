package com.cosPro2_2.test;
/* [1] Cos Pro 2 급 2차
 * #문제 2
 * 작성자 : godwook
 * 작성일 : 2023.01.10
 * 문제
 */
class CosPro2_2_2 {
    public int func_a(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 5 == 0) {
                count += 1;
            }
        }
        return count;
    }
    public String func_b(int three,int five){
        String answer ="" ;
        if(three>five)
            return "three";
        else if (three <five)
            return "five";
        else
            return "same";
        }
    public int func_c(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] % 3 == 0) {
                count += 1;
            }
        }
        return count;
    }

    public String solution(int[] arr) {
        int countThree = func_c(arr);
        int countFive  = func_a(arr);
        String answer = func_b(countThree,countFive);
        return answer;
    }

    public static void main(String[] args){
        CosPro2_2_2 sol = new CosPro2_2_2();
        int[] arr = {2,3,6,9,12,15,10,20,22,25};
        String ret = sol.solution(arr);
        System.out.println(ret);

    }

}
