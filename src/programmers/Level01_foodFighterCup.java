package programmers;


// 푸드 파이트 대회
// https://school.programmers.co.kr/learn/courses/30/lessons/134240
public class Level01_foodFighterCup {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 4, 6})); // 1223330333221
        System.out.println(solution(new int[]{1, 7, 1, 2})); // 111303111
    }

    // 이런식으로도 풀 수 있구나.
    public String NotMyCode(int[] food) {
        String answer = "0";

        for (int i = food.length - 1; i > 0; i--) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer = i + answer + i;
            }
        }

        return answer;
    }

    private static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int x = food[i];
            sb.append(String.valueOf(i).repeat(x / 2));
        }
        String temp = sb.reverse().toString();
        sb.reverse().append("0");
        sb.append(temp);

        return sb.toString();
    }

    private static String solution02(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            int x = food[i];
            sb.append(String.valueOf(i).repeat(x / 2));
        }
        sb.append("0");
        for (int i = food.length - 1; i >= 0; i--) {
            int x = food[i];
            sb.append(String.valueOf(i).repeat(x / 2));
        }
        return sb.toString();
    }
}
