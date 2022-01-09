package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Deque;

// 덱
// https://www.acmicpc.net/problem/10866
public class Deque_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        DequeImpl deque = new DequeImpl();
        String[] commands = new String[N];
        for(int i = 0; i < N; i++)
        {
             commands[i] = br.readLine();
        }

//        for(int i = 0; i < N; i++)
//        {
//            String[] command = commands[i].split(" ");
//
//            switch (command[0]){
//                case "push_front" :
//                    deque.push_front(Integer.parseInt(command[1]));
//                    break;
//                case "push_back" :
//                    deque.push_back(Integer.parseInt(command[1]));
//                    break;
//                case "pop_front" :
//                    System.out.println(deque.pop_front());
//                    break;
//                case "pop_back" :
//                    System.out.println(deque.pop_back());
//                    break;
//                case "size" :
//                    System.out.println(deque.size());
//                    break;
//                case "empty" :
//                    System.out.println(deque.empty());
//                    break;
//                case "front" :
//                    System.out.println(deque.front());
//                    break;
//                case "back" :
//                    System.out.println(deque.back());
//                    break;
//            }
//        }// end for

        Deque<Integer> deque02 = new LinkedList<>();
        for(int i = 0; i < N; i++)
        {

            String[] command = commands[i].split(" ");

            switch (command[0]){
                case "push_front" :
                    deque02.addFirst(Integer.parseInt(command[1]));
                    break;
                case "push_back" :
                    deque02.addLast(Integer.parseInt(command[1]));
                    break;
                case "pop_front" :
                    System.out.println(deque02.peekFirst() == null? -1 : deque02.pollFirst());
                    break;
                case "pop_back" :
                    System.out.println(deque02.peekLast() == null? -1 : deque02.pollLast());
                    break;
                case "size" :
                    System.out.println(deque02.size());
                    break;
                case "empty" :
                    System.out.println(deque02.isEmpty()? 1 : 0);
                    break;
                case "front" :
                    System.out.println(deque02.peekFirst() == null? -1 : deque02.peekFirst());
                    break;
                case "back" :
                    System.out.println(deque02.peekLast() == null? -1 : deque02.peekLast());
                    break;
            }
        }

    }
}

class DequeImpl{

    private Node front;
    private Node back;
    private int size;

    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
        }
    }

    // push_front X: 정수 X를 덱의 앞에 넣는다.
    public void push_front(int inputData){

        Node node = new Node(inputData);

        if(front == null && back == null)
        {
            front = node;
            front.next = node;
            back = node;
            back.prev = node;
            size = 1;
            return;
        }

        front.prev = node;
        Node tempNode = front;
        front = node;
        front.next = tempNode;
        size++;

    }

    // push_back X: 정수 X를 덱의 뒤에 넣는다.
    public void push_back(int inputData){

        Node node = new Node(inputData);

        if(front == null && back == null)
        {
            front = node;
            front.next = node;
            back = node;
            back.prev = node;
            size = 1;
            return;
        }

        back.next = node;
        Node tempNode = back;
        back = node;
        back.prev = tempNode;
        size++;

    }

    // pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int pop_front(){
        int returnData = -1;
        if(front != null)
        {
            returnData = front.data;
            front = front.next;
            size--;
            if(size <= 0){
                front = null;
                back = null;
            }
        }
        return returnData;
    }

    // pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int pop_back(){
        int returnData = -1;
        if(back != null)
        {
            returnData = back.data;
            back = back.prev;
            size--;
            if(size <= 0){
                front = null;
                back = null;
            }
        }
        return returnData;
    }

    // size: 덱에 들어있는 정수의 개수를 출력한다.
    public int size(){
        return this.size;
    }

    // empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
    public int empty(){
        return (this.size == 0)? 1 : 0;
    }

    // front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int front(){
        return (front == null && back == null)? -1 : front.data;
    }

    // back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public int back(){
        return (front == null && back == null)? -1 : back.data;
    }

}