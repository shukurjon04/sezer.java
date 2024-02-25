import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayDeque;
import java.util.*;
import java.util.Queue;
import java.util.Deque;
public class ikkitomonlamanavbat {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>(Arrays.asList(10, 20, 30, 40, 50));
        Deque<Integer> kiritish = new ArrayDeque<>();
        kiritish.add(14);
        kiritish.add(89);
        kiritish.add(99);
        kiritish.add(63);
        kiritish.add(25);
        kiritish.add(33);
        System.out.println("navbat : "+kiritish);
        int first = kiritish.removeFirst();
        int last = kiritish.removeLast();
        System.out.println(dq.getClass());
        kiritish.getFirst();
        kiritish.getClass();
        System.out.println("navbat olingan elementlari : "+first+" va "+last);
    }
}
