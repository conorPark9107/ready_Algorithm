package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

// 전국대회 선발고사
// https://school.programmers.co.kr/learn/courses/30/lessons/181851
public class Level00_전국대회선발고사 {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{3, 7, 2, 5, 4, 6, 1}, new boolean[]{false, true, true, true, true, false, false})); // 20403
        System.out.println(solution(new int[]{1, 2, 3}, new boolean[]{true, true, true})); // 102
        System.out.println(solution(new int[]{6, 1, 5, 2, 3, 4}, new boolean[]{true, false, true, false, false, true})); // 50200

    }

    public static int solution(int[] rank, boolean[] attendance) {
        int[] filtered = IntStream.range(0, rank.length)
                                  .filter(i -> attendance[i])
                                  .map(i -> rank[i])
                                  .sorted()
                                  .toArray();

        int[] finalRank = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < rank.length; j++) {
                if(filtered[i] == rank[j]){
                    finalRank[i] = j;
                    break;
                }
            }
        }

        return (10000 * finalRank[0]) + (100 * finalRank[1]) + finalRank[2];
    }

}
