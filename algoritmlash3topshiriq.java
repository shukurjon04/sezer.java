public class algoritmlash3topshiriq {
    public static void main(String[] args) {
        double[] a = {-3.5,7.4,1.56,81,40,-0.15,20,-4.75,60,37.5};
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Math.sqrt(Math.abs(a[i]));
            System.out.println((i+1)+" chi elementning ildizi : "+b[i]);
        }
    }
}
