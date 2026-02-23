package programmers;

import java.util.HashMap;

// 숫자 문자열과 영단어
// https://school.programmers.co.kr/learn/courses/30/lessons/81301
public class Level01_숫자_문자열과_영단어 {

    public static void main(String[] args) {
        Level01_숫자_문자열과_영단어 o = new Level01_숫자_문자열과_영단어();
        System.out.println(o.solution("one4seveneight")); // 1478
        System.out.println(o.solution("23four5six7")); // 234567
        System.out.println(o.solution("2three45sixseven")); // 234567
        System.out.println(o.solution("123")); // 123
    }

    public int solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        for (String key : map.keySet()) {
            s = s.replace(key, String.valueOf(map.get(key)));
        }

        return Integer.parseInt(s);
    }

}
