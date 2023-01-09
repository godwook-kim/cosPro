package com.cosPro2_1.test;

import java.util.Scanner;

/* [1] Cos Pro 2 급 1차
 * #문제 9
 * 작성자 : godwook
 * 작성일 : 2023.01.09
 * 문자열 압축
 */
public class CosPro2_1_9 {
    public String solution(String characters){
        String result ="";
        result +=characters.charAt(0);
        for(int i =1 ; i<characters.length();i++){
            if(characters.charAt(i-1) !=characters.charAt(i))
                result += characters.charAt(i);
        }
        return result;
    }
    public static void main(String args[]){
        CosPro2_1_9 sol = new CosPro2_1_9();
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String ret = sol.solution(str);
        System.out.println(ret);
    }
}
