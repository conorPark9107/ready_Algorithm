package programmers;

import java.util.Arrays;
import java.util.HashSet;

// 소수찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/42839
public class Level02_소수찾기 {

    public static void main(String[] args) {
        System.out.println(solution("17")); // 3
        System.out.println(solution("011")); // 2
    }

    static boolean[] isPrime;
    static HashSet<Integer> set;
    static String numbers;

    public static int solution(String number) {
        int length = (int) Math.pow(10, number.length());
        isPrime = new boolean[length];
        numbers = number;

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < length; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        set = new HashSet<>();
        dfs(0, new boolean[numbers.length()]);

        return set.size();
    }

    private static void dfs(int current, boolean[] visited) {
        if(isPrime[current]){
            set.add(current);
        }

        for (int i = 0; i < numbers.length(); i++) {
            if(visited[i]) continue;

            visited[i] = true;
            int next = current * 10 + (numbers.charAt(i) - '0');
            dfs(next, visited);
            visited[i] = false;
        }
    }


    public static int solution01(String numbers) {
        int answer = 0;
        int length = (int) Math.pow(10, numbers.length());
        boolean[] isPrime = new boolean[length];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < length; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < length; j += i) {
                    isPrime[j] = false;
                }
            }
        }



        return answer;
    }

}
