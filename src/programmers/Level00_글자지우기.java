package programmers;

// 글자 지우기
// https://school.programmers.co.kr/learn/courses/30/lessons/181900
public class Level00_글자지우기 {

    public static void main(String[] args) {
        System.out.println(solution("apporoograpemmemprs", new int[]{1, 16, 6, 15, 0, 10, 11, 3}));
        // aporoograpemmemprs
    }

    public static String solution(String my_string, int[] indices) {
        StringBuilder answer = new StringBuilder(my_string);
        for (int i : indices) {
            answer.replace(i, i + 1, "0");
        }
        return answer.toString().replaceAll("0", "");
    }
}
