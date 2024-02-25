public class malumotlartuzilamsi4topshiriq {
    public static void main(String[] args) {
        int[] a = {68, 43, 11, 32, 71, 57, 84, 45, 36};
        for (int i = a.length-1; i >1; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j]>a[j+1]){
                    int d ;
                    d=a[j];
                    a[j] =a[j+1];
                    a[j+1]=d;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
