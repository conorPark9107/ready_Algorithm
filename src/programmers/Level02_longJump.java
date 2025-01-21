package programmers;


// 멀리뛰기
// https://school.programmers.co.kr/learn/courses/30/lessons/12914
public class Level02_longJump {

    public static void main(String[] args) {
        System.out.println(solution(4)); // 5
        System.out.println(solution(3)); // 3
        System.out.println(solution(1)); // 1
    }

    public static long solution(int n) {
        int[] arr = new int[n + 2];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }
        return arr[n];
    }
}
