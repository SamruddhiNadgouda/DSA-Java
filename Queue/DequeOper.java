import java.util.*;
import java.util.LinkedList;

public class DequeOper {
    static class Stack {
        Deque<Integer> deque = new java.util.LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peak(){
            return deque.getLast();
        }
        
    }
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data){
            deque.addLast(data);
        }
        public int remove(){
            return deque.removeLast();
        }
        public int peak(){
            return deque.getFirst();
        }
    }
    public static void main(String[] args) {
        // Deque<Integer> deque = new LinkedList<>();
        // deque.addFirst(1);
        // deque.addFirst(2);
        // deque.addLast(3);
        // deque.addLast(4);
        // System.out.println(deque);
        // deque.removeFirst();
        // deque.removeLast();
        // System.out.println(deque);
        // deque.addLast(5);
        // deque.addLast(7);
        // System.out.println(deque);
        // System.out.println("first ele: "+ deque.getFirst());
        // System.out.println("last ele: "+ deque.getLast());

        // [2, 1, 3, 4]
        // [1, 3]
        // [1, 3, 5, 7]
        // first ele: 1
        // last ele: 7

        //Stack using deque
        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.err.println("peak: "+ s.peak());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        //Queue using deque
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("peak: "+ q.peak());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
