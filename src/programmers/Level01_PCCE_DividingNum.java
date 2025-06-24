package programmers;

import java.util.Scanner;

// PCCE 기출 3번 / 수 나누기
// https://school.programmers.co.kr/learn/courses/30/lessons/340205
public class Level01_PCCE_DividingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int answer = 0;

        for(int i=0; number != 0; i++){
            answer += number % 100;
            number /= 100;
        }
        System.out.println(answer);
    }
}
