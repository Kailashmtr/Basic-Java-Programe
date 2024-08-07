import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        int n, sum = 0;
        System.out.println("Enter Any Number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        for (int i = 0; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            System.out.println("Number is Perfect");
        } else {
            System.out.println("Number is not Perfect");
        }
    }
}
