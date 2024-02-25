public class malumotlartuzilmasi1topshiriq {
    public static void main(String[] args) {
        int a=100,b=10,c=5;
        for (int i = 0; i < 2; i++) {
            a+=(b/c);
        }
        for (int i = 0; i < 1; i++) {
            b*=c;
        }
        for (int i = 0; i <1 ; i++) {
            c+=a;
            for (int j = 0; j < 4; j++) {
                c+=b/b;
            }
        }
        System.out.println(a+" "+b+" "+c);
    }
}
