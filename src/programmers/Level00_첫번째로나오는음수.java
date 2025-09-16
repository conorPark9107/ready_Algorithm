package programmers;

// 첫번쨰로 나오는 음수
// https://school.programmers.co.kr/learn/courses/30/lessons/181896
public class Level00_첫번째로나오는음수 {


    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 46, 38, -2, 15})); // 5
        System.out.println(solution(new int[]{13, 22, 53, 24, 15, 6})); // -1
    }

    public static int solution(int[] num_list) {
        int answer = -1;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] < 0) return i;
        }
        return answer;
    }

}
