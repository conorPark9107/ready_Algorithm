package basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 진법 변환 2
// https://www.acmicpc.net/problem/11005
public class backjoon_2745 {

    static char[] charactors = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        int num = Integer.parseInt(strArr[0]);
        int N = Integer.parseInt(strArr[1]);

        String result = "";

        while(num > 0){

            result += charactors[num % N];
            num /= N;

        }

        System.out.println(new StringBuffer(result).reverse());
    }

}