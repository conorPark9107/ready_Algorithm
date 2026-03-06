package programmers;

// 체육복
// https://school.programmers.co.kr/learn/courses/30/lessons/42862
public class Level01_체육복 {

    public static void main(String[] args) {
        Level01_체육복 o = new Level01_체육복();
        System.out.println(o.solution(5, new int[]{2, 4}, new int[]{1, 3, 5})); // 5
        System.out.println(o.solution(5, new int[]{2, 4}, new int[]{3})); // 4
        System.out.println(o.solution(3, new int[]{3}, new int[]{1})); // 2
    }


    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] student = new int[n + 1];

        for (int l : lost) student[l]--;
        for (int r : reserve) student[r]++;

        for (int i = 1; i <= n; i++) {
            int curr = student[i];

            if (curr == -1) {
                if (i > 1 && student[i - 1] == 1) {
                    student[i - 1]--;
                    curr++;
                } else if (i < n && student[i + 1] == 1) {
                    student[i + 1]--;
                    curr++;
                }
            }

            if (curr >= 0) answer++;
        }


        return answer;
    }

}
