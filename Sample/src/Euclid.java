public class Euclid {
    public static int gcd(int p, int q) {
        System.out.println("p = " + p + " q = " + q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
    public static void main(String[] args)
    {
        //System.out.println(gcd(105, 24));
        System.out.println(gcd(1111111, 123456));
        //System.out.println(gcd(100,10));
    }
}
