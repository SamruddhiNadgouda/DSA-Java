import java.util.*;
import java.util.LinkedList;
public class QueueQue {
    static void generateBinary(int n){
        Queue<String> q = new LinkedList<>();

        q.add("1");
        while (n > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1+"0");
            q.add(s2+ "1");
            n--;
        }
    }

    static int minCost(int arr[], int n){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++){
            pq.add(arr[i]);
        }
        int res =0;
        System.out.println(pq);
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            res += first+second;
            pq.add(first+second);
            System.out.println(pq);
        }

        return res;
    }   
    public static void main(String[] args) {
        //Generate Binary Numbers
        // int n =5;
        // generateBinary(n);
        // 1
        // 10
        // 11
        // 100
        // 101

        // Connect n ropes with minimum cost
        // int arr[] = {4, 3, 2, 6};
        int arr[] = {1, 2, 3};
        int size = arr.length;
        System.out.println("Total cost: " + minCost(arr, size));

        //Job Squencing Problem
    }
}
