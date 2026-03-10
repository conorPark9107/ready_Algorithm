package programmers;

import java.util.ArrayDeque;

// 단어 변환
//
public class Level03_단어변환02 {

    public static void main(String[] args) {
        Level03_단어변환02 o = new Level03_단어변환02();
        System.out.println(o.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"})); // 4
        System.out.println(o.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"})); // 0
        System.out.println(o.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"})); // 4
    }

    public int solution(String begin, String target, String[] words) {
        ArrayDeque<String> q = new ArrayDeque<>();
        boolean[] visited = new boolean[words.length];
        q.offer(begin);
        int cnt = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                String a = q.poll();
                for (int j = 0; j < words.length; j++) {
                    String b = words[j];
                    if (!visited[j] && isDiff(a, b)) {
                        if (b.equals(target)) return cnt + 1;
                        q.offer(b);
                        visited[j] = true;
                    }
                }
            }
            cnt++;
        }
        return 0;
    }

    public boolean isDiff(String a, String b) {
        int diffCnt = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffCnt++;
            }
        }
        return diffCnt == 1;
    }
}


