package com.cosPro2_2.test;
/*
 * 작성일 : 2023.01.11.
 * 문제 : 배열 내 길이 5이상인 문자열 붙여서 출력
 * 작성자 : godwook
 */
class CosPro2_2_5 {
    public int solution (int attack , int recovery , int hp){
        int count = 0 ;
        while(true){
            count += 1 ;
            hp -= attack;
            if (hp <= 0) {

                break;
            }
            hp += recovery;

        }
        return count;
    }

    public static void main(String[] args){
        CosPro2_2_5 sol = new CosPro2_2_5();
        int attack = 30;
        int recovery = 10;
        int hp = 60;
        int ret = sol.solution(attack,recovery,hp);

        System.out.println(ret);
    }
}
