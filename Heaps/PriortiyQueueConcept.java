import java.util.*;

public class PriortiyQueueConcept {
    static class Student implements Comparable<Student>{ //overriding
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // pq.add(3); //O(logn)
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);

        // while (!pq.isEmpty()) {
        //     System.out.print(pq.peek()+" "); //O(1)
        //     pq.remove(); //O(logn)
        // }
        // PriorityQueue<Student> pq = new PriorityQueue<>();

        // pq.add(new Student("A", 4)); //O(logn)
        // pq.add(new Student("B", 8));
        // pq.add(new Student("X", 2));
        // pq.add(new Student("P", 1));

        // while (!pq.isEmpty()) {
        //     System.out.println(pq.peek().name+" -> "+pq.peek().rank); //O(1)
        //     pq.remove(); //O(logn)
        // }
    }
}
