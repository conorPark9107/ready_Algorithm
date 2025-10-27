package programmers;

// 특정한 문자를 대문자로 바꾸기
// https://school.programmers.co.kr/learn/courses/30/lessons/181873
public class Level00_특정한문자를대문자로 {

    public static void main(String[] args) {
        System.out.println(solution("programmers", "p")); // "Programmers"
        System.out.println(solution("lowercase", "x"));  // "lowercase"
        System.out.println(solution("xxxxxaxxxxx", "x"));  // "XXXXXaXXXXX"
    }

    public static String solution(String my_string, String alp) {
        return  my_string.replaceAll(alp, alp.toUpperCase());
    }

}
