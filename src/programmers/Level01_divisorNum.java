package programmers;


// 약수의 개수와 덧셈
// https://school.programmers.co.kr/learn/courses/30/lessons/77884
public class Level01_divisorNum {

    public static void main(String[] args) {
        System.out.println(solution(13, 17)); // 43
        System.out.println(solution(24, 27)); // 52
    }

    public static int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;

            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0) count += 2;
            }
            if(Math.sqrt(i) % 1 == 0.0) count++;

            answer = (count % 2 == 0)? answer + i : answer - i;
        }

        return answer;
    }
}
