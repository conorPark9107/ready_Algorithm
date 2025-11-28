package programmers;

// 7의 개수
// https://school.programmers.co.kr/learn/courses/30/lessons/120912
public class Level00_7의개수 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{7, 77, 17})); // 4
        System.out.println(solution(new int[]{10, 29})); // 0
    }

    public static int solution(int[] array) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            String s = String.valueOf(array[i]);
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '7') answer++;
            }
        }
        return answer;
    }

}
