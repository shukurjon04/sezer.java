public class binarqidiruv5topshiriq {
    public static void main(String[] args) {
        char[] a = {'a','b','c','d','e','f','g'};
        char x = 'e';
        int natija = binarqidiruv(a,a.length,x);
        System.out.println(natija+1);
    }

    public static int binarqidiruv(char a[], int size , char x) {
        int b = 0;
        int o = size-1;
        int ort ;
        while (b <= o){
            ort =(b+o)/2;
            if (x==a[ort]){
                return ort;
            } else if (x>a[ort]) {
                b = ort +1;
            }else
                o = ort - 1;
        }
        return -1;
    }
}
