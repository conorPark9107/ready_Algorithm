package programmers;

import java.util.Arrays;

// 심폐소생술
// https://school.programmers.co.kr/learn/courses/30/lessons/340203
public class Level00_PCCE_CPR {

    public static void main(String[] args) {
        Arrays.stream(solution(new String[]{"call", "respiration", "repeat", "check", "pressure"})).forEach(System.out::println);
    }


    public static int[] solution(String[] cpr) {
        int[] answer = {0, 0, 0, 0, 0};
        String[] basic_order = {"check", "call", "pressure", "respiration", "repeat"};

        for(int i=0; i< cpr.length; i++){
            for(int j=0; j< basic_order.length; j++){
                if(cpr[i].equals(basic_order[j])){
                    answer[i] =  j+1;
                    break;
                }
            }
        }
        return answer;
    }
}
