package programmers;

// 문자열 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/181905
public class Level00_문자열뒤집기 {

    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3", 6, 12)); // ProgrammerS123
        System.out.println(solution("Stanley1yelnatS", 4, 10)); // Stanley1yelnatS
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder(my_string);
        sb = sb.replace(s, e + 1, new StringBuilder(sb.substring(s, e + 1))
                                     .reverse()
                                     .toString());
        return sb.toString();
    }

}
