import java.util.Scanner;

public class sezer {
    public static void main(String[] args) {
        boolean m = true;
        while (m) {
            Scanner input = new Scanner(System.in);
            System.out.print("ochiq matnni kiriting : ");
            String a = input.nextLine();
            a = a.toUpperCase();
            System.out.print("kalitni kiriting : ");
            int k = input.nextInt();
            if ( a.toLowerCase()== "stop"){
                  m = false;
             }
            if (k != 26) {
                int[] x = new int[a.length()];
                char[] b = new char[a.length()];
                char[] c = new char[a.length()];
                for (int i = 0; i < a.length(); i++) {
                    b[i] = a.charAt(i);
                    x[i] = (int) b[i];
                    x[i] = x[i] - 65;
                }
                String sh = "";
                System.out.print("SHIFR MATN :  ");
                int[] shifr = new int[a.length()];
                double[] qoldiq = new double[a.length()];
                for (int i = 0; i < a.length(); i++) {
                    if ((x[i] + k) >= 26) {
                        qoldiq[i] = (x[i] + k) % 26;
                        shifr[i] = (int) qoldiq[i] + 65;
                        if (shifr[i] == 91) {
                            shifr[i] = 65;
                        }
                        c[i] = (char) shifr[i];
                        sh += c[i];
                    } else {
                        shifr[i] = x[i] + k + 65;
                        if (shifr[i] == 91) {
                            shifr[i] = 65;
                        }
                        c[i] = (char) shifr[i];
                        sh += c[i];
                    }
                }
                System.out.println(sh.toLowerCase());
                System.out.print("DESHIFR MATN :  ");
                String Deshifr = "";
                int[] deshifrs = new int[sh.length()];
                for (int i = 0; i < sh.length(); i++) {
                    b[i] = sh.charAt(i);
                    x[i] = (int) b[i];
                    x[i] = x[i] - 65;
                }
                for (int i = 0; i < sh.length(); i++) {
                    if (x[i] < k) {
                        while (k > 26) {
                            k = k % 26;
                        }
                        if ((x[i] - k) < 0) {
                            deshifrs[i] = x[i] - k + 26 + 65;
                        } else {
                            deshifrs[i] = x[i] - k + 65;
                        }
                        c[i] = (char) deshifrs[i];
                        Deshifr += c[i];
                    } else {
                        deshifrs[i] = x[i] - k + 65;
                        c[i] = (char) deshifrs[i];
                        Deshifr += c[i];
                    }
                }
                System.out.println(Deshifr.toLowerCase());


            } else
                System.out.println("kalit 26 ga teng bo'lsa shifrlanuvchi matn ochiq matnga teng bo'ladi : " + a.toLowerCase());

        }
    }
}
