package programmers;

// 특별한 이차원 배열 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181831
public class Level00_특별한이차원배열2 {

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{5, 192, 33}, {192, 72, 95}, {33, 95, 999}})); // 1
        System.out.println(solution(new int[][]{{19, 498, 258, 587}, {63, 93, 7, 754}, {258, 7, 1000, 723}, {587, 754, 723, 81}})); // 0
    }

    public static int solution(int[][] arr) {
        int answer = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return answer;
    }

}
