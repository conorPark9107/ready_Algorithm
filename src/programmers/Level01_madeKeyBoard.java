package programmers;

// 대충만든 자판
// https://school.programmers.co.kr/learn/courses/30/lessons/160586
public class Level01_madeKeyBoard {

    public static void main(String[] args) {
        int[] answer = solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD","AABB"});
        for (int x : answer) {
            System.out.print(x + " ");
        }
        System.out.println();

        answer = solution(new String[]{"AA"}, new String[]{"B"});
        for (int x : answer) {
            System.out.print(x + " ");
        }
        System.out.println();

        answer = solution(new String[]{"AGZ", "BSSS"}, new String[]{"ASA","BGZ"});
        for (int x : answer) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for (int i = 0; i < targets.length; i++) {
            String str = targets[i];

            for (int j = 0; j < str.length();  j++) {
                char c = str.charAt(j);

                int iAns = 101;
                for (String s : keymap) {
                    int x = s.indexOf(c);
                    if(x != -1){
                        iAns = Math.min(iAns, x + 1);
                    }
                }

                if(iAns == 101){
                    answer[i] = -1;
                    break;
                }else{
                    answer[i] += iAns;
                }
            }
        }
        return answer;
    }
}
