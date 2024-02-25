import java.util.Scanner;

public class djffrehfrehfiru {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("sonni kiriting : ");
            int a = input.nextInt();
            int d=0;
            for (int i = 1; i <= a; i++) {
                if(a%i==0){
                    d++;
                }

            }
            if (d==2){
                System.out.println("tub son");
            }
            else {
                System.out.println("tub son emas");
            }
        }
    }
}
