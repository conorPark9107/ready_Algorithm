package programmers;

// 날짜비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181838
public class Level00_날짜비교 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 29})); // 1
        System.out.println(solution(new int[]{2021, 12, 28}, new int[]{2021, 12, 28})); // 0
        System.out.println(solution(new int[]{0, 11, 25}, new int[]{0, 11, 24})); // 0
        System.out.println(solution(new int[]{10000, 11, 25}, new int[]{10000, 11, 24})); // 0
        System.out.println(solution(new int[]{10000, 12, 15}, new int[]{0, 12, 17})); // 0
    }

    public static int solution(int[] date1, int[] date2) {
        if(date1[0] < date2[0]){
            return 1;
        }else if(date1[0] > date2[0]){
            return 0;
        }
        if(date1[1] < date2[1]){
            return 1;
        }else if(date1[1] > date2[1]){
            return 0;
        }
        if(date1[2] < date2[2]) {
            return 1;
        }

        return 0;
    }

}

