package programmers;

import java.util.Arrays;

// 산책
// https://school.programmers.co.kr/learn/courses/30/lessons/250129
public class Level00_PCCE_산책 {

    public static void main(String[] args) {
        Arrays.stream(solution("NSSNEWWN")).forEach(System.out::print); //  [-1, 1]
        System.out.println();
        Arrays.stream(solution("EESEEWNWSNWWNS")).forEach(System.out::print); // [0, 0]
    }

    public static int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int [2];
        for(int i=0; i<route.length(); i++){
            switch(route.charAt(i)){
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }
}
