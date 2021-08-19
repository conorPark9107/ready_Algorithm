package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 촌수계산
// https://www.acmicpc.net/problem/2644
public class BFS_2644 {
	
	public static LinkedList<ArrayList<Integer>> list;
	public static int persons;
	public static int[] distance;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int persons = parse(br.readLine());
		
		StringTokenizer token = new StringTokenizer(br.readLine());
		int x = parse(token.nextToken())-1;
		int y = parse(token.nextToken())-1;
		int m = parse(br.readLine());
		
		list = new LinkedList<>();
		distance = new int[persons];
		
		for(int i = 0; i < persons; i++) {
			list.add(new ArrayList<>());
		}
		for(int i = 0; i < m; i++) {
			token = new StringTokenizer(br.readLine());
			int a = parse(token.nextToken())-1;
			int b = parse(token.nextToken())-1;
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		int level = bfs(x, y);
		System.out.println(level);

	}
	
	private static int bfs(int x, int y) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(x);
		distance[x] = 0;
		
		while(!queue.isEmpty()) {
			int now = queue.poll();
			
			ArrayList<Integer> l = list.get(now);
			for(int i = 0; i < l.size(); i++) {
				int pick = l.get(i);
				if(distance[pick] == 0) {
					distance[pick] = distance[now]+1;
					if(pick == y) {
						queue.clear();
						break;
					}
					queue.offer(pick);
					
				}
			}	
		}
		
		return distance[y] > 0? distance[y] : -1;
	}

	public static int parse(String str) {
		return Integer.parseInt(str);
	}

}
