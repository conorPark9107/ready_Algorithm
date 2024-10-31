package programmers;


// 바탕화면 정리
// https://school.programmers.co.kr/learn/courses/30/lessons/161990
public class Level01_desktopCleanup {

    public static void main(String[] args) {
        int[] answer = solution(new String[]{".#...", "..#..", "...#."});
        for (int a : answer) {
            System.out.print(a + " ");
        }
        System.out.println();

        answer = solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."});
        for (int a : answer) {
            System.out.print(a + " ");
        }
        System.out.println();

        answer = solution(new String[]{".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."});
        for (int a : answer) {
            System.out.print(a + " ");
        }
        System.out.println();

        answer = solution(new String[]{"..", "#."});
        for (int a : answer) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        answer[0] = 51; // 좌상단 x
        answer[1] = 51; // 좌상단 y
        answer[2] = 0;  // 우하단 x
        answer[3] = 0;  // 우하단 y

        for (int i = 0; i < wallpaper.length; i++) {
            String line = wallpaper[i];

            if(!line.contains("#")) continue;

            answer[0] = Math.min(answer[0], i);
            answer[2] = Math.max(answer[2], i + 1);
            for(int j = 0; j < line.length(); j++){
                char c = line.charAt(j);
                if(c == '#'){
                    answer[1] = Math.min(answer[1], j);
                    answer[3] = Math.max(answer[3], j + 1);
                }
            }
        }
        return answer;
    }
}















