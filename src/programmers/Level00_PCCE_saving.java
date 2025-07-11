package programmers;

import java.util.Scanner;

// 저축
// https://school.programmers.co.kr/learn/courses/30/lessons/250130
public class Level00_PCCE_saving {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int before = sc.nextInt();
        int after = sc.nextInt();

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before;
            month++;
        }
        while (money < 100){
            money += after;
            month++;
        }

        System.out.println(month);
    }
}
