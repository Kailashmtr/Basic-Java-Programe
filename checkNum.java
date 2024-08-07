import java.util.Scanner;

public class checkNum {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Any Number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        if (n > 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Not Positive Nor Negative");
        }
    }
}
