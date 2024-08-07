import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        int n, count = 0;
        System.out.println("Enter any number");
        Scanner ref = new Scanner(System.in);
        n = ref.nextInt();
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
