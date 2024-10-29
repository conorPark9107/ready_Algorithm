package programmers;

import java.util.HashMap;

// 추억 점수
// https://school.programmers.co.kr/learn/courses/30/lessons/176963
public class Level01_memoryScore {

    public static void main(String[] args) {
        int[] arr = solution(new String[]{"may", "kein", "kain", "radi"},
                             new int[]{5, 10, 1, 3},
                             new String[][]{{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}});
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        arr = solution( new String[]{"kali", "mari", "don"},
                        new int[]{11, 1, 55},
                        new String[][]{{"kali", "mari", "don"}, {"pony", "tom", "teddy"}, {"con", "mona", "don"}});
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        arr = solution( new String[]{"may", "kein", "kain", "radi"},
                        new int[]{5, 10, 1, 3},
                        new String[][]{{"may"},{"kein", "deny", "may"}, {"kon", "coni"}});
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int sumScore = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if(map.containsKey(photo[i][j])){
                    sumScore += map.get(photo[i][j]);
                }
            }
            answer[i] = sumScore;
        }
        return answer;
    }

}
