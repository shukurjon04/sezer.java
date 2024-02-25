import java.util.Locale;
import java.util.Scanner;

public class stringphyton {
    public static void main(String[] args) {
        String a = "shukurjon";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        String boshharf = a.substring(0,1).toUpperCase();
        String qolganharflar = a.substring(1);
        String yangisatr = boshharf.concat(qolganharflar);
        System.out.println(yangisatr);
        System.out.println(qolganharflar);
        System.out.println(boshharf);
        Scanner input = new Scanner(System.in);
        System.out.println("kirit ");
        int chegara = input.nextInt();
        boolean tubmi;
        for (int  i = 2; i<=chegara; i++) {
            tubmi = true;
            for (int j = 2; j<i ; j++) {
                if (i%j==0) {
                    tubmi = false;
                   break;
                }
            }
            if (tubmi){
                System.out.printf("%d,",i);
            }
        }

    }
}
