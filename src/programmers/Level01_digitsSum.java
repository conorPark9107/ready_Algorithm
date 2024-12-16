package programmers;
import java.util.*;

public class Level01_digitsSum {

    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
        System.out.println(solution(111));
    }

    public static int solution(int n) {
        int answer = 0;

        while(n > 0){
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

}

