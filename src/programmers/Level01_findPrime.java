package programmers;

public class Level01_findPrime {

    public static void main(String[] args) {
        System.out.println("answer : "  + solution(10)); // 4
        System.out.println("answer : "  + solution(5));  // 3
    }

    public static int solution(int n) {
        int answer = 0;

        boolean[] isNotPrime = new boolean[n + 1];
        isNotPrime[0] = true;
        isNotPrime[1] = true;

        for (int i = 2; i <= n; i++) {
            for(int j = i + i; j <= n; j += i){
                if(!isNotPrime[j]) isNotPrime[j] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            if(!isNotPrime[i]) {
                answer++;
            }
        }

        return answer;
    }

}
