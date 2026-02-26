package programmers;

// 이상한 문자 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12930
public class Level01_이상한문자만들기 {

    public static void main(String[] args) {
        Level01_이상한문자만들기 o = new Level01_이상한문자만들기();
        System.out.println(o.solution("try hello world")); // "TrY HeLlO WoRlD"
    }

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                i = 0;
                answer.append(' ');
                continue;
            }

            if (i % 2 == 0) {
                c = Character.toUpperCase(c);
            } else {
                c = Character.toLowerCase(c);
            }

            i++;
            answer.append(c);
        }

        return answer.toString();
    }
}
