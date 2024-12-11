package programmers;

public class Level01_watermelon {

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(4));
    }

    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            answer.append( (i % 2 == 1) ? "수" : "박" );
        }
        return answer.toString();
    }

}
