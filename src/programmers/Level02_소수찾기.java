package programmers;

import java.util.Arrays;

// 소수찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/42839
public class Level02_소수찾기 {

    public static void main(String[] args) {
        System.out.println(solution("17")); // 3
        System.out.println(solution("001")); // 2
    }


    public static int solution(String numbers) {
        int answer = 0;
        int length = (int) Math.pow(10, numbers.length());
        boolean[] isPrime = new boolean[length];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < length; i++) {
            if(isPrime[i]){
                for (int j = i * i; j < length; j += i) {
                    isPrime[j] = false;
                }
            }
        }



        return answer;
    }

}
