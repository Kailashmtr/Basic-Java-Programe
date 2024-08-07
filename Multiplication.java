import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Any Number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        for (int i = 1; i <= 10; i++) {
            n = n * i;
            System.out.println(n);
        }
    }
}
