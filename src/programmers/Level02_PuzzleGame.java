package programmers;

// [PCCP 기출문제] 2번 / 퍼즐 게임 챌린지
// https://school.programmers.co.kr/learn/courses/30/lessons/340212
public class Level02_PuzzleGame {

    public static void main(String[] args) {

//        int answer01 = solution(new int[]{1, 5, 3}, new int[]{2, 4, 7}, 30L);
//        System.out.println(answer01); // 3
//
//        int answer02 = solution(new int[]{1, 4, 4, 2}, new int[]{6, 3, 8, 2}, 59L);
//        System.out.println(answer02); // 2
//
//        int answer03 = solution(new int[]{1, 328, 467, 209, 54}, new int[]{2, 7, 1, 4, 3}, 1723L);
//        System.out.println(answer03); // 294

        int answer04 = solution(new int[]{1, 99999, 100000, 99995}, new int[]{9999, 9001, 9999, 9001}, 3456789012L);
        System.out.println(answer04); // 39354

    }

    public static int solution(int[] diffs, int[] times, long limit) {
        int max = 0;
        for (int i = 0; i < diffs.length; i++) {
            max = Math.max(max, diffs[i]);
        }

        int left = 1;
        int right = max;
        while (left < right) {
            int mid = (left + right) / 2;

            if (isOverLimit(diffs, times, mid, limit)) {
                left = mid + 1;
            }else{
                right = mid;
            }

        }

        return left;
    }

    private static boolean isOverLimit(int[] diffs, int[] times, int mid, long limit) {
        long totalCost = 0;
        int diff = 0, time_cur = 0, time_prev = 0;

        for (int i = 0; i < diffs.length; i++) {
            diff = diffs[i]; // 현재 난이도
            time_cur = times[i]; // 소요 시간

            if (diff <= mid) {
                totalCost += time_cur;
            }else {
                int avgCount = diff - mid;
                int oneFailCost = time_cur + time_prev;
                totalCost += ((long)oneFailCost * avgCount) + time_cur;
            }

            time_prev = time_cur; // 이전 퍼즐 소요 시간
        }

        return limit < totalCost;
    }

}


//for (int level = max; level >= 1; level--) {
//        long totalCost = 0;
//
//        for (int i = 0; i < diffs.length; i++) {
//        diff = diffs[i]; // 현재 난이도
//        time_cur = times[i]; // 소요 시간
//
//        if (diff <= level) {
//        totalCost += time_cur;
//        }else {
//        int avgCount = diff - level;
//        int oneFailCost = time_cur + time_prev;
//        totalCost += ((long)oneFailCost * avgCount) + time_cur;
//        }
//
//        time_prev = time_cur; // 이전 퍼즐 소요 시간
//        }
//
////            System.out.print("level : " + level + " totalCost : " + totalCost + "\n");
////            System.out.println("---------------------");
//
//        if (totalCost <= limit) {
//        answer = Math.min(answer, level);
//        }
//        }
