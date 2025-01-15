package programmers;

// 카펫
// https://school.programmers.co.kr/learn/courses/30/lessons/42842
public class Level02_carpet {

    public static void main(String[] args) {
        int[] answer = solution(10, 2); // [4, 3]
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------");

        int[] answer2 = solution(8, 1); // [3, 3]
        for (int i : answer2) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------");

        int[] answer3 = solution(24, 24); // [8, 6]
        for (int i : answer3) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------");

        int[] answer4 = solution(12, 4); // [4, 4]
        for (int i : answer4) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------");

        int[] answer5 = solution(32, 48); // [10, 8]
        for (int i : answer5) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------");

        int[] answer6 = solution(24, 25); // [7, 7]
        for (int i : answer6) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------");

        int[] answer7 = solution(18, 6); // [8, 3]
        for (int i : answer7) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------");
    }

    public static int[] solution(int brown, int yellow) {
        int[] answer = {};

        int sum = brown + yellow;
        for (int i = 3; i < brown / 2; i++) {
            for (int j = 3; j <= i; j++) {
                if(i * j == sum){
                    int yell = (i - 2) * (j - 2);
                    if(yellow == yell){
                        return new int[]{i, j};
                    }
                }
            }
        }

        return answer;
    }

}



























