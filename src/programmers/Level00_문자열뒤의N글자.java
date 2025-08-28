package programmers;

// 문자열의 뒤의 n글자
// https://school.programmers.co.kr/learn/courses/30/lessons/181910
public class Level00_문자열뒤의N글자 {

    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11)); // grammerS123
        System.out.println(solution("He110W0r1d", 5)); // W0r1d
    }

    public static String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }

}
