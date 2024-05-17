package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class backjoon_2745 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        String B = strArr[0];
        int N = Integer.parseInt(strArr[1]);

        int result = 0;
        for (int i = 0; i < B.length(); i++) {
            char c = B.charAt(B.length() - 1 - i);

            if (c > '9') {
                c = (char) (c - 'A' + 10);
            }else{
                c = (char) (c - '0');
            }

            int avg = 1;
            for(int j = 0; j < i; j++){
                avg = avg * N;
            }

            result += avg * c;


        }

        System.out.println(result);
    }

}