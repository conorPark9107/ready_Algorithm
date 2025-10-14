package programmers;

// 1로 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/181880
public class Level00_1로만들기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 1, 14})); // 11
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        for (int n : num_list) {
            while(n > 1){
                if(n % 2 == 0) n = n / 2;
                else n = (n - 1) / 2;
                answer++;
            }
        }
        return answer;
    }

}
