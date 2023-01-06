/*
 * [1] Cos Pro 2 급 1차
 * #문제 1
 * 작성자 : godwook
 * 작성일 : 2023.01.06
 * A 학교에서는 단체 티셔츠를 주문하기 위해 학생별로 원하는 티셔츠 사이즈를 조사했습니다.
 * 선택할 수 있느 ㄴ티셔츠 사이즈는 작은 순서대로 "XS", "S", "M", "L" , "XL", "XXL" 총 6종류가 있습니다.
 * 학생별로 원하는 티셔츠 사이즈를 조사한 결과가 들어있는 배열 shirt_size가 매개변수로 주어질 떼
 * 사이즈별로 티셔츠가 몇 벌 필요한지 가장 작은 사이즈부터 순서대로 배열에 담아 return 하도록 solution 함수를 완성하시오.
 *  [제약조건]
 * shirt_size의 길이는 1이상 100이하
 * shirt_size에는 치수를 나타내는 문자열 "XS", "S", "M", "L" , "XL", "XXL" 이 들어있다. */

import java.util.*;

class cosPro2_1_1 {
    public int[] solution(String[] shirtSize){
        int[] answer = new int[6]; // "XS", "S", "M", "L" , "XL", "XXL" 이므로
        for(int i = 0 ; i <shirtSize.length;i++){
            switch (shirtSize[i]){
                case "XS" :
                    answer[0]++;
                    break;
                case "S" :
                    answer[1]++;
                    break;
                case "M" :
                    answer[2]++;
                    break;
                case "L" :
                    answer[3]++;
                    break;
                case "XL" :
                    answer[4]++;
                    break;
                case "XXL" :
                    answer[5]++;
                    break;
            }
        }
        return answer ;
    }

    public static void main(String args[]){
        cosPro2_1_1 sol = new cosPro2_1_1();
        String[] shirtSize = {"XS", "S", "L", "L" , "XL", "S" };
        int[] ret = sol.solution(shirtSize);
        System.out.println("Solution : return value of the method is" + Arrays.toString(ret) + " .");
    }
}


