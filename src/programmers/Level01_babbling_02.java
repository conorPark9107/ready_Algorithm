package programmers;

import java.util.*;

// 옹알이(2)
// https://school.programmers.co.kr/learn/courses/30/lessons/133499
public class Level01_babbling_02 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"aya", "yee", "u", "maa"})); // 1
        System.out.println(solution(new String[]{"yewooye"})); // 1
        System.out.println(solution(new String[]{"ayamaaya"}));// 1
        System.out.println(solution(new String[]{"ayaye", "ayawoomaye", "yeyeyeyeye", "yemawoo", "ayaayaa"})); // 3
        System.out.println(solution(new String[]{"yayae"})); // 0
        System.out.println(solution(new String[]{"yeyema"})); // 0
        System.out.println(solution(new String[]{"yeye", "yeye"})); // 0
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        String[] arr = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            String s = babbling[i];

            String now = "";
            String before = "";
            for(int j = 0; j < s.length(); j++){
                now += s.charAt(j);

                for (int x = 0; x < arr.length; x++) {
                    String xs = arr[x];
                    if(!before.equals(xs) && now.equals(xs)){
                        before = xs;
                        now = "";
                        break;
                    }
                }
            }

            if(now.equals("")) answer++;
        }
        return answer;
    }

    public static int MyBadCode_03(String[] babbling){
        int answer = 0;

        String[] arr = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            String s = babbling[i];

            Queue<String> queue = new LinkedList<>(Arrays.asList(arr));
            for (int j = 0; j < queue.size(); j++) {
                String poll = queue.poll();
                if(s.contains(poll)){
                    s = s.replaceFirst(poll, "0");
                    j = 0;
                }
                queue.offer(poll);
            }

            if(s.replace("0", "").length() == 0) answer++;

        }
        return answer;
    }

    public static int MyBadCode_02(String[] babbling){
        int answer = 0;

        String[] arr = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            String s = babbling[i];

            Queue<String> queue = new LinkedList<>(Arrays.asList(arr));

            for (int j = 0; j < queue.size(); j++) {
                if(s.contains(queue.peek())){
                    s = s.replaceFirst(queue.peek(), "");
                    j = 1;
                }
                queue.offer(queue.poll());
            }

            if(s.length() == 0) answer++;
        }
        return answer;
    }

    public static int myBadCode(String[] babbling){
        int answer = 0;

        String[] arr = { "aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            String s = babbling[i];

            ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
            for (int j = 0; j < list.size(); j++) {
                if(s.contains(list.get(j))){
                    s = s.replace(list.get(j), "");
                    list.remove(j);
                    j = 0;
                }
            }
            if(s.length() == 0) answer++;
        }
        return answer;
    }

}
