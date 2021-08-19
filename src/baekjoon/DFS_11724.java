package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class DFS_11724 {
	
	static LinkedList<LinkedList<Integer>> g;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = p(st.nextToken()); // 정점의 개수
		int M = p(st.nextToken()); // 간선의 개수
		
		visited = new boolean[N];
		g = new LinkedList<>();
		for(int i = 0; i < N; i++) g.add(new LinkedList<>());
		
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int x = p(st.nextToken())-1;
			int y = p(st.nextToken())-1;
			
			LinkedList<Integer> l1 = g.get(x);
			l1.addLast(y);
			g.add(l1);
			
			LinkedList<Integer> l2 = g.get(y);
			l2.addLast(x);
			g.add(l2);
		}
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			if(!visited[i]) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
		
	}
	
	private static void dfs(int i) {
		visited[i] = true;
		LinkedList<Integer> list = g.get(i);
		
		for(int j = 0; j < list.size(); j++) {
			
			Integer node = list.get(j);
			
			if(!visited[node]) dfs(node);
			
		}
	}

	public static int p(String s) {
		return Integer.parseInt(s);
	}

}
