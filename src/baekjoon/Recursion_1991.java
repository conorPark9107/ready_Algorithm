package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_1991 {
	
	public static Node[] tree;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		tree = new Node[N];
		
		for(int i = 0; i < N; i++) {
			tree[i] = new Node((char)('A' + i));
		}
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine().replaceAll(" ", "");
			
			Node n = tree[s.charAt(0) - 'A'];
			n.left = new Node(s.charAt(1));
			n.right = new Node(s.charAt(2));
			
			tree[s.charAt(0) - 'A'] = n;
		}
		
		preorder(0); // 전위 순회
		System.out.println();
		
		inorder(0); // 중위 순회
		System.out.println();
		
		postorder(0); // 후위 순회
	}

	private static void preorder(int i) {
		Node node = tree[i];
		System.out.print(node.data);
		if(node.left.data != '.') preorder(node.left.data - 'A');
		if(node.right.data != '.') preorder(node.right.data - 'A');
	}
	
	private static void inorder(int i) {
		Node node = tree[i];
		if(node.left.data != '.') inorder(node.left.data - 'A');
		System.out.print(node.data);
		if(node.right.data != '.') inorder(node.right.data - 'A');
	}
	
	private static void postorder(int i) {
		Node node = tree[i];
		if(node.left.data != '.') postorder(node.left.data - 'A');
		if(node.right.data != '.') postorder(node.right.data - 'A');
		System.out.print(node.data);
	}
}

class Node{
	public char data;
	public Node left, right;
	
	public Node(char data) {
		this.data = data;
	}
}
