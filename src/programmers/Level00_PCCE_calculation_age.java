package programmers;

import java.time.Month;
import java.time.Year;
import java.util.Scanner;

// 나이계산
// https://school.programmers.co.kr/learn/courses/30/lessons/250131
public class Level00_PCCE_calculation_age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        }
        else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }

        System.out.println(answer);
    }

}
