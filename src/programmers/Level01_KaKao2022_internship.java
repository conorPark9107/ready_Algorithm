package programmers;

import java.util.HashMap;

import java.util.Map;

// 성격 유형 검사하기
// https://school.programmers.co.kr/learn/courses/30/lessons/118666
public class Level01_KaKao2022_internship {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"AN", "CF", "MJ", "RT", "NA"}, new int[]{5, 3, 2, 7, 5})); // TCMA
        System.out.println(solution(new String[]{"TR", "RT", "TR"}, new int[]{7, 1, 3})); // RCJA
    }

    public static String solution(String[] survey, int[] choices) {
        String answer = "";

        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        int[] score = {0, 3, 2, 1, 0, 1, 2, 3};

        // 첫번째 글자 = 모르겠음 기준 왼쪽(비동의)
        // 두번째 글자 = 모르겠음 기준 오른쪽(동의)
        for (int i = 0; i < survey.length; i++) {
            int choice = choices[i];
            char left = survey[i].charAt(0);
            char right = survey[i].charAt(1);

            if(choice > 4){ // 동의(오른쪽)
                map.put(right, map.get(right) + score[choice]);
            }else if(choice < 4){ // 비동의(왼쪽)
                map.put(left, map.get(left) + score[choice]);
            }
        }

        answer += getType(map, 'R', 'T');
        answer += getType(map, 'C', 'F');
        answer += getType(map, 'J', 'M');
        answer += getType(map, 'A', 'N');

        return answer;
    }

    private static String getType(Map<Character, Integer> map, char a, char b) {
        char returnValue = a;
        if(map.get(b) > map.get(a)){
            returnValue = b;
        }
        return String.valueOf(returnValue);
    }

}
