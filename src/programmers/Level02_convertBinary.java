package programmers;

import java.util.Arrays;

// 이진 변환 반복하기
public class Level02_convertBinary {

    public static void main(String[] args) {
        int[] answer =  solution("110010101001"); // 3, 8
        for(int a : answer){
            System.out.print(a + " ");
        }
        System.out.println("\n--------------");

        int[] answer2 =  solution("01110"); // 3, 3
        for(int a : answer2){
            System.out.print(a + " ");
        }
        System.out.println("\n--------------");

        int[] answer3 =  solution("1111111"); // 4, 1
        for(int a : answer3){
            System.out.print(a + " ");
        }
        System.out.println("\n--------------");


        int[] answer4 =  solution("000001"); // 1, 5
        for(int a : answer4){
            System.out.print(a + " ");
        }
        System.out.println("\n--------------");
    }


    public int[] solution01(String s) {
        int[] answer = new int[2];
        int temp;
        while( !s.equals("1") ) {
            answer[1] += s.length();
            s = s.replaceAll("0", "");
            temp = s.length();
            s = Integer.toBinaryString(temp);
            answer[0]++;
            answer[1] -= temp;
        }
        return answer;
    }

    public static int[] solution(String s) {
        int[] answer = new int[2];
        StringBuilder sb = new StringBuilder(s);

        while(!sb.toString().equals("1")){

            int count = 0;
            for (int i = 0; i < sb.length(); i++) {
                if(sb.charAt(i) == '0'){
                    count++;
                    sb.deleteCharAt(i--);
                }
            }

            sb = new StringBuilder(Integer.toBinaryString(sb.length()));

            answer[0] += 1;
            answer[1] += count;
        }

        return answer;
    }

}
