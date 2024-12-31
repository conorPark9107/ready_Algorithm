package programmers;

import java.util.*;

// 실패율
// https://school.programmers.co.kr/learn/courses/30/lessons/42889
public class Level01_2019kakaoBlind {

    public static void main(String[] args) {
        int[] answer1 = solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3}); // [3,4,2,1,5]
        for (int i : answer1) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        int[] answer2 = solution(4, new int[]{4,4,4,4,4}); // [4,1,2,3]
        for (int i : answer2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

    }

    public static int[] solution(int N, int[] stages) {
        List<Stage> failureRate = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int stage = i;
            double stagePpl = (double) Arrays.stream(stages).filter(value -> value >= stage).count();
            double clearPpl = (double) Arrays.stream(stages).filter(value -> value > stage).count();
            failureRate.add(new Stage(i, clearPpl / stagePpl));
        }

        Collections.sort(failureRate);
        return failureRate.stream().mapToInt(value -> value.stage).toArray();
    }

    public static class Stage implements Comparable<Stage> {
        int stage;
        Double failurRate;

        public Stage(int stage, Double failurRate) {
            this.stage = stage;
            this.failurRate = failurRate;
        }

        @Override
        public int compareTo(Stage o) {
            if(this.failurRate == o.failurRate){
                return this.stage - o.stage;
            }
            return this.failurRate.compareTo(o.failurRate);
        }
    }

}





























