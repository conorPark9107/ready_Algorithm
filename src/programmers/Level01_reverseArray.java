package programmers;

public class Level01_reverseArray {

    public static void main(String[] args) {
        int[] arr = solution(10000000000L);
        for (int a : arr) {
            System.out.println(a);
        }
    }

    public static int[] solution(long n) {
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        for(int i = 1; i <= s.length(); i++){
            answer[i-1] = Character.getNumericValue(s.charAt(s.length() - i));
        }

//        for(int i = 1; i <= s.length(); i++){
//            answer[i-1] = s.charAt(s.length() - i) - '0';
//        }

        return answer;
    }

}
