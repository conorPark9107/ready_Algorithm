package programmers;

import java.util.LinkedList;
import java.util.Queue;

// https://school.programmers.co.kr/learn/courses/30/lessons/388351
public class Level01_WorkSystem {

    public static void main(String[] args) {
        System.out.println(solution(
                new int[]{700, 800, 1100, 955},
                new int[][]{
                        {710, 2359, 1050, 700, 650, 631, 659},
                        {800, 801, 805, 800, 759, 810, 809},
                        {1105, 1001, 1002, 600, 1059, 1001, 1100},
                        {1105, 1001, 1002, 600, 1059, 1001, 1100}},
                5
                )
        ); // result : 3

        System.out.println(solution(
                        new int[]{730, 855, 700, 720},
                        new int[][]{{710, 700, 650, 735, 700, 931, 912}, {908, 901, 805, 815, 800, 831, 835}, {705, 701, 702, 705, 710, 710, 711}, {707, 731, 859, 913, 934, 931, 905}},
                        1
                )
        ); // result : 2
    }

    public static int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;

        Queue<Integer> days = new LinkedList<>();
        for(int i = 0; i < 7; i++){
            if(startday + i <= 7){
                days.offer(startday + i);
            }else{
                days.offer((startday + i) - 7);
            }
        }

        for (int i = 0; i < schedules.length; i++) {
            int schedule = schedules[i] + 10;
            if(schedule % 100 >= 60){
                schedule = ((100 * (schedule / 100)) + 100) + ((schedule % 100) % 60);
            }

            boolean isLate = false;
            for (int j = 0; j < 7; j++) {
                int day = days.poll();
                days.offer(day);
                if(day == 6 || day == 7){ // 토, 일
                    System.out.println(timelogs[i][j]);
                    continue;
                }

                if(timelogs[i][j] > schedule){ // 늦은 경우.
                    isLate = true;
                }
            }
            if(!isLate){
                answer++;
            }
        }


        return answer;
    }

}
