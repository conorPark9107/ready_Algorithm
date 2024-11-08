package programmers;

// 가장 가까운 글자
// https://school.programmers.co.kr/learn/courses/30/lessons/142086
public class Level01_nearestLetter {

    public static void main(String[] args) {
        int[] answer = solution("banana");
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();

        answer = solution("foobar");
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            String letter = String.valueOf(s.charAt(i));
            String substring = s.substring(0, i);

            if(substring.contains(letter)){
                answer[i] = i - substring.lastIndexOf(letter);
            }else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}
