package programmers;

import java.util.Arrays;

// 구명 보트 (정렬, 그리디)
// https://school.programmers.co.kr/learn/courses/30/lessons/42885
public class Level02_구명보트 {

    public static void main(String[] args) {
        Level02_구명보트 o = new Level02_구명보트();
        System.out.println(o.solution(new int[]{70, 50, 80, 50}, 100)); // 3
        System.out.println(o.solution(new int[]{70, 80, 50}, 100)); // 3
        System.out.println(o.solution(new int[]{40, 50, 60, 50}, 100)); // 2
    }

    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int length = people.length;

        int first = 0;
        int end = length - 1;

        while (first <= end) {
            int a = people[first];
            int b = people[end];
            if (a + b <= limit) {
                first++;
            }
            end--;
            answer++;
        }

        return answer;
    }

}
