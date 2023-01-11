package com.cosPro2_2.test;
/*
 * 작성일 : 2023.01.11.
 * 문제 : 배열 내 길이 5이상인 문자열 붙여서 출력
 * 작성자 : godwook
 */
class CosPro2_2_4 {
    public String solution(String[] words){
        String answer ="";
        for( String word : words ) {
            if(word.length()>=5){
                answer += word;
            }
        }
        if(answer == ""){
            answer ="empty";
        }
        return answer;
    }

    public static void main(String[] args){
        CosPro2_2_4 sol = new CosPro2_2_4();
        String[] words1 = { "my", "favorite","color" , "is" , "violet"};
        String ret1 = sol.solution(words1);
        System.out.println(ret1);

        String[] words2 = { "my", "is" , "vio"};
        String ret2 = sol.solution(words2);
        System.out.println(ret2);
    }
}
