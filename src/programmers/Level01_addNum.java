package programmers;

import java.util.Arrays;

public class Level01_addNum {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));
        System.out.println(solution(new int[]{5,8,4,0,6,7,9}));
    }

    public static int solution(int[] numbers) {
        return 45 - Arrays.stream(numbers).sum();
    }

}
