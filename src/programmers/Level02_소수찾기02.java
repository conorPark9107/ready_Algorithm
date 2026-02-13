package programmers;

import java.util.Arrays;
import java.util.HashSet;

// 소수 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/42839
public class Level02_소수찾기02 {

    public static void main(String[] args) {
        Level02_소수찾기02 o = new Level02_소수찾기02();
        System.out.println(o.solution("17"));  // 3
        System.out.println(o.solution("011")); // 2
    }

    public int solution(String numbers) {
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        dfs(numbers, new boolean[numbers.length()], "", set);
        for(int num : set){
            if(isPrime(num)) answer++;
        }
        return answer;
    }

    public void dfs(String numbers,  boolean[] visited, String curr, HashSet<Integer> set) {
        if(!curr.equals("")) set.add(Integer.parseInt(curr));

        for (int i = 0; i < numbers.length(); i++) {
            if(visited[i]) continue;
            visited[i] = true;
            dfs(numbers, visited, curr + numbers.charAt(i), set);
            visited[i] = false;
        }
    }

    public boolean isPrime(int num){
        if(num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }


    public int solution01(String numbers) {
        boolean[] isPrime = new boolean[10000000];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i < isPrime.length; i++) {
            if(isPrime[i]){
                for (int j = i + i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return dfs01(numbers, isPrime, new boolean[numbers.length()], "");
    }

    public int dfs01(String numbers, boolean[] isPrime, boolean[] visited, String curr) {
        int count = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if(visited[i]) continue;
            visited[i] = true;
            String newStr = curr + numbers.charAt(i);
            count += isPrime01(isPrime, newStr);
            count += dfs01(numbers, isPrime, visited, newStr);
            visited[i] = false;
        }
        return count;
    }

    public int isPrime01(boolean[] isPrime, String number){
        int index = Integer.parseInt(number);
        int num = 0;
        if(isPrime[index]){
            num = 1;
            isPrime[index] = false;
        }
        return num;
    }


}
