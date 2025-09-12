package programmers;

// 가까운 1 찾기
// https://school.programmers.co.kr/learn/courses/30/lessons/181898
public class Level00_가까운1찾기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0, 0, 1}, 1)); // 3
        System.out.println(solution(new int[]{1, 0, 0, 1, 0, 0}, 4)); // -1
        System.out.println(solution(new int[]{1, 1, 1, 1, 0}, 3)); // 3
    }

    public static int solution(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if(arr[i] == 1) return i;
        }
        return answer;
    }

}
