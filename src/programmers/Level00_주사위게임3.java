package programmers;


// 주사위게임 3
// https://school.programmers.co.kr/learn/courses/30/lessons/181916
public class Level00_주사위게임3 {

    public static void main(String[] args) {
        System.out.println(solution(2, 2, 2, 2)); // 2222
        System.out.println(solution(4, 1, 4, 4)); // 1681
        System.out.println(solution(6, 3, 3, 6)); // 27
        System.out.println(solution(2, 5, 2, 6)); // 30
        System.out.println(solution(6, 4, 2, 5)); // 2
    }

    public static int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] arr = new int[7];
        arr[a]++;
        arr[b]++;
        arr[c]++;
        arr[d]++;



        return answer;
    }


//    public static int solution(int a, int b, int c, int d) {
//        int answer = 0;
//        int[] arr = new int[7];
//        arr[a]++;
//        arr[b]++;
//        arr[c]++;
//        arr[d]++;
//
//        for (int i = 1; i < arr.length; i++) {
//            int count = arr[i];
//            if(count == 4){
//                return 1111 * i;
//            }else if(count == 3){
//                return (int) Math.pow(10 * i + get1Q(arr), 2);
//            }else if(count == 2) {
//                int count2 = 1;
//                int y = 0;
//                for (int j = i + 1; j < arr.length; j++){
//                    if(arr[j] == 2){
//                        count2++;
//                        y = j;
//                    }else if(arr[j] == 1){
//                        y = 1;
//                        y *= j;
//                    }
//                }
//                if(count2 == 2){
//                    return (i + y) * Math.abs(i - y);
//                }else{
//                    return y;
//                }
//            }
//        }
//        return answer;
//    }
//
//    private static int get1Q(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] == 1) return i;
//        }
//        return 0;
//    }
}

