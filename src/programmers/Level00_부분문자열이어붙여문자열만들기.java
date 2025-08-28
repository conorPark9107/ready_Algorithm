package programmers;

// 부분 문자열 이어 붙여 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181911
public class Level00_부분문자열이어붙여문자열만들기 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][] {{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }

    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            String str = my_strings[i];
            answer.append(str, s, e + 1);
        }

        return answer.toString();
    }

}
