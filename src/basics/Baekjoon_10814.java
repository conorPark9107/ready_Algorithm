package basics;


import java.io.*;
import java.util.*;

// 나이순 정렬
// https://www.acmicpc.net/problem/10814
public class Baekjoon_10814 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Person> list = new ArrayList<>();

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            Person p = new Person();
            p.age = Integer.parseInt(st.nextToken());
            p.name = st.nextToken();
            list.add(p);
        }

        Collections.sort(list, (o1, o2) -> {
            return o1.age - o2.age;
        });

        for (Person p : list) {
            System.out.println(p.age + " " + p.name);
        }
    }

    public static class Person{
        String name;
        int age;
    }

}
