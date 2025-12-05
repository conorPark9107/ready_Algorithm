package programmers;

// 구슬을 나누는 경우의 수
// https://school.programmers.co.kr/learn/courses/30/lessons/120840
public class Level00_구슬을나누는경우의수 {

    public static void main(String[] args) {
        System.out.println(solution(3, 2)); // 3
        System.out.println(solution(5, 3)); // 10
    }

    public static int solution(int balls, int share) {
        int x = fact(balls);
        int y = fact(balls - share);
        int z = fact(share);
        return x / (y * z);
    }

    public static int fact(int balls){
        if(balls == 1) return 1;
        return balls * fact(balls - 1);
    }

}
