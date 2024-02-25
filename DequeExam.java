import java.util.*;

public class DequeExam {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(14);
        dq.add(89);
        dq.add(99);
        dq.add(63);
        dq.add(25);
        dq.add(33);
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq);
        System.out.println("The 2nd element is " + dq.getFirst());
        System.out.println("The 5th element is " + dq.getLast());
    }
}
    
