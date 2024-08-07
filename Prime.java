import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.println("Enter Any Number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.print("Number is Prime Number");
        } else {
            System.out.print("Not a Prime Number");
        }

    }
}
