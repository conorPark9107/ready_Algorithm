package programmers;

// 홀짝에 따라 다른 값 리턴하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181935
public class Level00_다른값리턴하기 {

    public static void main(String[] args) {
        System.out.println(solution(7));  // 16
        System.out.println(solution(10)); // 220
    }

    public static int solution(int n) {
        int answer = 0;
        if(n % 2 == 0)
            for(int i = 2; i <= n; i += 2) answer += i * i;
        else{
            int x = (n + 1) / 2;
            answer = x * x;

        }
        return answer;
    }

}
