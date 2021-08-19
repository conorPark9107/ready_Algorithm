package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://www.acmicpc.net/problem/10845
public class Queue_10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer tokens;
		
		Queue queue = new Queue(n);
		for(int i = 0; i < n; i++) 
		{
			tokens = new StringTokenizer(br.readLine());
			String command = tokens.nextToken();
			switch (command) {
				case "push"	: 
					int number = Integer.parseInt(tokens.nextToken());
					queue.push(number); 
				break;
				case "pop"	: 
					System.out.println(queue.pop());	 
					break;
				case "size"	: 
					System.out.println(queue.size()); 
					break;
				case "empty": 
					System.out.println(queue.empty()); 
					break;
				case "front": 
					System.out.println(queue.front()); 
					break;
				case "back"	: 
					System.out.println(queue.back());	 
					break;
			}
		}
	}

}
class Queue{
	
	int front;
	int rear;
	int[] array;
	
	
	public Queue(int size) {
		this.front = 0;
		this.rear = 0;
		this.array = new int[size];
	}
	
	public void push(int x) {
		array[rear++] = x;
	}
	
	public int pop() {
		if(rear == front) {
			return -1;
		}
		return array[front++];
	}
	
	
	public int size() {
		return rear-front;
	}
	
	public int empty() {
		if(rear == front) {
			return 1;
		}
		return 0;
	}
	
	public int front() {
		if(rear == front) {
			return -1;
		}
		return array[front];
	}
	
	public int back() {
		if(rear == front) {
			return -1;
		}
		return array[rear-1];
	}
	
}