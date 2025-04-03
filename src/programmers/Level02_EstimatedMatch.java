package programmers;

// 예상 대진표
// https://school.programmers.co.kr/learn/courses/30/lessons/12985
public class Level02_EstimatedMatch {

    public static void main(String[] args) {
        System.out.println(solution(8, 4, 7)); // 3
        System.out.println(solution(8, 1, 2)); // 1
        System.out.println(solution(4, 1, 3)); // 2
        System.out.println(solution(2, 1, 2)); // 1
        System.out.println(solution(256, 1, 2)); // 1
        System.out.println(solution(1048576, 1, 1048576)); // 20

    }

    public static int solution(int n, int a, int b){
        int answer = 0;

        while(a != b){
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            answer++;
        }

        return answer;
    }

    // 처음에 작성한코드. 시간초과 코드(N log N)
    public static int solution01(int n, int a, int b){
        int answer = 0;
        while(true){
            if((b > n / 2 && a <= n / 2)
            || (b <= n / 2 && a > n / 2))
            {
                answer = (int) (Math.log(n) / Math.log(2));
                break;
            }
            n /= 2;
        }

        return answer;
    }

}
