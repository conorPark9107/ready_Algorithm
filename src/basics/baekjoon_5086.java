package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class baekjoon_5086 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        while (true) {
            String[] inputArr = br.readLine().split(" ");
            int x = Integer.parseInt(inputArr[0]);
            int y = Integer.parseInt(inputArr[1]);

            if (x == 0 && y == 0) break;

            // 첫번째수가 두번째 수의 약수일 경우.
            if(y % x == 0){
                sb.append("factor").append("\n");
                continue;
            }

            if(x % y == 0){
                sb.append("multiple").append("\n");
                continue;
            }

            sb.append("neither").append("\n");
        }
        sb.delete(sb.length()-1, sb.length());
        System.out.println(sb.toString());

    }
}
