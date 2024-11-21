package programmers;

public class Level01_Trio {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{-2, 3, 0, 2, -5}));
        System.out.println(solution(new int[]{-3, -2, -1, 0, 1, 2, 3}));
        System.out.println(solution(new int[]{-1, 1, -1, 1}));
    }

    public static int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++){
                for (int x = j + 1; x < number.length; x++) {
                    if(number[i] + number[j] + number[x] == 0) answer++;
                }
            }
        }

        return answer;
    }

}
