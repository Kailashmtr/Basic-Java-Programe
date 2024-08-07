import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter Two number");
        Scanner ref = new Scanner(System.in);
        a = ref.nextInt();
        b = ref.nextInt();
        if (a > b) {
            System.out.println("Maximum  number is " + " " + a);
        } else {
            System.out.println("Maximum number is " + " " + b);
        }
    }
}
