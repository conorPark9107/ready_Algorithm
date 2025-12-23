package programmers;

import java.util.Arrays;
import java.util.stream.IntStream;

// 배열 원소 삭제하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181844
public class Level00_배열원소자르기 {

    public static void main(String[] args) {
        int[] arr = solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // 	[293, 395, 678]
        System.out.println();

        arr = solution(new int[]{110, 66, 439, 785, 1}, new int[]{377, 823, 119, 43});
        Arrays.stream(arr).forEach(value -> System.out.print(value + " ")); // [110, 66, 439, 785, 1]
        System.out.println();
    }

    public  static int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            for (int j = 0; j < delete_list.length; j++) {
                int y = delete_list[j];
                if(x == y) {
                    count++;
                    break;
                }
            }
        }
        int index = 0;
        boolean status = false;
        answer = new int[arr.length - count];
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            for (int j = 0; j < delete_list.length; j++) {
                int y = delete_list[j];
                if(x == y) {
                    status = false;
                    break;
                }else{
                    status = true;
                }
            }
            if (status) {
                answer[index++] = x;
            }

        }


        return answer;
    }

}
