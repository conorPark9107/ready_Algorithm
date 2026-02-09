package programmers;

import java.util.ArrayDeque;
import java.util.Arrays;

// 단어 변환
// https://school.programmers.co.kr/learn/courses/30/lessons/43163
public class Level03_단어변환 {

    /*
        1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
        2. words에 있는 단어로만 변환할 수 있습니다.
        예를 들어 begin이 "hit", target가 "cog", words가 ["hot","dot","dog","lot","log","cog"]라면
        "hit" -> "hot" -> "dot" -> "dog" -> "cog"와 같이 4단계를 거쳐 변환할 수 있습니다.
        최소 몇 단계의 과정을 거쳐 begin을 target으로 변환할 수 있는지 return
    */

    public static void main(String[] args) {
        Level03_단어변환 o = new Level03_단어변환();
        System.out.println(o.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"})); // 4
        System.out.println(o.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"})); // 0
    }


    public int solution(String begin, String target, String[] words) {
        if (!Arrays.asList(words).contains(target)) return 0;
        int answer = 0;

        boolean[] visited = new boolean[words.length];
        ArrayDeque<String> q = new ArrayDeque<>();
        q.offer(begin);

        while (!q.isEmpty()) {
            int length = q.size();

            for (int i = 0; i < length; i++) {
                String poll = q.poll();
                if(poll.equals(target)) return answer;

                for (int j = 0; j < words.length; j++) {
                    if(visited[j]) continue;

                    String word = words[j];
                    if(canOffer(poll, word)){
                        visited[j] = true;
                        q.offer(word);
                    }
                }
            }
            answer++;
        }
        return answer;
    }

    public boolean canOffer(String poll, String word){
        int count = 0;
        for (int x1 = 0; x1 < word.length(); x1++) {
            if(poll.charAt(x1) != word.charAt(x1)) {
                count++;
            }
        }
        return count == 1;
    }

    // 틀린 코드.
    public int solution02(String begin, String target, String[] words) {
        int answer = 1;

        boolean[] visited = new boolean[words.length];
        ArrayDeque<String> q = new ArrayDeque<>();
        q.offer(begin);

        while (!q.isEmpty()) {
            String poll = q.poll();
            if(poll.equals(target)) break;

            for (int i = 0; i < words.length; i++) {
                if (visited[i]) continue;

                String word = words[i];
                int count = 0;

                for (int j = 0; j < word.length(); j++) {
                    if (poll.charAt(j) != word.charAt(j)) {
                        count++;
                    }
                }

                if(count == 1){
                    q.offer(word);
                    visited[i] = true;
                }
            }
            answer++;
        }
        return answer;
    }

}
