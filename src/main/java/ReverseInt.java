public class ReverseInt {
    public static void main(String[] args) {
        int num = 321;


        while (num > 0) {
            int rem = num % 10;
            System.out.println(rem);
            num = num / 10;
            // System.out.println(num);
        }
    }
}
