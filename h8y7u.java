import java.util.Scanner;

public class h8y7u {
    public static void main(String[] args) {
    /* *//*   4.“48”, “13”, “11”, “32”, “79”, “54”, “84”, “45”, “67” berilgan
        butun sonlarni ixtiyoriy saralash usuli orqali dasturi
        ishlab chiqilsin va taxlil qilinsin.*//*
        Scanner input = new Scanner(System.in);
        System.out.print("massiv elementlarini sonini kiriting :  ");
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + " -chi elementini kiriting : ");
            a[i] = input.nextInt();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    int d = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = d;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
*/

        int[] g = {22,26,14,52,4,45,84,75,15};
        int s = 9;
        for (int i = s - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (g[j] > g[j + 1]) {
                    int d = g[j];
                    g[j] = g[j + 1];
                    g[j + 1] = d;
                }
            }
        }
        for (int i = 0; i < s; i++) {
            System.out.println(g[i]);
        }
    }

}




