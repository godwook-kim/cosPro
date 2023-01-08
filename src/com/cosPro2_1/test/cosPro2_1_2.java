package com.cosPro2_1.test;

/*
 * [2] Cos Pro 2 급 1차
 * #문제 2
 * * 작성자 : godwook
 * 작성일 : 2023.01.06
 * A 쇼핑몰에서는 회원 등급에 따라 할인 서비스를 제공합니다.
 * 회원 등급에 따른 할인율은 다음과 같습니다.
 * S 5% G 10% V 15%
 *
 */
class cosPro2_1_2 {
    public int solution(int price , String grade){
        int answer = 0 ;
        switch (grade) {
            case "S" :
                answer = price * 95 / 100 ;
                break;
            case "G" :
                answer = price * 90 / 100 ;
                break;
            case "V" :
                answer = price * 85 / 100 ;
                break;
        }
        return answer;
    }

    public static void main(String args[]){
        cosPro2_1_2 sol = new cosPro2_1_2();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1,grade1);

        System.out.println("price1 = " + price1 + "\n--> " + ret1);

        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2,grade2);

        System.out.println("price2 = " + price2 + "\n--> " + ret2);
    }

}
