package programmers;

// 피자 나눠먹기 2
// https://school.programmers.co.kr/learn/courses/30/lessons/120815
public class Level00_피자나눠먹기2 {

    public static void main(String[] args) {
        System.out.println(solution(6));   // 1
        System.out.println(solution(10));  // 5
        System.out.println(solution(4));   // 2
    }

    public static int solution(int n) {
        int pizza = 1;
        int slices = 6;
        while ((pizza * slices) % n != 0) {
            pizza++;
        }
        return pizza;
    }

}
