package programmers;

public class Level00_컨트롤제트 {

    public static void main(String[] args) {
        System.out.println(solution("1 2 Z 3")); // 4
        System.out.println(solution("10 20 30 40")); // 100
        System.out.println(solution("10 Z 20 Z 1")); // 1
        System.out.println(solution("10 Z 20 Z")); // 0
        System.out.println(solution("-1 -2 -3 Z")); // -3
    }

    public static int solution(String s) {
        int answer = 0;
        int prev = 0;
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            String a = arr[i];
            if(a.equals("Z")){
                answer -= prev;
                prev = 0;
            }
            else{
                int num = Integer.parseInt(a);;
                answer += num;
                prev = num;
            }
        }

        return answer;
    }

}
