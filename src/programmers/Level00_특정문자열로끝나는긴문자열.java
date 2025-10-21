package programmers;

// 특정 문자열로 끝나는 가장 긴 부분의 문자열 찾기
public class Level00_특정문자열로끝나는긴문자열 {

    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE")); // AbCdE
        System.out.println(solution("AAAAaaaa", "a")); // AAAAaaaa
    }

    public static String solution(String myString, String pat) {
        int end = myString.lastIndexOf(pat) + pat.length();
        return myString.substring(0, end);
    }

}
