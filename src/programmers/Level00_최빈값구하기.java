package programmers;

import java.util.Arrays;
import java.util.Comparator;

// 최빈값 구하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120812
public class Level00_최빈값구하기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,3,3,4})); // 3
        System.out.println(solution(new int[]{1, 1, 2, 2})); // -1
        System.out.println(solution(new int[]{1})); // 1
        System.out.println(solution(new int[]{0,0,0,0,0})); // 0
        System.out.println(solution(new int[]{})); // -1
    }

    public static int solution(int[] array) {
        int[] count = new int[1001];
        for (int n : array) {
            count[n]++;
        }

        int maxIndex = -1;
        int maxCount = -1;
        int maxNum = 0;
        for (int i = 0; i < count.length; i++) {
            int c = count[i];
            if(c > maxCount){
                maxIndex = i;
                maxCount = c;
                maxNum = 1;
            }else if(c == maxCount){
                maxNum++;
            }
        }
        return maxNum >= 2 ? -1 : maxIndex;
    }

    public static int solution02(int[] array) {
        int[] count = new int[1001];
        for (int n : array) {
            count[n]++;
        }
        Arrays.sort(count);
        int l = count.length - 1;
        return count[l] == count[l-1] ? -1 : count[l];
    }


}
