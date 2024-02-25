import java.lang.reflect.Array;
import java.util.Scanner;

public class qidiruvalgoritmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=0;
        for (int i = 10; i <100 ; i++) {
            n++;
        }
        int[] a =new int[n];
        for (int i = 10; i <100 ; i++) {
            a[i-10] = i;
        }
        System.out.print("qidirmoqchi soningizni kiriting : ");
        int b = input.nextInt();
        int natija = qidiruv(a , a.length,b);
        if (natija>=0)
            System.out.println(a[natija]+" soni "+natija+" o'rinda turibdi ");
        else
            System.out.println(" bu son to'plamda mavjud emas ");


    }

    private static int qidiruv(int array[] , int size , int search) {
        for (int i = 0; i < size; i++) {
            if (search == array[i])
                return i;
        }
        return -1;
    }
}
