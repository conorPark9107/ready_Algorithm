package programmers;

public class Level00_0떼기 {

    public static void main(String[] args) {
        System.out.println(solution("0010")); // 10
        System.out.println(solution("854020")); // 854020
        System.out.println(solution("00000001200")); // 12
        System.out.println(solution("01")); // 1
        System.out.println(solution("10")); // 10
    }

    public static String solution(String n_str) {
        return n_str.replaceAll("^(0)+", "");
    }

}
