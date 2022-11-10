public class GCD {

    public static void main(String[] args) {

        int a = 153, b = 20;
        int x = dogcd(a, b);
        System.out.println(x);
    }

    private static int dogcd(int a, int b) {
        return b == 0 ? a : dogcd(b, a % b);
    }
}
