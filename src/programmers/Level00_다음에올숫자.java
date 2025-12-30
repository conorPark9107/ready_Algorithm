package programmers;

// 다음에올 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/120924
public class Level00_다음에올숫자 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4})); // 5
        System.out.println(solution(new int[]{2, 4, 8})); // 16
    }

    public static int solution(int[] common) {
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1]) {
            answer = common[common.length - 1 ] + (common[1] - common[0]);
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }

    public static int solution01(int[] common) {
        int answer = 0;
        if (common[1] - common[0] == common[2] - common[1]) { // 등차
            answer = common[common.length - 1 ] + (common[1] - common[0]);
        } else if (common[1] / common[0] == common[2] / common[1]) { // 등비
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        return answer;
    }

}
