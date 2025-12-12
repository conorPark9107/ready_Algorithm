package programmers;

// 대문자와 소문자
// https://school.programmers.co.kr/learn/courses/30/lessons/120893
public class Level00_대문자와소문자 {

    public static void main(String[] args) {
        System.out.println(solution("cccCCC")); // "CCCccc"
        System.out.println(solution("abCdEfghIJ")); // "ABcDeFGHij"
    }

    public static String solution(String my_string) {
        String answer = "";

        for (char c : my_string.toCharArray()) {
            answer += Character.isLowerCase(c)
                    ? Character.toUpperCase(c)
                    : Character.toLowerCase(c);
        }

        return answer;
    }
}
