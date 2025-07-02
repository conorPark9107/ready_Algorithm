package programmers;

public class Level00_changeLowerCase {

    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("aaa"));
    }

    public static String solution(String myString) {
        return myString.toLowerCase();
    }

}
