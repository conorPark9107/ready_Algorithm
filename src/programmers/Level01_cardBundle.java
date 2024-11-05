package programmers;

public class Level01_cardBundle {

    public static void main(String[] args) {
        String answer = solution(new String[]{"i", "drink", "water"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        System.out.println(answer);

        answer = solution(new String[]{"i", "water", "drink"}, new String[]{"want", "to"}, new String[]{"i", "want", "to", "drink", "water"});
        System.out.println(answer);
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int index1 = 0;
        int index2 = 0;
        int count = 0;

        for (String word : goal) {

            if(index1 < cards1.length){
                if (cards1[index1].equals(word)) {
                    count++;
                    index1++;
                    continue;
                }
            }

            if(index2 < cards2.length) {
                if (cards2[index2].equals(word)) {
                    count++;
                    index2++;
                } else {
                    return "No";
                }
            }
        }

        return (count == goal.length)? "Yes" : "No";
    }
}
