import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n, r, c, s = 0;
        System.out.println("Enter Any Number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        c = n;
        while (n > 0) {
            r = n % 10;
            s = (s * 10) + r;
            n = n / 10;
        }
        if (s == c) {
            System.out.print("Palindrome number");
        } else {
            System.out.print("Not a Palindrome number");
        }
    }
}
