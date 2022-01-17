package baekjoon;

import java.io.*;
import java.util.Arrays;

public class Implement_11656 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        String[] array = new String[line.length()];

        for(int i = 0; i < line.length(); i++)
        {
            array[i] = line.substring(i, line.length());
        }

        Arrays.sort(array);

        for(int i = 0; i < array.length-1; i++)
        {
            bw.write(array[i]);
            bw.write("\n");
        }
        bw.write(array[array.length-1]);
        bw.flush();

    }

}
