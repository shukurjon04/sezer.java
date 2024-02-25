import java.util.*;
public class dequeclashs {
    public static void main(String[] args) {
        Deque<Integer> kirit = new ArrayDeque<>();
        kirit.add(14);
        kirit.add(89);
        kirit.add(99);
        kirit.add(63);
        kirit.add(25);
        kirit.add(33);
        kirit.removeFirst();
        System.out.println(kirit.getFirst());
    }
}
