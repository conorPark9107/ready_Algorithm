package programmers;

import java.util.Arrays;

// 김서방 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class Level01_FindKim {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane", "Kim"}));
    }

    public static String solution(String[] seoul) {
        StringBuilder answer = new StringBuilder("김서방은 ");
        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) answer.append(i);
        }
        answer.append("에 있다");
        return answer.toString();
    }
}
