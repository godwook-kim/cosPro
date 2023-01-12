package com.cosPro2_2.test;
/*
 * 작성일 : 2023.01.12
 * 작성자 : godwook
 * 문제  : 연산자 우선순위 문제 , 섭씨<->화씨
 */
class CosPro2_2_7 {
    public int solution(int value, String unit){
        int converted = 0 ;
        if(unit.equals("C"))
            converted = (int) (value *1.8 +32);
        if(unit.equals("F"))
            converted = (int)( (value-32)/ 1.8);
        return converted;
    }
    public static void main(String[] args){
        CosPro2_2_7 sol = new CosPro2_2_7();
        int value = 527 ;
        String unit = "F";
        int ret = sol.solution(value,unit);
        System.out.println(ret);
    }

}
