package programmers;

// 공원 걷기
// https://school.programmers.co.kr/learn/courses/30/lessons/172928
public class Level01_Walkinthepark {

    public static void main(String[] args) {
        int[] answer = solution(new String[]{"SOO", "OOO", "OOO"}, new String[]{"E 2", "S 2", "W 1"});
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();

        answer = solution(new String[]{"SOO","OXX","OOO"}, new String[]{"E 2","S 2","W 1"});
        for (int i : answer) {
            System.out.print(i + " ");
        }
        System.out.println();

        answer = solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"});
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        int[] position = findS(park);
        int x = position[0];
        int y = position[1];

        for (String route : routes) {
            String[] input = route.split(" ");
            String direction = input[0];
            int steps = Integer.parseInt(input[1]);

            int mx = 0;
            int my = 0;
            switch (direction) {
                case "N" -> mx = -1;
                case "S" -> mx = 1;
                case "W" -> my = -1;
                case "E" -> my = 1;
            }

            boolean ismove = true;
            for (int j = 1; j <= steps; j++) {
                int nx = x + mx * j;
                int ny = y + my * j;

                if (nx < 0 || nx >= park.length || ny < 0 || ny >= park[0].length() || park[nx].charAt(ny) == 'X') {
                    ismove = false;
                    break;
                }
            }
            if (ismove) {
                x = x + mx * steps;
                y = y + my * steps;
            }
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }

    private static int[] findS(String[] park) {
        int[] arr = new int[2];
        for(int i = 0; i < park.length; i++){
            String line = park[i];
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if(c == 'S'){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return null;
    }

}
