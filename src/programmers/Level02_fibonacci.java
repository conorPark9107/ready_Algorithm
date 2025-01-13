package programmers;

// 피보나치 수
// https://school.programmers.co.kr/learn/courses/30/lessons/12945
public class Level02_fibonacci {

    public static void main(String[] args) {
        System.out.println(solution(100000)); // 2
//        System.out.println(solution(5)); // 5
    }


    public static int solution(int n) {
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 1234567;
        }
        return Long.valueOf(arr[n]).intValue();
    }

    // 값이 클 경우 overflow 발생.
    public static int solution01(int n) {
        return fibonacci(n) % 1234567;
    }


    public static int fibonacci(int n){
        if(n == 1 || n == 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

}
