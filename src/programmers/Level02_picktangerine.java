package programmers;


import java.util.Arrays;

// 귤 고르기
// https://school.programmers.co.kr/learn/courses/30/lessons/138476
public class Level02_picktangerine {

    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3})); // 3
        System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3})); // 2
        System.out.println(solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3})); // 1
    }

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        int[] count = new int[10000001];
        
        for(int i : tangerine){
            count[i]++;
        }
        int[] array = Arrays.stream(count).filter(value -> value > 0).sorted().toArray();

        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] >= k){
                answer++;
                break;
            }else{
                k -= array[i];
                answer++;
            }
        }

        return answer;
    }


}
