package programmers;


import java.util.HashMap;

// 문자열 나누기 (문제에 대한 설명이 중의적인 표현이 있음.)
// https://school.programmers.co.kr/learn/courses/30/lessons/140108
public class Level01_StringSplit {

    public static void main(String[] args) {
//        System.out.println(solution("banana"));
//        System.out.println(solution("abracadabra"));
//        System.out.println(solution("aaabbaccccabba"));
//        System.out.println(solution("aabbaba")); // 3
//        System.out.println(solution("aabbabab")); // 3
//        System.out.println(solution("abaabab")); // 2
//        System.out.println(solution("aabb")); // 1
//        System.out.println(solution("baaaabbbb")); // 3
    }

    public static int solution(String s) {
        int answer = 0;
        int xCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            xCount++;

            int count = 0;
            for (int j = 1; j < s.length(); j++) {
                if(x == s.charAt(j)){
                    xCount++;
                }else{
                    count++;
                }
                if(xCount == count){
                    answer++;
                    s = s.substring(j + 1);
                    xCount = 0;
                    i = -1;
                    break;
                }
            }

        }
        return (!s.isEmpty())? answer + 1 : answer;
    }

    public static int badCode(String s ){
        int answer = 0;
        int xCount = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            xCount++;

            for (int j = 1; j < s.length(); j++) {
                if(x == s.charAt(j)){
                    xCount++;
                }else{
                    count++;
                }
                if(xCount == count){
                    answer++;
                    s = s.substring(j + 1);
                    count = 0;
                    xCount = 0;
                    i = -1;
                    break;
                }
            }

        }
        return (!s.isEmpty())? answer + 1 : answer;
    }

    public static int didntUnderstandProblem(String s){
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            map.put(x, map.getOrDefault(x, 0) + 1);

            if (map.size() >= 2) {
                int num = map.get(x);
                int count = 0;
                for (int k : map.values()) {
                    if(k == num){
                        count++;
                    }
                    if(count == 2){
                        answer++;
                        map.clear();
                        break;
                    }
                }
            }
        }

        return ( !map.isEmpty() ) ? answer + 1 : answer;
    }



}
