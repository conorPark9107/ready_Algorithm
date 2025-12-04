package programmers;

// rny_string
//
public class Level00_rny_string {

    public static void main(String[] args) {
        System.out.println(solution("masterpiece")); // masterpiece
        System.out.println(solution("programmers")); // prograrnrners
        System.out.println(solution("jerry")); // jerry
        System.out.println(solution("burn")); // burn
        System.out.println(solution("msrm")); // rnsrrn
    }

    public static String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }

}