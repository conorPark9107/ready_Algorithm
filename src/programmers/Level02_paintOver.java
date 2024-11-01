package programmers;


// 덧칠하기
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
public class Level02_paintOver {

    public static void main(String[] args) {
        int result = solution(8, 4, new int[]{2,3,6});
        System.out.println(result);

        result = solution(5, 4, new int[]{1,3});
        System.out.println(result);

        result = solution(4, 1, new int[]{1,2,3,4});
        System.out.println(result);

        result = solution(5, 2, new int[]{1,4,5});
        System.out.println(result);
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
        int start = section[0];

        for(int sect : section){
            if(start + m <= sect){
                start = sect;
                answer++;
            }
        }
        answer++;
        return answer;
    }
}
