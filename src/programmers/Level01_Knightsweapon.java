package programmers;

import java.util.HashSet;
import java.util.Set;

// 기사단원의 무기
// https://school.programmers.co.kr/learn/courses/30/lessons/136798
public class Level01_Knightsweapon {

    public static void main(String[] args) {
        System.out.println(solution(5, 3, 2)); // 10
        System.out.println(solution(10, 3, 2)); // 21
    }

    public static int solution(int number, int limit, int power) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    set.add(j);
                    set.add(i / j);
                }
            }
            answer += (set.size() > limit) ?  power : set.size();
            set.clear();
        }

        return answer;
    }

    public int betterThanMyCode_solution(int number, int limit, int power) {
        // 에라토스테네스와 같은 느낌! 배열을 먼저 i==N 일때 N의 약수를 모두 구하는것이 아닌
        // i == N일때 1 ~ number까지의 숫자들에 대해 N의 약수라면 모두 카운트 해주는 식으로 코드를 작성했음.
        int[] count = new int[number + 1];
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number / i; j++) {
                count[i * j]++;
            }
        }
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            if (count[i] > limit) {
                answer += power;
            } else {
                answer += count[i];
            }
        }
        return answer;
    }

}
