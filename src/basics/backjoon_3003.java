package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class backjoon_3003 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = br.readLine().split(" ");
        int n = inputArr.length;

        int[] status = {1, 1, 2, 2, 2, 8};
        int[] array = new int[n];
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(inputArr[i]);
            answer[i] = status[i] - array[i];
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < n; i++){
            sb.append(answer[i]).append(" ");
        }
        System.out.println(sb.delete(sb.length()-1, sb.length()).toString());

    }

}
