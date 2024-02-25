import java.util.Scanner;

public class kunlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(" tugilgan kuningiz : ");
        int tugilgankun = input.nextInt();
        System.out.print(" tugilgan oyingiz : ");
        int tugilganoy = input.nextInt();
        System.out.print(" tugilgan yilingiz : ");
        int tugilganyil = input.nextInt();
        System.out.print(" hozirgi yil : ");
        int hozirgiyil = input.nextInt();
        System.out.print(" hozirgi kun : ");
        int bugungikun = input.nextInt();
        System.out.print(" hozirgi oy : ");
        int hozirgioy = input.nextInt();
        int kun = 0;
        int karralikun = 0;
        for (int i = tugilganyil+1; i <=hozirgiyil; i++) {
            kun++;
        }
       kun=kun*360;
        for (int i = tugilganyil+1; i <=hozirgiyil ; i++) {
            karralikun++;
            if (karralikun==4){
                kun=kun+1;
                karralikun=0;
            }
        }
        int k =0;
        int d=0;
        for (int i = tugilganoy; i <= 12; i++) {
            switch (tugilganoy){
                case 1 : k=31;break;
                case 2 : k=28;break;
                case 3 : k=31;break;
                case 4 : k=30;break;
                case 5 : k=31;break;
                case 6 : k=30;break;
                case 7 : k=31;break;
                case 8 : k=31;break;
                case 9 : k=30;break;
                case 10 : k=31;break;
                case 11 : k=30;break;
                case 12 : k=31;break;
            }
            for (int j = 0; j < 1; j++) {
                d=k-tugilgankun;
            }
            kun = kun + d+k;

        }
        k =0;
        for (int i = 12; i <= hozirgioy; i--) {
            switch (tugilganoy){
                case 1 : k=31;break;
                case 2 : k=28;break;
                case 3 : k=31;break;
                case 4 : k=30;break;
                case 5 : k=31;break;
                case 6 : k=30;break;
                case 7 : k=31;break;
                case 8 : k=31;break;
                case 9 : k=30;break;
                case 10 : k=31;break;
                case 11 : k=30;break;
                case 12 : k=31;break;
            }

            for (int j = 0; j < 1; j++) {
                d=k-bugungikun;
            }
            kun = kun + d+k;

        }
        System.out.println("ko'tingizga tiqqan kunlariz soni😁😁😁😁😁 : "+kun);
    }
}
