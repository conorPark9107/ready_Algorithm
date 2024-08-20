package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon_3009 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] array = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sarr = br.readLine().split(" ");
            array[i][0] = Integer.parseInt(sarr[0]);
            array[i][1] = Integer.parseInt(sarr[1]);
        }

        int x = array[0][0] ^ array[1][0] ^ array[2][0];
        int y = array[0][1] ^ array[1][1] ^ array[2][1];

        System.out.println(x + " " + y);


    }
}
