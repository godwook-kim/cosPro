package com.cosPro2_1.test;
/* [1] Cos Pro 2 급 1차
 * #문제 8
 * 작성자 : godwook
 * 작성일 : 2023.01.09
 * 회문
 */
class CosPro2_1_8 {
    boolean solution(String sentence){
        String str ="";
        for(int i = 0 ; i<sentence.length();i++) {
            char c = sentence.charAt(i);
            if (c != ' ' && c != '.') {
                str += c;
            }
        }
        int len = str.length();
        for(int i = 0 ; i< len /2 ;i++){
            if(str.charAt(i)!=str.charAt(len-1-i))
                 return false;
            }
            return true;
        }
    public static void main(String args[]){
        CosPro2_1_8 sol = new CosPro2_1_8();
        String sentence1 = "never odd or even.";
        boolean ret1 = sol.solution(sentence1);
        System.out.println("Solution : return value of th method is " + ret1 + " .");

        String sentence2 = "palindrome.";
        boolean ret2 = sol.solution(sentence2);
        System.out.println("Solution : return value of th method is " + ret2 + " .");
    }

}
