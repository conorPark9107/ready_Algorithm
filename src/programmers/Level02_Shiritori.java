package programmers;

import java.util.HashSet;
import java.util.Map;

// 끝말 잇기
// https://school.programmers.co.kr/learn/courses/30/lessons/12981
public class Level02_Shiritori {

    public static void main(String[] args) {
        int[] answer = solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        for(int i : answer){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        int[] answer2 = solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        for(int i : answer2){
            System.out.print(i + " ");
        }
        System.out.println("\n");

        int[] answer3 = solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        for(int i : answer3){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    public static int[] solution(int n, String[] words) {
        HashSet<String> set = new HashSet<>();

        int person = 0;
        int times = 0;

        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            String prev = words[i-1];
            String now = words[i];

            if(prev.charAt(prev.length() - 1) == now.charAt(0) && !set.contains(now)){
                set.add(now);
            }else{
                person = i % n + 1;
                times = i / n + 1;
                break;
            }
        }

        return new int[]{person, times};
    }

}


























