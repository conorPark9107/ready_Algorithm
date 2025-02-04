package programmers;

import java.util.Arrays;

// 땅따먹기
// https://school.programmers.co.kr/learn/courses/30/lessons/12913
public class Level02_EatTheLand {

    public static void main(String[] args) {
        System.out.println(solution(new int[][] {{1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5},
                {1,2,3,5}})); // 5
        System.out.println(solution(new int[][] {{1,2,3,5},{5,6,7,8},{4,3,2,1}})); // 16

    }

    public static int solution(int[][] land) {
        int answer = 0;

        int[][] score = new int[land.length][4];
        score[0][0] = land[0][0];
        score[0][1] = land[0][1];
        score[0][2] = land[0][2];
        score[0][3] = land[0][3];

        for (int i = 0; i < land.length - 1; i++) {
            for (int x = 0; x < 4; x++) {
                for (int y = 0; y < 4; y++) {
                    if(x != y){
                        int sum = score[i][x] + land[i + 1][y];
                        score[i + 1][y] = Math.max(score[i + 1][y], sum);
                    }
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, score[score.length-1][i]);
        }
        return answer;
    }

}

