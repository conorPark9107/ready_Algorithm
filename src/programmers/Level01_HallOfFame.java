package programmers;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

// 명에의 전당
// https://school.programmers.co.kr/learn/courses/30/lessons/138477
public class Level01_HallOfFame {

    public static void main(String[] args) {
//        int[] answer = solution(3, new int[]{10, 100, 20, 150, 1, 100, 200});
//        for (int i : answer) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

//        int[] answer = solution(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
//        for (int i : answer) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

        int[] answer = betterthanMyCode(4, new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000});
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if(list.size() < k){
                list.add(score[i]);
            }else{
                if(score[i] > list.get(0)){
                    list.remove(0);
                    list.add(score[i]);
                }
            }
            Collections.sort(list);
            answer[i] = list.get(0);
        }
        return answer;
    }

    public static int[] betterthanMyCode(int k, int[] score){
        int[] answer = new int[score.length];

        // 값을 poll 또는 peek 메서드 등 값을 뽑으면, 가장 작은 값 부터 리턴 한다.
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            queue.add(score[i]);
            if(queue.size() > k){
                queue.poll();
            }
            answer[i] = queue.peek(); // 가장 작은 값.
        }
        return answer;
    }

}
