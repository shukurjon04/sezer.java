import java.util.*;
import java.util.LinkedList;
import java.util.Queue;
import java.net.http.HttpResponse;

public class chiziqlimalumotlarstructurasi {
    public static void main(String[] args) {
        Queue <Integer> navbat = new LinkedList<>();
        navbat.add(15);
        navbat.add(17);
        navbat.add(3);
        navbat.add(5);
        navbat.add(15);
        navbat.add(18);
        while (!navbat.isEmpty()){
            System.out.println(navbat.peek());
            navbat.poll();
        }
    }
}
