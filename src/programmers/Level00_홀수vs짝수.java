package programmers;


// 홀수 vs 짝수
// https://school.programmers.co.kr/learn/courses/30/lessons/181887
public class Level00_홀수vs짝수 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,2,6,1,7,6}));    // 17
        System.out.println(solution(new int[]{-1, 2, 5, 6, 3})); // 8
    }

    public static int solution(int[] num_list) {
        int even = 0, odd = 0;
        for (int i = 1; i <= num_list.length; i++) {
            if (i % 2 == 0) {
                even += num_list[i-1];
            }else{
                odd += num_list[i-1];
            }
        }

        return Math.max(even, odd);
    }

}
