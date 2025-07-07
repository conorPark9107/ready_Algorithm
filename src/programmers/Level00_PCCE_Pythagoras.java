package programmers;

import java.util.Scanner;

// 피타고라스 정리
// https://school.programmers.co.kr/learn/courses/30/lessons/250132
public class Level00_PCCE_Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c * c- a * a;

        System.out.println(b_square);
    }
}
