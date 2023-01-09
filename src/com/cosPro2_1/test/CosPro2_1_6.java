package com.cosPro2_1.test;
/* [1] Cos Pro 2 급 1차
 * #문제 6
 * 작성자 : godwook
 * 작성일 : 2023.01.09
 * 3,6,9 게임
 */
import java.util.Scanner;

public class CosPro2_1_6 {
    public int solution(int number){
        int count = 0 ;
        for(int i = 1 ; i <= number ; i++){
            int current = i ;
            int temp = count;
            while (current != 0 ){
                if(current%10==3 || current%10==6 || current%10==9){
                    count++;
                    System.out.print("pair");
                }
                current/=10;
            }
            if(temp ==count)
                System.out.print(i);
            System.out.println(" ");
        }
        System.out.println();
        return count;
    }
    public static void main(String args[]){
        CosPro2_1_6 sol = new CosPro2_1_6();
        Scanner input = new Scanner(System.in);
        int number = 0 ;
        number = input.nextInt();
        System.out.println("insert value is " + number);
        int ret = sol.solution(number);
        System.out.println( "return value is " + ret + " .");
    }
}
