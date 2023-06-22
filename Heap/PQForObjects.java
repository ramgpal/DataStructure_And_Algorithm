import java.util.*;
public class PQForObjects {
    public static class Student implements Comparable<Student> {
        String name;
        int rank;
        
        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank; 
        }
        
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        
        // Adding students to the priority queue
        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));
        
        // Removing and printing students from the priority queue
        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name + "->" + pq.peek().rank);
            pq.remove();
        }
    }
}
