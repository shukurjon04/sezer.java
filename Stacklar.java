import java.util.Stack;

public class Stacklar {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        for (int i = 5; i <=9; i+=2) {
            stack.push(i);
        }
        while (!stack.empty())
        {
            System.out.println("Stekdan o'chirilayotgan element: "+stack.pop());
        }
        if (stack.empty()){
            System.out.println(
                    "stack bo'shatildi  elementlari mavjud emas "
            );
        }
        else {
            System.out.println("stackda "+stack.size()+" ta element mavjud");
        }

    }
}
