package programmers;

// N보다 커질 때까지 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181884
public class Level00_n보다커질때까지더하기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{34, 5, 71, 29, 100, 34}, 123)); // 139
        System.out.println(solution(new int[]{58, 44, 27, 10, 100}, 139)); // 239
    }

    public static int solution(int[] numbers, int n) {
        int answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
            if(answer > n) break;
        }

        return answer;
    }

}
