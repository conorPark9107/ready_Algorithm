package basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 폰켓몬
// https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class Level01_phoneketmon {

    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,1,2,3}));      // 2
        System.out.println(solution(new int[] {3,3,3,2,2,4}));  // 3
        System.out.println(solution(new int[] {3,3,3,2,2,2}));  // 2

    }

    public static int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.stream(nums).forEach(value -> map.put(value, 1));
        return Math.min(map.size(), nums.length / 2);
    }

}
