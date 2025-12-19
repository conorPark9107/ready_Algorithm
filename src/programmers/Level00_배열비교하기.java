package programmers;

// 배열 비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181856
public class Level00_배열비교하기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{49, 13}, new int[]{70, 11, 2})); // -1
        System.out.println(solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36})); // 1
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3})); // 0
    }

    public static int solution(int[] arr1, int[] arr2) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        if (l1 == l2) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < l1; i++) {
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            return whichOne(sum1, sum2);
        }else {
            return whichOne(l1, l2);
        }
    }

    public static int whichOne(int a, int b){
        if(a > b) return 1;
        else if(b > a) return -1;
        else return 0;
    }

}
