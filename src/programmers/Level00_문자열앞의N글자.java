package programmers;

// 문자열 앞의 n글자
// https://school.programmers.co.kr/learn/courses/30/lessons/181907
public class Level00_문자열앞의N글자 {

    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
        System.out.println(solution("He110W0r1d", 5));
    }

    public static String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }


}
