package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;


// 소인수분해
// https://www.acmicpc.net/problem/11653
public class Backjoon_11653 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        if(n == 1) return;

        int count = 2;
        while(n >= 2){

            if(n % count == 0){
                n /= count;
                list.add(count);
                count = 2;
                continue;
            }

            count++;
        }

        Collections.sort(list);

        for(Integer i : list){
            System.out.println(i);
        }


    }
}
