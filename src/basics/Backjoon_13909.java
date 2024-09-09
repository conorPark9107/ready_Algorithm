package basics;

import java.io.*;


// 창문 닫기
// https://www.acmicpc.net/problem/13909
public class Backjoon_13909 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        System.out.println((int)Math.sqrt(n));
    }

}




// System.out.println((int)Math.sqrt(n));


//    boolean[] array = new boolean[n+1];
//
//        for (int i = 0; i < n; i++) {
//        for (int j = i; j <= n; j += i + 1) {
//        array[j] = !array[j];
//        }
//        System.out.print(i + 1 + " : ");
//        for (int j = 0; j < n; j++){
//        if(array[j]) System.out.print(1 + " ");
//        else System.out.print(0 + " ");
//        }
//        System.out.println();
//        }
//
//        int count = 0;
//        for (int i = 0; i < n; i++){
//        if(array[i]) count++;
//        }
//        System.out.println(count);