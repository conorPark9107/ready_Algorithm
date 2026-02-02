package programmers;

// 모음사전
// https://school.programmers.co.kr/learn/courses/30/lessons/84512
public class Level02_모음사전 {

    public static void main(String[] args) {
        Level02_모음사전 o = new Level02_모음사전();
        System.out.println(o.solution("AAAAE")); // 6
        System.out.println(o.solution("AAAE")); // 10
        System.out.println(o.solution("I")); // 1563
        System.out.println(o.solution("EIO")); // 1189
    }

    int answer = 0;
    boolean isEnd = false;
    public int solution(String word) {
        answer = 0;
        isEnd = false;
        char[] dict = {'A', 'E', 'I', 'O', 'U'};
        dfs("", word, dict);
        return answer;
    }

    private void dfs(String curr, String word, char[] dict) {
        for (int i = 0; i < dict.length; i++) {
            String newWord = curr + dict[i];
            answer++;
            if(newWord.equals(word)) {
                isEnd = true;
                return;
            }
            if (newWord.length() < dict.length) {
                dfs(newWord, word, dict);
            }
            if(isEnd) return;
        }
    }

}
