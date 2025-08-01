package programmers;

// 이어붙인수
// https://school.programmers.co.kr/learn/courses/30/lessons/181928
public class Level00_이어붙인수 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,4,5,2,1})); // 393
        System.out.println(solution(new int[]{5,7,8,3})); // 581
    }

    public static int solution(int[] num_list) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();

        for (int x : num_list) {
            if (x % 2 == 0) { // 짝수
                a.append(x);
            } else { // 홀수
                b.append(x);
            }
        }
        return Integer.parseInt(a.toString()) + Integer.parseInt(b.toString());
    }

}
